package com.web.automation.accelerators;

import java.io.File;
import java.io.FileInputStream;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.gmail.Gmail;
import com.google.api.services.gmail.GmailScopes;
import com.google.api.services.gmail.model.ListMessagesResponse;
import com.google.api.services.gmail.model.Message;

public class GmailAPI {
 String verificationCode = null;
// Application name. 
 private static final String APPLICATION_NAME = "Gmail API Java Quickstart";

//  Directory to store user credentials for this application.
 private static final java.io.File DATA_STORE_DIR = new java.io.File(System.getProperty("user.home"),
   ".credentials/gmail-java-quickstart");
		  
//  Global instance of the {@link FileDataStoreFactory}. 
 private static FileDataStoreFactory DATA_STORE_FACTORY;

// Global instance of the JSON factory. 
 private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();

// Global instance of the HTTP transport. 
 private static HttpTransport HTTP_TRANSPORT;

 /**
  * Global instance of the scopes required by this quickstart.
  *
  * If modifying these scopes, delete your previously saved credentials at
  * ~/.credentials/gmail-java-quickstart
  */
 private static final List<String> SCOPES = Arrays.asList(GmailScopes.GMAIL_LABELS, GmailScopes.MAIL_GOOGLE_COM,
   GmailScopes.GMAIL_MODIFY, GmailScopes.GMAIL_READONLY);

 static {
  try {
   HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
   DATA_STORE_FACTORY = new FileDataStoreFactory(DATA_STORE_DIR);
  } catch (Throwable t) {
   t.printStackTrace();
   System.exit(1);
  }
 }

 /**
  * Creates an authorized Credential object.
  * 
  * @return an authorized Credential object.
  * @throws Exception
  */
 public static Credential authorize() throws Exception {
  // Load client secrets.
  // InputStream in =
  // Quickstart.class.getResourceAsStream("C:/Users/dinran/Downloads/authorize.json");

  FileInputStream fileInputStream = new FileInputStream(new File(
    "C:\\RAC\\code\\code\\AppiumDemo\\testdata\\client_secret.json"));
  InputStreamReader reader = new InputStreamReader(fileInputStream);
  GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY, reader);

  // Build flow and trigger user authorization request.
  GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(HTTP_TRANSPORT, JSON_FACTORY,
    clientSecrets, SCOPES).setDataStoreFactory(DATA_STORE_FACTORY)
      // .setAccessType("offline")
      .build();
  Credential credential = new AuthorizationCodeInstalledApp(flow, new LocalServerReceiver()).authorize("user");
  System.out.println("Credentials saved to " + DATA_STORE_DIR.getAbsolutePath());
  return credential;
 }

 /**
  * Build and return an authorized Gmail client service.
  * 
  * @return an authorized Gmail client service
  * @throws Exception
  */
 public static Gmail getGmailService() throws Exception {
  Credential credential = authorize();
  return new Gmail.Builder(HTTP_TRANSPORT, JSON_FACTORY, credential).setApplicationName(APPLICATION_NAME).build();
 }

 public String verificationCode() throws Exception {
  // Build a new authorized API client service.
  Gmail service = getGmailService();
  String userId = "vantester1@gmail.com";
  String query = "";
  ListMessagesResponse response = service.users().messages().list(userId).execute();
  List<Message> messages = new ArrayList<Message>();
  while (response.getMessages() != null) {
   messages.addAll(response.getMessages());
   if (response.getNextPageToken() != null) {
    String pageToken = response.getNextPageToken();
    response = service.users().messages().list(userId).setQ(query).setPageToken(pageToken).execute();
   } else {
    break;
   }
  }

  System.out.println("mesagesid" + messages.get(0).toString());
  String messagenewID = messages.get(0).toString();
  String msgID = messagenewID.substring(7, 23);
  Message message = service.users().messages().get(userId, msgID).execute();
  System.out.println("Message snippet: " + message.getSnippet());

  for (Message message1 : messages) {
   System.out.println(message1.toString());
  }
  String verfi = message.getSnippet();
  String verificationCode = verfi.substring(70, 74);

  return verificationCode;

 }

}
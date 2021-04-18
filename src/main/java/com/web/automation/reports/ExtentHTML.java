package com.web.automation.reports;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.web.automation.utilities.CommonVariables;

public class ExtentHTML {

	/**
	 * @author ashish jain
	 * @description: This method adds a logo in extent reporting
	 * @throws IOException
	 */
	public static void createExtentHTML() throws IOException{
		try{
			String rootDir = new File(CommonVariables.extentReportPath.get()).toString().replace("\\", "/");
			String content = "";
			String content1 = "";
			String finalContent="";
			try {
				File fileDir = new File(rootDir);
				BufferedReader in = new BufferedReader(
						new InputStreamReader(
								new FileInputStream(fileDir), "UTF-8"));

				while ((content = in.readLine()) != null) {
					content1=content1+content;
				}

				in.close();
			}
			catch (UnsupportedEncodingException e)
			{
				System.out.println(e.getMessage());
			}
			catch (IOException e)
			{
				System.out.println(e.getMessage());
			}
			catch (Exception e)
			{
				System.out.println(e.getMessage());
			}
			String compLogo=System.getProperty("user.dir").replace("\\", "/")+"/lib/rac-logo.png";
			String clientLogo=System.getProperty("user.dir").replace("\\", "/")+"/lib/cigniti_logo.png";
			if(content1.contains("<div class='logo-container blue darken-2'>")){
				finalContent = content1.replaceAll("<div class='logo-container blue darken-2'>","<div class='log-container'>"
						+ "<table id='Logos' class='testData'>"
						+ "<colgroup>"
						+ "<col style='width: 1%' />"
						+ "<col style='width: 1%' />"
						+ "<col style='width: 1%' />"
						+ "<col style='width: 1%' />"
						+ "</colgroup>"
						+ "<thead>"
						+ "<tr class='content' height=\"2\">"
						+ "<th style=\"padding:0px;padding-left:0px\" class ='Logos' colspan='auto' rowspan='1' >"
						+ "<img style=\"margin:0px\" align ='left' src= "+clientLogo+">"
						+ "</img>"
						+ "</th>"
						+ "<th style=\"padding:0px\" class = 'Logos' colspan='auto' rowspan='1' >"
						+ "<img style=\"margin:0px\" align ='right' src= "+compLogo+"></img>"
						+"</th>"
						+"</tr>"
						+"</thead>"
						+"</table>").trim().replaceAll("<span>ExtentReports</span>","");
			}
			File file=new File(CommonVariables.extentReportPath.get());
			if (file.exists()) {
				file.delete();
			}
			if(System.getenv("jenkins_home")==null){
				String timestamp = new SimpleDateFormat("yyyy_MM_dd_hh_mm_sss_a").format(new Date());
				CommonVariables.extentReportPath.set(System.getProperty("user.dir").replace("\\", "/")+"/logs/Reports/local/ExtentReports_"+timestamp+".html");
			}else{
				String buildNumber=System.getenv("BUILD_NUMBER");
				CommonVariables.extentReportPath.set(System.getProperty("user.dir").replace("\\", "/")+"/logs/Reports/jenkins/ExtentReports_"+buildNumber+".html");
			}
			File fnew=new File(CommonVariables.extentReportPath.get().replace("\\", "/"));
			FileWriter f2 = new FileWriter(fnew, false);
			f2.write(finalContent);
			f2.flush();
			f2.close();
		}catch(Exception e){
			e.getLocalizedMessage();
		}
	}
}
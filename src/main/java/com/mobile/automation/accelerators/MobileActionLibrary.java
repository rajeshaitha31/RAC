package com.mobile.automation.accelerators;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.html5.Location;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.SessionNotFoundException;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

import com.github.genium_framework.appium.support.server.AppiumServer;
import com.github.genium_framework.server.ServerArguments;
import com.relevantcodes.extentreports.ExtentTest;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.logs.ExtentLogs;
import com.web.automation.utilities.CommonVariables;
import com.web.automation.utilities.ConfigManager;
import com.experitest.appium.*;

/**
 * @author ashish jain
 */
public class MobileActionLibrary {
	private DesiredCapabilities objAndroidCapabilities;
	public ExtentTest etest;
	public static AndroidDriver driver =null;
	public static SeeTestIOSDriver<SeeTestIOSElement> sdriver = null;
	public static SeeTestAndroidDriver<AndroidElement> Adriver = null;
	public int port = 4723;
	private String iOSAppPath;
	public ActionsLibrary actionLib;
	public static boolean DriverNoResetFlag;
	private WebDriverWait wait;
	private DesiredCapabilities objCapabilities;
	public static ExtentLogs extentLogs = new ExtentLogs();
	public String[] target;
	public static String userName;
	/**
	 * These objects are made non-static. The objects of this class are
	 * re-created at some point of time.
	 */
	public FileWriter fw;
	public PrintWriter pw;

	// Constructor with WebDriver argument
	public MobileActionLibrary(SeeTestIOSDriver appiumDriver) {
		this.sdriver = appiumDriver;
		initPropertiesFile();
	}
	
	// Constructor with WebDriver argument
		public MobileActionLibrary(SeeTestAndroidDriver Adriver) throws MalformedURLException {
			
			  objAndroidCapabilities = new DesiredCapabilities();
			  objAndroidCapabilities.setCapability(MobileCapabilityType.UDID, "ce0117110d5e3f0a05");
			  objAndroidCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME, MobileBrowserType.CHROME);
			  objAndroidCapabilities.setCapability(MobileCapabilityType.AUTO_WEBVIEW, true);
			  objAndroidCapabilities.setCapability("newCommandTimeout", 200);
			  this.Adriver = new SeeTestAndroidDriver(new URL("http://localhost:4723/wd/hub"), objAndroidCapabilities);
			  initPropertiesFile();
		}


	/**
	 * @author ashish jain
	 * @description: Intialize config properties
	 */
	private void initPropertiesFile() {
		 ConfigManager.setProperties();
		// TestEngineWeb.setExtentReportTest(etest);
		try {
			if (!ConfigManager.ArePropertiesSet.get()) {
				ConfigManager.getProperties();
			}
		} catch (Exception e) {
			e.getLocalizedMessage();
		}
	}

	public void launch(String url) {
		Adriver.get(url);
	}
	
	
	public void WebdriverWaitForPage(String time) {
		driver.manage().timeouts()
		.implicitlyWait(Long.parseLong(time), TimeUnit.SECONDS);
	}

	public void WebdriverWaitForPage() {
		WebdriverWaitForPage("180");
	}

	/**
	 * @author ashish jain
	 * @param appiumServerNode
	 * @param appiumServerPort
	 * @param bootStrapPort
	 * @param udid
	 * @param chromedriverPort
	 * @throws Exception
	 */
	public void startAppiumServer() throws Exception {
		ServerArguments serverArguments = new ServerArguments();
		serverArguments.setArgument("--address", ConfigManager.getProperties()
				.getProperty("appiumServerIP"));
		serverArguments.setArgument("--port", ConfigManager.getProperties()
				.getProperty("appiumPort"));
		serverArguments.setArgument("--log", String.format("C:/%s.txt",
				ConfigManager.getProperties().getProperty("androidDeviceId")));
		serverArguments.setArgument("--chromedriver-port", ConfigManager
				.getProperties().getProperty("chromedriverPort"));
		serverArguments.setArgument("--bootstrap-port", ConfigManager
				.getProperties().getProperty("bootStrapPort"));
		serverArguments.setArgument("--no-reset", true);
		serverArguments.setArgument("--local-timezone", true);
		AppiumServer _appiumServer = null;
		try {
			synchronized (MobileActionLibrary.class) {
				_appiumServer = new AppiumServer(new File(ConfigManager
						.getProperties().getProperty("appiumServerPath")),
						serverArguments);
				_appiumServer.startServer();
				Thread.sleep(2000);
			}
			extentLogs.info("Appium Server",
					"***** Appium Server strated successfully. *****");
		} catch (Exception e) {
			System.out.println("AppiumServer start Exception encounterd - "
					+ e.getMessage());
			extentLogs
			.error("Appium Server",
					"***** Error to start ppium Server strated successfully. *****");
			throw e;
		}
	}

	/**
	 * @author ashish jain
	 * @param appName
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public SeeTestIOSDriver StartAppiumDriver(String appName) {
		try {
			System.out.println("AppName :- " + appName);
			// iOSAppPath = appName;
			// File appDir = new File(System.getProperty("user.dir")+ "\\Tool");
			// File androidAppPath = new File(appDir, iOSAppPath.trim());
			objCapabilities = new DesiredCapabilities();
			// objCapabilities.setCapability(MobileCapabilityType.APP,
			// "C:\\Users\\IN01513\\AppData\\Roaming\\appiumstudio\\original-apks\\VAN_Kiosk (11).ipa");
			objCapabilities.setCapability(MobileCapabilityType.UDID,
					"af55fa770acde922746bbd53d9abbfe4c2a7f73e");
			objCapabilities.setCapability(IOSMobileCapabilityType.BUNDLE_ID,
					"com.rentacenter.acceptancenow.Kiosk");
			objCapabilities.setCapability(SeeTestCapabilityType.INSTRUMENT_APP,
					true);

			try {
				sdriver = new SeeTestIOSDriver<>(new URL("http://localhost:"
						+ port), objCapabilities);
				System.out
				.println("Session ID is...." + sdriver.getSessionId());
				sdriver.manage().timeouts()
				.implicitlyWait(60, TimeUnit.SECONDS);
				Thread.sleep(1500);
			} catch (org.openqa.selenium.SessionNotCreatedException ex) {
				try {
					Thread.sleep(3000);
					sdriver = new SeeTestIOSDriver<>(new URL(
							"http://localhost:" + port), objCapabilities);
					Thread.sleep(1500);
				} catch (Exception e) {
					e.printStackTrace();
				}
			} catch (UnreachableBrowserException e3) {
				try {
					Thread.sleep(2000);
					sdriver = new SeeTestIOSDriver<>(new URL(
							"http://localhost:" + port), objCapabilities);
					Thread.sleep(4000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			} catch (Exception e) {
				Assert.fail("***** Failed to start Appium Driver. Skipping further steps. ******");
			}
			return sdriver;
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * @author ashish jain
	 * @param appPath
	 * @param appPackage
	 * @param appActivityStart
	 * @return
	 */
	public AndroidDriver switchToAnotherApp(String appPath, String appPackage,
			String appActivityStart) {
		try {
			objCapabilities = new DesiredCapabilities();
			if (appPath != null && !appPath.isEmpty())
				objCapabilities.setCapability("app", appPath);
			objCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,
					MobilePlatform.ANDROID);
			objCapabilities.setCapability(
					MobileCapabilityType.DEVICE_NAME,
					ConfigManager.getProperties().getProperty(
							"androidDeviceName")); // Android Emulator
			// 4df1ad83692c7fef
			objCapabilities.setCapability("automationName", ConfigManager
					.getProperties().getProperty("androidAutomationName"));
			objCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME,
					"android");
			objCapabilities.setCapability("autoLaunch", true);
			objCapabilities.setCapability("deviceReadyTimeout", "300");
			objCapabilities.setCapability("androidDeviceReadyTimeout", "420");
			objCapabilities.setCapability("avdLaunchTimeout", "300000");
			objCapabilities.setCapability("newCommandTimeout", "600000");
			if (appPackage != null && !appPackage.isEmpty())
				objCapabilities.setCapability("appPackage", appPackage);
			if (appActivityStart != null && !appActivityStart.isEmpty())
				objCapabilities.setCapability("appActivity", appActivityStart);
			driver = new AndroidDriver(new URL("http://"
					+ ConfigManager.getProperties().getProperty(
							"appiumServerIP") + ":"
							+ ConfigManager.getProperties().getProperty("appiumPort")
							+ "/wd/hub"), objCapabilities);
			return driver;
		} catch (Exception e) {
			return driver;
		}
	}

	/**
	 * @author ashish jain
	 */
	public void ShutDownDriver() {
		if (sdriver != null) {
			try {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
				}
				Adriver.closeApp();
				//sdriver.quit();
				Adriver.quit();
			} catch (WebDriverException e) {
				try {
					Thread.sleep(2500);
				} catch (InterruptedException e1) {
				}
			}
		}
	}

	/**
	 * @author ashish jain
	 * @param mobBy
	 * @param timeoutInSeconds
	 * @return
	 */
	public WebElement FindElement(By mobBy, int timeoutInSeconds) {
		WebElement webElement;
		WebDriverWait wait;
		try {
			wait = new WebDriverWait(driver, timeoutInSeconds);
			webElement = wait.until(ExpectedConditions
					.presenceOfElementLocated(mobBy));
			try {
				if (webElement != null
						|| CommonVariables.TestCaseLog.get() != null) {
					extentLogs.pass(
							"Find Element",
							"Successfully find an element on '"
									+ driver.getTitle() + "' page.");
					CommonVariables.TestCaseLog.get().info(
							"Successfully find '" + mobBy + "' element on '"
									+ driver.getTitle() + "' page");
				} else {
					extentLogs.fail("Find Element", "Element not found on '"
							+ driver.getTitle() + "' page.");
					CommonVariables.TestClassLog.get().info(
							"Successfully find '" + mobBy + "' element on '"
									+ driver.getTitle() + "' page");
				}
			} catch (NullPointerException e) {
				extentLogs.error(
						"Find Element",
						"Element not found on '" + driver.getTitle()
						+ "' page due to exception - "
						+ e.getLocalizedMessage());
				throw new NullPointerException();
			} catch (org.openqa.selenium.ElementNotVisibleException e) {
				if (CommonVariables.TestCaseLog.get() != null) {
					CommonVariables.TestCaseLog.get().info(
							"Element (" + mobBy + ") is not visible on '"
									+ driver.getTitle() + "' page");
				} else {
					CommonVariables.TestClassLog.get().info(
							"Element (" + mobBy + ") is not visible on '"
									+ driver.getTitle() + "' page");
				}
				extentLogs.error(
						"Find Element",
						"Element not visible on '" + driver.getTitle()
						+ "' page due to exception - "
						+ e.getLocalizedMessage());
				throw new ElementNotVisibleException("Element not visible.");
			} catch (org.openqa.selenium.WebDriverException e) {
				if (CommonVariables.TestCaseLog.get() != null) {
					CommonVariables.TestCaseLog.get().info(
							"Failed to move Element (" + mobBy
							+ ") on the running driver type.");
				} else {
					CommonVariables.TestClassLog.get().info(
							"Failed to move Element (" + mobBy
							+ ") on the running driver type.");
				}
				extentLogs.error(
						"Find Element",
						"Failed to move to an Element due to exception - "
								+ e.getLocalizedMessage());
				throw new WebDriverException();
			}
			return webElement;
		} catch (Exception ex) {
			if (ex.getCause().toString().contains("SessionNotFoundException")) {
				throw new SessionNotFoundException();
			} else if (ex.getCause().toString()
					.contains("UnhandledAlertException")) {
				if (AcceptAlert()) {
					return driver.findElement(mobBy);
				}
				if (CommonVariables.TestCaseLog.get() != null) {
					CommonVariables.TestCaseLog.get().info(
							"caught 'UnhandledAlertException' exception while finding '"
									+ mobBy + "' element on '"
									+ driver.getTitle() + "' page");
				} else {
					CommonVariables.TestClassLog.get().info(
							"caught 'UnhandledAlertException' exception while finding '"
									+ mobBy + "' element on '"
									+ driver.getTitle() + "' page");
				}
				extentLogs.error("Find Element",
						"caught 'UnhandledAlertException' exception while finding an element on '"
								+ driver.getTitle() + "' page");
				throw new UnhandledAlertException("");
			} else if (ex.getCause().toString()
					.contains("NoSuchElementException")) {
				if (AcceptAlert()) {
					return driver.findElement(mobBy);
				}
				if (CommonVariables.TestCaseLog.get() != null) {
					CommonVariables.TestCaseLog.get().info(
							"No such element(" + mobBy + ") found on '"
									+ driver.getTitle() + "' page.");
				} else {
					CommonVariables.TestClassLog.get().info(
							"No such element(" + mobBy + ") found on '"
									+ driver.getTitle() + "' page at "
									+ driver.getTitle() + "' url.");
				}
				extentLogs.error(
						"Find Element",
						"No such element éxception found on '"
								+ driver.getTitle() + "' page at "
								+ driver.getTitle() + "' url.");
				throw new NoSuchElementException("No such Element");
			} else if (ex.getCause().toString().contains("TimeoutException")) {
				if (AcceptAlert()) {
					return driver.findElement(mobBy);
				} else {
					if (CommonVariables.TestCaseLog.get() != null) {
						CommonVariables.TestCaseLog.get().info(
								"No such element(" + mobBy + ") found on '"
										+ driver.getTitle() + "' page at "
										+ driver.getTitle()
										+ "' url within timelimit ("
										+ timeoutInSeconds + ").");
					} else {
						CommonVariables.TestClassLog.get().info(
								"No such element(" + mobBy + ") found on '"
										+ driver.getTitle() + "' page at "
										+ driver.getTitle()
										+ "' url within timelimit ("
										+ timeoutInSeconds + ").");
					}
					extentLogs.error(
							"Find Element",
							"No such element exception found on '"
									+ driver.getTitle() + "' page at "
									+ driver.getTitle()
									+ "' url within timelimit ("
									+ timeoutInSeconds + ").");
				}
				throw new TimeoutException();
			} else if (ex.getCause().toString()
					.contains("StaleElementReferenceException")) {
				if (CommonVariables.TestCaseLog.get() != null) {
					CommonVariables.TestCaseLog.get().info(
							"Info. Caught 'StaleElementReferenceException' exception while finding ("
									+ mobBy + ") element. Class: "
									+ ex.getClass());
				} else {
					CommonVariables.TestClassLog.get().info(
							"Info. Caught 'StaleElementReferenceException' exception while finding ("
									+ mobBy + ") element. Class: "
									+ ex.getClass());
				}
				extentLogs
				.error("Find Element",
						"Caught 'StaleElementReferenceException' exception while finding an element. Class: "
								+ ex.getClass());
			}
			AcceptAlert();
			try {
				webElement = driver.findElement(mobBy);
				return webElement;
			} catch (Exception e) {
				if (CommonVariables.TestCaseLog.get() != null) {
					CommonVariables.TestCaseLog.get().info(
							"Error. Caught 'StaleElementReferenceException' exception while finding ("
									+ mobBy + ") element. Exception Type: "
									+ e.getClass());
				} else {
					CommonVariables.TestClassLog.get().info(
							"Error. Caught 'StaleElementReferenceException' exception while finding ("
									+ mobBy + ") element. Exception Type: "
									+ e.getClass());
				}
				throw new StaleElementReferenceException(
						"Stale Exception while finding an element.");
			}
		}
	}

	/**
	 * @author ashish jain
	 * @param LocatorType
	 * @param LocatorString
	 * @param timeoutInSeconds
	 * @return
	 */
	public IOSElement FindIosElement(MobileLocator LocatorType,
			String LocatorString, int timeoutInSeconds) {
		IOSElement webElement;
		WebDriverWait wait;
		try {
			switch (LocatorType) {
			case ByAccessibilityId:
				if (timeoutInSeconds > 0) {
					wait = new WebDriverWait(sdriver, timeoutInSeconds);
					webElement = (IOSElement) wait.until(ExpectedConditions
							.presenceOfElementLocated(MobileBy
									.AccessibilityId(LocatorString)));
				} else {
					webElement = sdriver.findElement(MobileBy
							.AccessibilityId(LocatorString));
				}
				extentLogs.pass("Find Element",
						"Successfully find an element using locator type - "
								+ LocatorType + " and locator string - "
								+ LocatorString + ".");
				break;
			case ByXPath:
				if (timeoutInSeconds > 0) {
					wait = new WebDriverWait(sdriver, timeoutInSeconds);
					webElement = (IOSElement) wait.until(ExpectedConditions
							.presenceOfElementLocated(MobileBy
									.xpath(LocatorString)));
				} else {
					webElement = sdriver.findElement(MobileBy
							.xpath(LocatorString));
				}
				extentLogs.pass("Find Element",
						"Successfully find an element using locator type - "
								+ LocatorType + " and locator string - "
								+ LocatorString + ".");
				break;
			case ByClassName:
				if (timeoutInSeconds > 0) {
					wait = new WebDriverWait(driver, timeoutInSeconds);
					webElement = (IOSElement) wait.until(ExpectedConditions
							.presenceOfElementLocated(MobileBy
									.className(LocatorString)));
				} else {
					webElement = (IOSElement) driver.findElement(MobileBy
							.className(LocatorString));
				}
				extentLogs.pass("Find Element",
						"Successfully find an element using locator type - "
								+ LocatorType + " and locator string - "
								+ LocatorString + ".");
				break;
			case ById:
				if (timeoutInSeconds > 0) {
					wait = new WebDriverWait(driver, timeoutInSeconds);
					webElement = (IOSElement) wait.until(ExpectedConditions
							.presenceOfElementLocated(MobileBy
									.id(LocatorString)));
				} else {
					webElement = (IOSElement) driver.findElement(MobileBy
							.IosUIAutomation(LocatorString));
				}
				extentLogs.pass("Find Element",
						"Successfully find an element using locator type - "
								+ LocatorType + " and locator string - "
								+ LocatorString + ".");
				break;
			case AndroidUIAutomator:
				if (timeoutInSeconds > 0) {
					wait = new WebDriverWait(driver, timeoutInSeconds);
					webElement = (IOSElement) wait.until(ExpectedConditions
							.presenceOfElementLocated(MobileBy
									.AndroidUIAutomator(LocatorString)));
				} else {
					webElement = (IOSElement) driver.findElement(MobileBy
							.IosUIAutomation(LocatorString));
				}
				extentLogs.pass("Find Element",
						"Successfully find an element using locator type - "
								+ LocatorType + " and locator string - "
								+ LocatorString + ".");
				break;
			case ByName:
				if (timeoutInSeconds > 0) {
					wait = new WebDriverWait(driver, timeoutInSeconds);
					webElement = (IOSElement) wait.until(ExpectedConditions
							.presenceOfElementLocated(MobileBy
									.name(LocatorString)));
				} else {
					webElement = (IOSElement) driver.findElement(MobileBy
							.name(LocatorString));
				}
				extentLogs.pass("Find Element",
						"Successfully find an element using locator type - "
								+ LocatorType + " and locator string - "
								+ LocatorString + ".");
				break;
			default:
				return null;

			}
			return webElement;
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * @author ashish jain
	 * @param LocatorType
	 * @param LocatorString
	 * @param timeoutInSeconds
	 * @return
	 */
	public WebElement FindElement(MobileLocator LocatorType,
			String LocatorString, int timeoutInSeconds) {
		WebElement webElement;
		WebDriverWait wait;
		try {
			switch (LocatorType) {
			case ByAccessibilityId:
				if (timeoutInSeconds > 0) {
					wait = new WebDriverWait(sdriver, timeoutInSeconds);
					webElement = wait.until(ExpectedConditions
							.presenceOfElementLocated(MobileBy
									.AccessibilityId(LocatorString)));
				} else {
					webElement = sdriver.findElement(MobileBy
							.AccessibilityId(LocatorString));
				}
				extentLogs.pass("Find Element",
						"Successfully find an element using locator type - "
								+ LocatorType + " and locator string - "
								+ LocatorString + ".");
				break;
			case ByXPath:
				if (timeoutInSeconds > 0) {
					wait = new WebDriverWait(sdriver, timeoutInSeconds);
					webElement = wait.until(ExpectedConditions
							.presenceOfElementLocated(MobileBy
									.xpath(LocatorString)));
				} else {
					webElement = sdriver.findElement(MobileBy
							.xpath(LocatorString));
				}
				extentLogs.pass("Find Element",
						"Successfully find an element using locator type - "
								+ LocatorType + " and locator string - "
								+ LocatorString + ".");
				break;
			case ByClassName:
				if (timeoutInSeconds > 0) {
					wait = new WebDriverWait(sdriver, timeoutInSeconds);
					webElement = wait.until(ExpectedConditions
							.presenceOfElementLocated(MobileBy
									.className(LocatorString)));
				} else {
					webElement = sdriver.findElement(MobileBy
							.className(LocatorString));
				}
				extentLogs.pass("Find Element",
						"Successfully find an element using locator type - "
								+ LocatorType + " and locator string - "
								+ LocatorString + ".");
				break;
			case ById:
				if (timeoutInSeconds > 0) {
					wait = new WebDriverWait(driver, timeoutInSeconds);
					webElement = wait.until(ExpectedConditions
							.presenceOfElementLocated(MobileBy
									.id(LocatorString)));
				} else {
					webElement = driver.findElement(MobileBy
							.IosUIAutomation(LocatorString));
				}
				extentLogs.pass("Find Element",
						"Successfully find an element using locator type - "
								+ LocatorType + " and locator string - "
								+ LocatorString + ".");
				break;
			case AndroidUIAutomator:
				if (timeoutInSeconds > 0) {
					wait = new WebDriverWait(driver, timeoutInSeconds);
					webElement = wait.until(ExpectedConditions
							.presenceOfElementLocated(MobileBy
									.AndroidUIAutomator(LocatorString)));
				} else {
					webElement = driver.findElement(MobileBy
							.IosUIAutomation(LocatorString));
				}
				extentLogs.pass("Find Element",
						"Successfully find an element using locator type - "
								+ LocatorType + " and locator string - "
								+ LocatorString + ".");
				break;
			case ByName:
				if (timeoutInSeconds > 0) {
					wait = new WebDriverWait(driver, timeoutInSeconds);
					webElement = wait.until(ExpectedConditions
							.presenceOfElementLocated(MobileBy
									.name(LocatorString)));
				} else {
					webElement = driver.findElement(MobileBy
							.name(LocatorString));
				}
				extentLogs.pass("Find Element",
						"Successfully find an element using locator type - "
								+ LocatorType + " and locator string - "
								+ LocatorString + ".");
				break;
			default:
				return null;

			}
			return webElement;
		} catch (Exception e) {
			return null;
		}
	}

	public boolean waitforelementpresent(MobileElement element) {
		try {

			WebDriverWait wait = new WebDriverWait(sdriver, 60);
			wait.until(ExpectedConditions.elementToBeClickable(element));

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * @author ashish jain
	 * @param webElement
	 * @return
	 */
	public boolean ClearInputField(WebElement webElement) {
		try {
			IOSElement mobileWebElement = (IOSElement) webElement;
			mobileWebElement.clear();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * @author ashish jain
	 * @param webElement
	 * @param value
	 * @return
	 */
	public boolean type(IOSElement webElement, String value) {
		boolean state = false;
		try {
			try {
				// webElement.sendKeys(value);
				webElement.setValue(value);
				state = true;
				try {
					sdriver.hideKeyboard();
				} catch (WebDriverException e1) {
				}
			} catch (Exception e) {
				state = false;
			}
			extentLogs.pass("Type", "Successfully entered text value - '"
					+ value + "'.");
		} catch (Exception e) {
			extentLogs.error("Type", "Failed to enter text value - '" + value
					+ "' due to execption - " + e.getMessage() + ".");
			e.printStackTrace();
		}
		return state;
	}

	/**
	 * @author ashish jain
	 * @param webElement
	 * @param value
	 * @return
	 */
	public static boolean type(WebElement webElement, String value) {
		boolean state = false;
		try {
			try {
				webElement.sendKeys(value);
				state = true;
				try {
					sdriver.hideKeyboard();
				} catch (WebDriverException e1) {
				}
			} catch (Exception e) {
				state = false;
			}
			extentLogs.pass("Type", "Successfully entered text value - '"
					+ value + "'.");
		} catch (Exception e) {
			extentLogs.error("Type", "Failed to enter text value - '" + value
					+ "' due to execption - " + e.getMessage() + ".");
			e.printStackTrace();
		}
		return state;
	}

	/**
	 * @author ashish jain
	 * @param webElement
	 * @return
	 */
	public boolean AndroidTap(WebElement webElement) {
		try {
			AndroidElement elemIOS = (AndroidElement) webElement;
			elemIOS.tap(1, 4);
			extentLogs.pass("Tap", "Successfully tap on an element - "
					+ webElement + ".");
			return true;
		} catch (Exception e) {
			extentLogs.error("Tap", "Failed to tap on an element - "
					+ webElement + ".");
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * @author ashish jain
	 * @param webElement
	 * @return
	 */
	public static boolean click(WebElement webElement) {
		boolean state = false;
		try {
			// try { sdriver.hideKeyboard(); } catch (WebDriverException e1) { }
			webElement.click();
			extentLogs.pass("Click", "Successfully clicked element "
					+ webElement);
			try {
				Thread.sleep(2000);
				state = true;
			} catch (InterruptedException e) {
				extentLogs.error("Click", "Element " + webElement
						+ " is not clickable.");
			}
		} catch (Exception e) {
			extentLogs.error("Click", "Element " + webElement
					+ " is not clickable.");
		}
		return state;
	}
	
	
	
	public static boolean clickonelement(WebElement webElement,String Elementname) {
		boolean state = false;
		try {
			// try { sdriver.hideKeyboard(); } catch (WebDriverException e1) { }
			webElement.click();
			extentLogs.pass("Click", "Successfully clicked "
					+ Elementname);
			try {
				Thread.sleep(2000);
				state = true;
			} catch (InterruptedException e) {
				extentLogs.error("Click", "on " + Elementname
						+ " is not successful.");
			}
		} catch (Exception e) {
			extentLogs.error("Click", "on " + Elementname
					+ " is not successful.");
		}
		return state;
	}
	public static boolean context(String strcontext){
		
		Adriver.context(strcontext);
		return true;
		
	}
	
public static boolean setcontext(){
		System.out.println(Adriver.getContext());
		Adriver.context(Adriver.getContext());
		return true;
		
	}

	/**
	 * @author ashish jain
	 * @param webElement
	 * @return
	 */
	public boolean clickwebelement(WebElement webElement, String element) {
		boolean state = false;
		try {
			// try { sdriver.hideKeyboard(); } catch (WebDriverException e1) { }
			webElement.click();
			extentLogs.pass("Click", "Successfully clicked element " + element);
			try {
				Thread.sleep(2000);
				state = true;
			} catch (InterruptedException e) {
				extentLogs.error("Click", "Element " + element
						+ " is not clickable.");
			}
		} catch (Exception e) {
			extentLogs.error("Click", "Element " + element
					+ " is not clickable.");
		}
		return state;
	}

	/**
	 * @author ashish jain
	 * @param objWebElement
	 * @param attribute
	 * @return
	 */
	public String GetElementAttributeValue(WebElement objWebElement,
			String attribute) {
		return objWebElement.getAttribute(attribute);
	}

	/**
	 * @author ashish jain
	 * @return
	 */
	public boolean AcceptAlert() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * @author ashish jain
	 * @return
	 */
	public boolean declineAlert() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * @author ashish jain
	 * @param element
	 */
	public void SwipeRight(WebElement element) {
		SwipeElement(element, "right");
	}

	/**
	 * @author ashsih jain
	 * @param element
	 */
	public void SwipeBottom(WebElement element) {
		try {
			AndroidElement elemIOS = (AndroidElement) element;
			elemIOS.swipe(SwipeElementDirection.DOWN, 0);
			extentLogs.pass("Swipe", "Successfully Swiped.");
		} catch (Exception e) {
			extentLogs.error("Swipe", "Failed to swipe.");
			e.printStackTrace();
		}
	}

	/**
	 * @author ashish jain
	 * @param remoteelem
	 */
	public void SwipeLeft(WebElement remoteelem) {
		SwipeElement(remoteelem, "left");
	}

	/**
	 * @author ashish jain
	 * @param remoteelem
	 * @param direction
	 */
	public void SwipeElement(WebElement remoteelem, String direction) {
		Integer pagewidth = driver.manage().window().getSize().width;
		Point eloc = remoteelem.getLocation();
		Integer swipe_startxratio = eloc.getX();
		Integer swipe_endxratio = eloc.getX() + remoteelem.getSize().width;
		Integer yratio = eloc.getY() + (remoteelem.getSize().getHeight()) / 2;
		if (swipe_startxratio < 10) {
			swipe_startxratio = 10;
		}

		if (swipe_endxratio >= pagewidth) {
			swipe_endxratio = (int) (pagewidth - 10);
		}
		if (direction.trim().equalsIgnoreCase("left"))
			driver.swipe(swipe_startxratio, yratio, swipe_endxratio, yratio, 1);
		if (direction.trim().equalsIgnoreCase("right"))
			driver.swipe(swipe_endxratio, yratio, swipe_startxratio, yratio, 1);
	}

	public void ChangeOrientation(ScreenOrientation orientation) {
		try {
			driver.rotate(orientation);
			/*
			 * driver.execute(DriverCommand.SET_SCREEN_ORIENTATION,
			 * ImmutableMap.of( "orientation",
			 * orientation.value().toUpperCase()));
			 */
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @author ashish jain
	 * @param by
	 * @return
	 */
	public boolean IsElementVisible(final By by) {
		Boolean flag = false;
		try {
			wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.presenceOfElementLocated(by));
			if ((sdriver.findElement(by).getSize().height == 0)
					&& (sdriver.findElement(by).getSize().width == 0)) {
				flag = false;
			} else {
				flag = true;
			}
		} catch (Exception e1) {
			flag = false;
		}
		return flag;
	}

	public void SwipeTop(WebElement element) {
		try {
			AndroidElement elemIOS = (AndroidElement) element;
			elemIOS.swipe(SwipeElementDirection.UP, 0);
		} catch (Exception e1) {

		}
	}

	public void setGeoLocation(double latitude, double longitude) {
		Location loc = new Location(latitude, longitude, 0);
		driver.setLocation(loc);
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
	}

	public void setGeoLocation() {
		setGeoLocation(Double.valueOf(42.346886), Double.valueOf(-71.075529));
	}

	/**
	 * @author ashish jain
	 * @param alertShouldBeThereOrNot
	 * @param waitingTime
	 * @return
	 */
	public boolean assertLocationAlertPresent(boolean alertShouldBeThereOrNot,
			Long waitingTime) {
		WebDriverWait wait = new WebDriverWait(driver, waitingTime);
		Alert alert = null;
		try {
			alert = wait.until(ExpectedConditions.alertIsPresent());
		} catch (TimeoutException e) {

		}
		Set<String> windowHandles = driver.getWindowHandles();
		if (windowHandles.size() > 1 && alertShouldBeThereOrNot == true) {
			alert = driver.switchTo().alert();
			/**
			 * The alert text should be the one that is shown on IPhone/IPad. It
			 * should have Allow and Dont Allow buttons.
			 */
			String alertText = alert.getText();
			if (!alertText
					.equals("\"Safari\" Would Like to Use Your Current Location")) {
				alert = null;
			}
		}

		if (alert != null) {
			System.out.println("alert is present");
		} else {
			System.out.println("alert is not present");
		}

		if (alertShouldBeThereOrNot == true && alert != null) {
			return true;
		} else if (alertShouldBeThereOrNot == true && alert == null) {
			return false;
		}
		if (alertShouldBeThereOrNot == false && alert != null) {
			return false;
		} else if (alertShouldBeThereOrNot == false && alert == null) {
			return true;
		} else
			return false;
	}

	public AndroidDriver SwitchToWebView(AndroidDriver driver2) {
		try {
			Set<String> contextNames = driver2.getContextHandles();
			if (contextNames.size() > 1) {
				for (String contextType : contextNames) {
					if (contextType.toLowerCase().contains("webview_com.piti")) {
						driver2.context(contextType); // set context to
						// WEBVIEW_1
						driver = driver2;
						System.out.println(driver.getContext());
						return driver2;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver2;
	}

	public AndroidDriver SwichToNativeView(AndroidDriver driver2) {
		try {
			driver2.context("NATIVE_APP");
			this.driver = driver2;
			return driver2;
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * @author ashish jain
	 * @param LocatorType
	 * @param LocatorString
	 * @param timeoutInSeconds
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<WebElement> FindElements(MobileLocator LocatorType,
			String LocatorString, int timeoutInSeconds) {
		List<WebElement> webElement;
		WebDriverWait wait;
		try {
			switch (LocatorType) {
			case ByAccessibilityId:
				if (timeoutInSeconds > 0) {
					wait = new WebDriverWait(driver, timeoutInSeconds);
					webElement = wait.until(ExpectedConditions
							.visibilityOfAllElementsLocatedBy(MobileBy
									.AccessibilityId(LocatorString)));

				} else {
					webElement = driver.findElements(MobileBy
							.AccessibilityId(LocatorString));
				}
				break;
			case ByXPath:
				if (timeoutInSeconds > 0) {
					wait = new WebDriverWait(driver, timeoutInSeconds);
					webElement = driver.findElements(MobileBy
							.xpath(LocatorString));
					// webElement = wait.until(
					// ExpectedConditions.visibilityOfAllElementsLocatedBy(MobileBy.xpath(LocatorString)));
				} else {
					webElement = driver.findElements(MobileBy
							.xpath(LocatorString));
				}
				break;
			case ByClassName:
				if (timeoutInSeconds > 0) {
					wait = new WebDriverWait(driver, timeoutInSeconds);
					webElement = driver.findElements(MobileBy
							.className(LocatorString));
					// webElement = wait.until(
					// ExpectedConditions.visibilityOfAllElementsLocatedBy(MobileBy.className(LocatorString)));

				} else {
					webElement = driver.findElements(MobileBy
							.className(LocatorString));
				}
				break;
			case AndroidUIAutomator:
				if (timeoutInSeconds > 0) {
					wait = new WebDriverWait(driver, timeoutInSeconds);
					webElement = wait.until(ExpectedConditions
							.visibilityOfAllElementsLocatedBy(MobileBy
									.IosUIAutomation(LocatorString)));

				} else {
					webElement = driver.findElements(MobileBy
							.IosUIAutomation(LocatorString));
				}
				break;
			default:
				return null;

			}
			return webElement;
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * @author ashish jain
	 * @param LocatorType
	 * @param LocatorString
	 * @param timeoutInSeconds
	 * @return
	 */
	public boolean isElementPresent(MobileLocator LocatorType,
			String LocatorString, Integer timeoutInSeconds) {
		WebElement webElement;
		boolean flag = false;
		try {
			webElement = sdriver.findElementByXPath(LocatorString);
			if (webElement != null) {
				return flag = true;
			}

		} catch (Exception e) {
			return flag = false;
		}
		return flag;
	}

	/**
	 * @author ashish jain
	 * @param mobBy
	 * @param timeoutInSeconds
	 * @return
	 */
	public boolean isElementPresent(By mobBy, Integer timeoutInSeconds) {
		if (FindElement(mobBy, timeoutInSeconds) != null) {
			return true;
		} else {

			return false;
		}
	}

	/**
	 * @author ashish jain
	 * @param e
	 * @return
	 */
	public String getStackTraceAsString(Object e) {
		Exception ex = null;
		try {
			ex = (Exception) e;
			StringBuilder sb = new StringBuilder();
			for (StackTraceElement element : ex.getStackTrace()) {
				sb.append(element.toString());
				sb.append("][");
			}
			return "<b>" + ex.getClass().toString().toUpperCase()
					+ "</b> Here is the stacktrace: " + sb.toString();
		} catch (Exception e2) {
			return "Stack trace not available.";
		}
	}

	/**
	 * @author ashish jain
	 * @param element
	 * @param index
	 */
	public void ScrollToUIATableViewUsingCellIndex(WebElement element, int index) {
		try {
			((AndroidElement) element)
			.findElementByAndroidUIAutomator(".cells()[" + index
					+ "].scrollToVisible();");
		} catch (Exception e) {
		}
	}

	/**
	 * @author ashish jain
	 * @param source
	 * @param destination
	 * @return
	 */
	public boolean downloadFile(String source, String destination) {
		try {
			System.out.println("adb pull -p " + source + " " + destination);
			Runtime.getRuntime().exec(
					"adb pull -p " + source + " " + destination);
			return true;
		} catch (IOException e) {
			return false;
		}
	}

	public boolean uploadFile(String source, String destination) {
		try {
			System.out.println("adb push " + source + " " + destination);
			Runtime.getRuntime().exec("adb push " + source + " " + destination);
			return true;
		} catch (IOException e) {
			return false;
		}
	}

	/**
	 * @author ashish jain
	 * @param appName
	 */
	public void removeApp(String appName) {
		if (driver != null) {
			try {
				String bundleId = "";
				File appDir = new File(System.getProperty("user.dir")
						+ "\\tool\\" + appName);
				String command = "cmd /c \"cd %android_home%\\build-tools\\22.0.1 && D: && aapt dump permissions "
						+ appDir.getAbsolutePath() + "\"";
				System.out.println(command);
				Process proc = Runtime.getRuntime().exec(command);
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(proc.getInputStream()));
				String line;
				while ((line = reader.readLine()) != null) {
					if (line.toLowerCase().contains("package:")) {
						bundleId = line.split(" ")[1].trim();
						break;
					}
				}
				if (!bundleId.isEmpty()) {
					driver.removeApp(bundleId);
				}
			} catch (IOException e) {
				e.printStackTrace();
			} catch (WebDriverException e) {
			}
		}
	}

	/**
	 * @author ashish jain
	 * @param by
	 * @param locator
	 * @param secs
	 * @return
	 * @throws Throwable
	 */
	public boolean waitForElementPresent(By by, String locator, int secs)
			throws Throwable {
		boolean status = false;
		try {
			WebDriverWait wait = new WebDriverWait(this.driver, 60);
			wait.until(ExpectedConditions.elementToBeClickable(by));
			for (int i = 0; i < secs / 2; i++) {
				List<WebElement> elements = this.driver.findElements(by);
				if (elements.size() > 0) {
					status = true;
					return status;
				} else {
					this.driver.manage().timeouts()
					.implicitlyWait(2, TimeUnit.SECONDS);
				}
			}
		} catch (Exception e) {

			return status;
		}
		return status;
	}

	// / mobile

	/**
	 * 
	 * Performs click operation on specific element
	 * 
	 * @param element
	 *            --Get it From OR
	 * 
	 * @param elementName
	 *            --Reporting purpose
	 * 
	 * @throws Exception
	 */

	public void click(MobileElement element, String elementName)
			throws Exception{
		try{
			// waitForElement(element, 0, elementName);
			element.click();
			extentLogs.pass("Click",
					String.format("Clicked on Element :  %s ", elementName));
			// extentReportsLog(true, String.format("Clicked on Element :  %s ",
			// elementName));
		}catch (Exception e){
			extentLogs.fail(sdriver, "Click", String.format(
					"Not able to click on Element : %s  ", elementName));
			// extentLogs.error("Click",String.format("Not able to click on Element : %s  ",
			// elementName));

			// extentReportsLog(false,
			// String.format("Not able to click on Element : %s  ",
			// elementName));

			throw new Exception(
					"Element Not found or Element state not ready to perform action");
		}

	}

	/**
	 * 
	 * Performs click operation on specific element
	 * 
	 * @param element
	 *            --Get it From OR
	 * 
	 * @param elementName
	 *            --Reporting purpose
	 * 
	 * @throws Exception
	 */

	public void click(WebElement element, String elementName) throws Exception{
		try{
			// waitForElement(element, 60, elementName);
			element.click();
			extentLogs.pass("Click",
					String.format("Clicked on Element :  %s ", elementName));
			// extentReportsLog(true, String.format("Clicked on Element :  %s ",
			// elementName));
		}catch (Exception e){
			extentLogs.error("Click", String.format(
					"Not able to click on Element : %s  ", elementName));
			// extentReportsLog(false,
			// String.format("Not able to click on Element : %s  ",
			// elementName));
			throw new Exception(
					"Element Not found or Element state not ready to perform action");
		}
	}

	/**
	 * 
	 * To perform type action
	 * 
	 * @param element
	 *            --Get it from OR
	 * 
	 * @param text
	 *            --Data to be entered in text field
	 * 
	 * @param elementName
	 *            --reporting purpose
	 * 
	 * @throws Exception
	 */

	public void type(MobileElement element, String text, String elementName)
			throws Exception{
		try{
			element.sendKeys(text);
			extentLogs.pass("Type", "Able to send the text: " + text
					+ " for the element " + elementName);
			// extentReportsLog(true, "Able to send the text: " + text +
			// " for the element " + elementName);

		}catch (Exception e){
			extentLogs.fail(sdriver, "Type",
					"Not able to send the given text: " + text
					+ " for the element" + elementName);
			// extentReportsLog(false, "Not able to send the given text: "+ text
			// +" for the element" + elementName);
			throw new Exception("Element Not found or Element state not ready to perform action");
		}

	}

	/**
	 * 
	 * To perform type action
	 * 
	 * @param element
	 *            --Get it from OR
	 * 
	 * @param elementName
	 *            --reporting purpose
	 * 
	 * @throws Exception
	 */

	public static void clear(MobileElement element, String elementName)
			throws Exception{
		try{
			element.clear();
			// extentReportsLog(true, "Clear data for the element : " +
			// elementName);
		}catch (Exception e){
			// extentReportsLog(false,
			// "Not able to Clear data for the element : " + elementName);
			throw new Exception(
					"Element Not found or Element state not ready to perform action");
		}

	}

	// Reuse methods

	public String randomUser() {
		userName = genrateRandomUser();
		return userName;
	}

	/**
	 * Function Name : getRandomString
	 * @param i
	 * @return boolean
	 * @throws Throwable
	 */
	public String getRandomString(int i) {
		String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		while (salt.length() < i) {
			int index = (int) (rnd.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		String saltStr = salt.toString();
		return saltStr;

	}

	public String genrateRandomUser() {
		char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		StringBuilder sb = new StringBuilder();
		sb.append("Ran");
		Random random = new Random();
		for (int i = 0; i < 11; i++) {
			char c = chars[random.nextInt(chars.length)];
			sb.append(c);
		}
		String username = sb.toString();

		return username;

	}

	public String Enterdata(String value) throws WebDriverException, Exception {

		// System.out.println("Value="+value);

		// System.out.println("Length:"+value.length());

		waitForElementPresent(
				(MobileElement) sdriver
				.findElementByAccessibilityId("numberButton1"),
				60);

		char[] chars4 = value.toCharArray();

		// long millis1 = System.currentTimeMillis();

		for (int i = 0, n = chars4.length; i < n; i++) {

			sdriver.findElementByAccessibilityId("numberButton" + chars4[i])
			.click();

		}

		// long millis2 = System.currentTimeMillis();

		// System.out.println(millis2 -millis1);

		return value;

	}

	/**
	 * wait for a specific element
	 * 
	 * @param element
	 *            --get it from OR
	 * @param sec
	 *            -- duration
	 * @param elementName
	 *            --reporting purpose
	 * @throws Exception
	 */
	public MobileElement waitForElementPresent(MobileElement element, int sec,
			String elementName) throws Exception {
		MobileElement ele = null;
		if (sec == 0)
			sec = 10;

		for (int i = 0; i < sec; i++) {
			try {
				if (element.isDisplayed()) {
					ele = element;
					wait(1);
					break;
				}
			} catch (Exception ex) {
				wait(1);
			}
			if (i == (sec - 1)) {
				extentLogs.error(sdriver, "Verify element",
						"Expected element(s) NOT found :" + elementName);
				// extentLogs.error("Verify element",
				// "Expected element(s) NOT found :" + elementName);

				throw new Exception("Expected element(s) NOT found");
			}
		}
		return ele;
	}

	/**
	 * wait for a specific element
	 * 
	 * @param element
	 *            --get it from OR
	 * @param sec
	 *            -- duration
	 * @param elementName
	 *            --reporting purpose
	 * @throws Exception
	 */
	public MobileElement waitForElement(MobileElement element, int sec,
			String elementName) throws Exception {
		MobileElement ele = null;
		if (sec == 0)
			sec = 10;

		for (int i = 0; i < sec; i++) {
			try {
				if (element.isDisplayed()) {
					ele = element;
					wait(1);
					break;
				}
			} catch (Exception ex) {
				wait(1);
			}
			if (i == (sec - 1)) {
				extentLogs.error(sdriver, "Verify element",
						"Expected element(s) NOT found :" + elementName);
				// extentLogs.error("Verify element",
				// "Expected element(s) NOT found :" + elementName);

				throw new Exception("Expected element(s) NOT found");
			}
		}
		return ele;
	}

	/**
	 * Verify if the element is available or not
	 * 
	 * @param element
	 *            --get it from OR
	 * @param elementName
	 *            --reporting purpose
	 * @return
	 * @throws Exception
	 */
	public boolean assertElementExists(MobileElement element, String elementName)
			throws Exception {
		try {
			element.isDisplayed();

			extentLogs.pass("Verify if the element is available or not",
					"Expected element is visibile : Element - " + elementName);
		} catch (Exception e) {
			extentLogs.fail(sdriver,
					"Verify if the element is available or not",
					"Expected element is NOT visibile : Element - "
							+ elementName);
			// extentLogs.fail("Verify if the element is available or not",
			// "Expected element is NOT visibile : Element - " + elementName);
			throw new Exception(
					"Element Not found or Element state not ready to perform action");
		}
		return DriverNoResetFlag;
	}

	
	/**
	 * Verify if the element is available or not
	 * 
	 * @param element
	 *            --get it from OR
	 * @param elementName
	 *            --reporting purpose
	 * @return
	 * @throws Exception
	 */
	public static boolean assertElementExists(WebElement element, String elementName)
			throws Exception {
		try {
			element.isDisplayed();

			extentLogs.pass("Verify if the element is available or not",
					"Expected element is visibile : Element - " + elementName);
		} catch (Exception e) {
			extentLogs.fails(Adriver,
					"Verify if the element is available or not",
					"Expected element is NOT visibile : Element - "
							+ elementName);
			// extentLogs.fail("Verify if the element is available or not",
			// "Expected element is NOT visibile : Element - " + elementName);
			throw new Exception(
					"Element Not found or Element state not ready to perform action");
		}
		return DriverNoResetFlag;
	}
	/**
	 * The innerText of this element.
	 * 
	 * @param element
	 *            : Action to be performed on element (Get it from Object
	 *            repository)
	 * 
	 * @param stepDescription
	 *            : Meaningful name to the element (Ex:label text, SignIn Link
	 *            etc..)
	 * 
	 * @return: String return text on element
	 * 
	 */

	public static String getText(MobileElement element, String stepDescription)
			throws Exception {
		String text = "";
		try {
			if (isElementPresent(element, stepDescription)) {
				text = element.getText();
			}
		} catch (Exception e) {
			System.out.println("Unable to get text of Element : "
					+ stepDescription);
		}
		return text;
	}

	/**
	 * This method returns check existence of element
	 * 
	 * @param eleement
	 *            : Action to be performed on element (Get it from Object
	 *            repository)
	 * @param stepDescription
	 *            : Meaningful name to the element (Ex:Textbox, checkbox etc)
	 * @return: Boolean value(True or False)
	 * @throws NoSuchElementException
	 */
	public static boolean isElementPresent(MobileElement element,
			String stepDescription) throws Exception {
		boolean flag = false;
		try {
			waitForElementPresent(element, 60);
			element.isDisplayed();
			flag = true;
		} catch (Exception e) {
			System.out.println("Element is not Present : " + stepDescription
					+ " - " + e.getMessage());

			extentLogs.fail(sdriver, "Element is not Present : ",
					stepDescription);
			// extentReportsLog(false, String.format("Element is not Present : "
			// + stepDescription));
			// throw new Exception
			// ("Element Not found or Element state not ready to perform action");
		}
		return flag;
	}

	/**
	 * This method returns check existence of element
	 * 
	 * @param eleement
	 *            : Action to be performed on element (Get it from Object
	 *            repository)
	 * @param stepDescription
	 *            : Meaningful name to the element (Ex:Textbox, checkbox etc)
	 * @return: Boolean value(True or False)
	 * @throws NoSuchElementException
	 */
	public static boolean IsElementExist(MobileElement element,
			String stepDescription) throws Exception {
		boolean flag = false;
		try {
			element.isDisplayed();
			flag = true;
		} catch (Exception e) {
			System.out.println("Element is not Present : " + stepDescription
					+ " - " + e.getMessage());

			// extentReportsLog(false, String.format("Element is not Present : "
			// + stepDescription));
			// throw new Exception
			// ("Element Not found or Element state not ready to perform action");
		}
		return flag;
	}
	
	
	/**
	 * This method returns check existence of element
	 * 
	 * @param eleement
	 *            : Action to be performed on element (Get it from Object
	 *            repository)
	 * @param stepDescription
	 *            : Meaningful name to the element (Ex:Textbox, checkbox etc)
	 * @return: Boolean value(True or False)
	 * @throws NoSuchElementException
	 */
	public static boolean IsElementExist(WebElement element,
			String stepDescription) throws Exception {
		boolean flag = false;
		try {
			element.isDisplayed();
			flag = true;
		} catch (Exception e) {
			System.out.println("Element is not Present : " + stepDescription
					+ " - " + e.getMessage());

			// extentReportsLog(false, String.format("Element is not Present : "
			// + stepDescription));
			// throw new Exception
			// ("Element Not found or Element state not ready to perform action");
		}
		return flag;
	}

	
	/**
	 * @author ashsih jain
	 * @param element
	 */
	public static void swipeDownWhileNotFound(By element) {
		try {
			Adriver.swipeWhileNotFound(element, 500, SwipeElementDirection.DOWN, 10000, 1000, 10, true);
			//clickonelement(element,elementname);
			extentLogs.pass("Swipe", "Successfully Swiped.");
		} catch (Exception e) {
			extentLogs.error("Swipe", "Failed to swipe.");
			e.printStackTrace();
			
		}
	}
	
	
	/**
	 * @author ashsih jain
	 * @param element
	 */
	public static void swipeUpWhileNotFound(By element) {
		try {
			Adriver.swipeWhileNotFound(element, 500, SwipeElementDirection.UP, 10000, 1000, 10, true);
			extentLogs.pass("Swipe", "Successfully Swiped.");
		} catch (Exception e) {
			extentLogs.error("Swipe", "Failed to swipe.");
			e.printStackTrace();
			
		}
	}
	
	
	
	
	/**
	 * 
	 * wait for a specific element
	 * 
	 * @param element
	 *            --get it from OR
	 * 
	 * @param sec
	 *            -- duration
	 * 
	 * @param elementName
	 *            --reporting purpose
	 * 
	 * @throws Exception
	 */

	public static MobileElement waitForElementPresent(MobileElement element,
			int sec) throws Exception{
		MobileElement ele = null;
		if (sec == 0)
			sec = 10;
		for (int i = 0; i < sec; i++){
			try{
				if (element.isDisplayed()){
					ele = element;
					wait(1);
					break;
				}
			}catch (Exception ex){
				wait(1);
			}
			if (i == (sec - 1)){
				extentLogs.fail(sdriver, "waitForElementPresent",
						"Expected element(s) NOT found : ");
				// extentReportsLog(false, "Expected element(s) NOT found : " +
				// elementName);
				throw new Exception("Expected element(s) NOT found");
			}
		}return ele;
	}

	public static void wait(int sec){
		try{
			Thread.sleep(sec * 1000);
		}catch (InterruptedException e){


		}

	}

	public boolean doubleTapElement(MobileElement element) {
		int x, y;
		try {

			for (int i = 0; i < 2; i++) {
				sdriver.executeScript("client:client.drag(\"xpath=//*[@class='UIView' and ./parent::*[@class='UIView']]\", 1000, 1000)");

			}
			TouchAction action = new TouchAction(sdriver);

			/*
			 * x = element.getCenter().getX(); y = element.getCenter().getY();
			 * Long startTime = System.currentTimeMillis(); new
			 * TouchAction((MobileDriver<SeeTestIOSElement>)
			 * sdriver).tap(x,y).perform(); System.out.println("   done in: " +
			 * (System.currentTimeMillis() - startTime) + " msec"); new
			 * TouchAction((MobileDriver<SeeTestIOSElement>)
			 * sdriver).tap(x,y).perform(); System.out.println("   done in: " +
			 * (System.currentTimeMillis() - startTime) + " msec"); new
			 * TouchAction((MobileDriver<SeeTestIOSElement>)
			 * sdriver).tap(x,y).perform(); System.out.println("   done in: " +
			 * (System.currentTimeMillis() - startTime) + " msec");
			 */
			/*
			 * element.tap(3, 3);
			 * 
			 * element.tap(fingers, duration); for(int i=0;i<2;i++) {
			 * 
			 * sdriver.pinch(1000, 1000);
			 * 
			 * }
			 * 
			 * x = element.getCenter().getX(); y = element.getCenter().getY();
			 * System.out.println(x+" "+y);
			 * 
			 * //x = 1000; //y = 1000; new
			 * TouchAction((MobileDriver<SeeTestIOSElement>)
			 * sdriver).press(x,y).waitAction(50).release().perform();
			 * //((AppiumDriver) driver).tap(1, x, y, 100); try {
			 * Thread.sleep(50); } catch (Exception e1) { } new
			 * TouchAction((MobileDriver<SeeTestIOSElement>)
			 * sdriver).press(x,y).waitAction(50).release().perform();
			 */
			// ((AppiumDriver) driver).tap(1, x, y, 100);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * @author ashsih jain
	 * @param element
	 */
	public void swipeDownappiumstudio() {
		try {
			sdriver.swipe(SwipeElementDirection.DOWN, 600, 1000);
			extentLogs.pass("Swipe", "Successfully Swiped.");
		} catch (Exception e) {
			extentLogs.error("Swipe", "Failed to swipe.");
			e.printStackTrace();
		}
	}
	
	

	public void Clickoncheckboxs() {
		try {
			for (int j = 1; j <= 7; j++) {
				sdriver.findElement(
						By.xpath("(//*[@accessibilityIdentifier='squarecheckbox'])[1]"))
						.click();

			}
			extentLogs.pass("Click on Checkboxs",
					"Successfully Clicked on Checkboxs.");
		} catch (Exception e) {
			extentLogs.error("Click on Checkboxs",
					"Failed to Clicked on Checkbox.");
			e.printStackTrace();
		}
	}

}
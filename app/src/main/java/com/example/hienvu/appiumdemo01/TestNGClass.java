//package com.example.hienvu.appiumdemo01;

import android.util.Log;

import org.junit.Assert;
import org.junit.Test;
import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;


public class TestNGClass {

//    WebDriver driver;
    AppiumDriver driver;

    @Before
    public void setUp() throws MalformedURLException {

//        File classpathRoot = new File(System.getProperty("user.dir"));
//        File appDir = new File(classpathRoot, "//APKFile");
//        File app = new File(appDir, "//isa.sothuchi.apk");
//
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("deviceName", "4d004d0789413017");//F9NPFX000298, "emulator-5554"
//        capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");
//        capabilities.setCapability(CapabilityType.VERSION, "5.0.1");//5.0.2, "5.1.1"
//        capabilities.setCapability("platformName", "Android");
//
////        capabilities.setCapability("appPackage", "jp.co.japantaxi.taxicrew.dev"); //"com.example.hienvu.myapplication"
////        capabilities.setCapability("appActivity", "jp.co.japantaxi.taxicrew.activities.MainActivity");  //"com.example.hienvu.myapplication.MainActivity"
////        capabilities.setCapability("appPackage", "com.example.hienvu.myapplication");
////        capabilities.setCapability("appActivity", "com.example.hienvu.myapplication.MainActivity");
//
//        capabilities.setCapability("appPackage", "vn.com.misa.sothuchi");
//        capabilities.setCapability("appActivity", "vn.com.misa.sothuchi.SplashActivity");
//
//        capabilities.setCapability("app", app.getAbsolutePath());
//
//        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "4d004d0789413017");//F9NPFX000298, "emulator-5554"
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

    }

    @Test
    public void testCase1() {


        WebElement titleScreen = driver.findElement(By.id("vn.com.misa.sothuchi:id/btnIntroLogin"));
        titleScreen.click();

        WebElement txtEmail = (new WebDriverWait(driver,60)).until(ExpectedConditions.presenceOfElementLocated(By.id("vn.com.misa.sothuchi:id/editEmail")));
        txtEmail.sendKeys("hienvt22@gmail.com");

        WebElement txtPassword = driver.findElement(By.id("vn.com.misa.sothuchi:id/editPass"));
        txtPassword.sendKeys("22021989");


        WebElement btnLogin = driver.findElement(By.id("vn.com.misa.sothuchi:id/btnlogin"));
        btnLogin.click();
    }

    @After
    public void End() {
        driver.quit();
    }
}












//package com.example.hienvu.appiumdemo01;
//
//import android.util.Log;
//
//import org.junit.Test;
//import org.openqa.selenium.remote.CapabilityType;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.support.ui.SystemClock;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.android.AndroidDriver;
//
//import java.io.File;
//import java.net.URL;
//import java.util.concurrent.TimeUnit;
//
///**
// * Created by hienvu on 4/20/17.
// */
//
//public class TestNGClass{
//
//    AppiumDriver driver;
//
//    @BeforeTest
//    public void testCaseSetup()throws  Exception
//    {
////        File appDir = new File("//Users//hienvu//Documents//Appium//");
////        File app = new File (appDir, "com.android.calculator2.apk");
//
//        File classpathRoot = new File(System.getProperty("user.dir"));
//        File appDir = new File(classpathRoot, "\\APKFile");
//        File app = new File(appDir, "\\vn.com.misa.sothuchi.apk");
//        Log.i("----- File app-----:",app.getPath());
//
//        DesiredCapabilities cap = new DesiredCapabilities();
////        cap.setCapability("platform", "Android");
////        cap.setCapability("deviceName", "4d004d0789413017");
////        cap.setCapability(CapabilityType.VERSION, "5.0.1");
////        cap.setCapability("app", app.getAbsoluteFile());
//
//        cap.setCapability("device", "Android");
//        cap.setCapability(CapabilityType.BROWSER_NAME, "Android");
//        cap.setCapability(CapabilityType.PLATFORM, "Android");
//        cap.setCapability(CapabilityType.VERSION, "5.0.1");
//        cap.setCapability("deviceName", "4d004d0789413017");
//        cap.setCapability("app", app.getAbsolutePath());
//
//        cap.setCapability("appPackage", "vn.com.misa.sothuchi");
//        cap.setCapability("appActivity", "vn.com.misa.sothuchi.SplashActivity");
//
//        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
////        Log.i("----- BEFORE TEST -----", "CC");
//
//    }
//
//    @Test
//    public void f()
//    {
////        Log.i("----- IN TEST -----", "AA");
//        Log.i("A","B");
//    }
//    @AfterTest
//    public void testCaseTearDown()
//    {
////        Log.i("----- AFTER TEST -----", "BB");
//        driver.quit();
//    }
//}
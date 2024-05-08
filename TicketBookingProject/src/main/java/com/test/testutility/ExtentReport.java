package com.test.testutility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
    
    public static ExtentSparkReporter htmlReporter;
    public static ExtentReports extent;
    public static ExtentTest test;
    
    public static void setExtent() {
        //htmlReporter = new ExtentSparkReporter("outputs\\ExtentReportOutput\\MyReport.html");
    	htmlReporter= new ExtentSparkReporter("MyReport.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
    }
    
    public static void endReport() {
        extent.flush();
    }
}



package com.debenhams;

import com.debenhams.driver.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    private DriverFactory driverFactory=new DriverFactory();
    @Before
    public void setUp(){
        driverFactory.openBrowser("chrome");
        driverFactory.setupUrl("https://www.debenhams.com");
        driverFactory.maximize();
        driverFactory.pageLoadTimeOut();
        driverFactory.waits();
        driverFactory.deleteCookies();
    }
    @After
    public void tearDown(){
        driverFactory.closeBrowser();
    }
}


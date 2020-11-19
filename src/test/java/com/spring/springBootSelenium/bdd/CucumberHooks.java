package com.spring.springBootSelenium.bdd;

import com.spring.springBootSelenium.kelvin.annotation.LazyAutowired;
import com.spring.springBootSelenium.kelvin.service.ScreenshotService;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.context.ApplicationContext;

import java.io.IOException;

public class CucumberHooks {

    @LazyAutowired
    private ScreenshotService screenshotService;

    @LazyAutowired
    private ApplicationContext ctx;

    @AfterStep
    public void afterStep(Scenario scenario) throws IOException {
        if(scenario.isFailed()){
            scenario.embed(this.screenshotService.getScreenshot(),"image/png",scenario.getName());
        }
    }

    @After
    public void after(){
        ctx.getBean(WebDriver.class).quit();
    }
}

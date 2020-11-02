package com.spring.springBootSelenium.kelvin.aop;

import com.spring.springBootSelenium.kelvin.service.ScreenshotService;
import org.aspectj.lang.annotation.After;
import org.openqa.selenium.TakesScreenshot;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

public class ScreenshotAspect {
    @Autowired
    private ScreenshotService screenshotService;

    @After("@annotation(takeScreenshot)")
    public void after(TakesScreenshot takesScreenshot) throws IOException {
        this.screenshotService.takeScreenshot();
    }
}

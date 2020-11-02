package com.spring.springBootSelenium.googleTest;

import com.spring.springBootSelenium.SpringBaseTestNG;
import com.spring.springBootSelenium.kelvin.annotation.LazyAutowired;
import com.spring.springBootSelenium.page.google.GooglePage;
import com.spring.springBootSelenium.kelvin.service.ScreenshotService;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class GoogleTest2 extends SpringBaseTestNG {

    @LazyAutowired
    private GooglePage googlePage;

    @LazyAutowired
    private ScreenshotService screenshotUtil;

    @Test
    public void googleTest() throws IOException {
        this.googlePage.goTo();
        Assert.assertTrue(this.googlePage.isLoaded());
        this.googlePage.getSearchComponent().search("selenium");
        Assert.assertTrue(this.googlePage.getSearchResultComponent().isLoaded());
        Assert.assertTrue(this.googlePage.getSearchResultComponent().getResultCount()>2);
        screenshotUtil.takeScreenshot();
        googlePage.close();

    }
}


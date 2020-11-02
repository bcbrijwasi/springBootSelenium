package com.spring.springBootSelenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;

public abstract class Base {
    @Autowired
    protected WebDriver driver;
    @Autowired
    protected WebDriverWait webDriverWait;
    protected Logger logger;

    public Base(){
        logger = LoggerFactory.getLogger(this.getClass());
    }

    @PostConstruct
    private void init(){
        PageFactory.initElements(this.driver,this);
    }


    public abstract boolean isLoaded();
}

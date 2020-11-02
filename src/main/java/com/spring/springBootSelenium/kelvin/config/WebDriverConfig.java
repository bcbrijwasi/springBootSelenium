package com.spring.springBootSelenium.kelvin.config;

import com.spring.springBootSelenium.kelvin.annotation.LazyConfiguration;
import com.spring.springBootSelenium.kelvin.annotation.ThreadScopeBean;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Profile;

@LazyConfiguration
@Profile("!remote")
public class WebDriverConfig {

    @ThreadScopeBean
    @ConditionalOnProperty(name = "browser", havingValue = "chrome")
    public WebDriver getChromeDriver(){
        WebDriverManager.chromedriver().driverVersion("86.0.4240.22").setup();
        return new ChromeDriver();
    }

    @ThreadScopeBean
    @ConditionalOnProperty(name = "browser", havingValue = "firefox")
    public WebDriver getFirefoxDriver(){
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }


}

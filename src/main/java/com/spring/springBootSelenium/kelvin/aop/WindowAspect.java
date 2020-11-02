package com.spring.springBootSelenium.kelvin.aop;

import com.spring.springBootSelenium.kelvin.annotation.WindowSwitch;
import com.spring.springBootSelenium.kelvin.service.WindowSwitchService;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class WindowAspect {

    @Autowired
    private WindowSwitchService windowSwitchService;

    @Before("@target(windowSwitch) && within(com.springboot.cucumber.springBootSelenium..*)")
    public void before(WindowSwitch windowSwitch){
        windowSwitchService.switchByTitle(windowSwitch.value());
    }

    @After("@target(windowSwitch) && within(com.springboot.cucumber.springBootSelenium..*)")
    public void after(WindowSwitch windowSwitch){
        windowSwitchService.switchByIndex(0);
    }
}

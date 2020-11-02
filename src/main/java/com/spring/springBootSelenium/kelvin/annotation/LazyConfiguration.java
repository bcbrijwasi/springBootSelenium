package com.spring.springBootSelenium.kelvin.annotation;

import org.springframework.context.annotation.Lazy;

import java.lang.annotation.*;

@Lazy
@org.springframework.context.annotation.Configuration
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface LazyConfiguration {

}

package com.spring.springBootSelenium.kelvin.annotation;

import java.lang.annotation.*;

@Page
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface WindowSwitch {
   String value() default "";
}

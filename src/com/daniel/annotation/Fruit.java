package com.daniel.annotation;

import java.lang.annotation.*;

/**
 * Created by daniel on 15/10/14.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Fruit {
    String value() default "";

}

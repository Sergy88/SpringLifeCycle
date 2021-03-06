package ru.springcontext.quoter;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface RandomRepeat {
    int min();
    int max();
}

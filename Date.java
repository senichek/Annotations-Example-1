package com.javarush.task.task38.task3810;

public @interface Date {
    //напиши свой код
    // year = 2011, month = 5, day = 30, hour = 18, minute = 35, second = 18
    //String name() default "";
    int year();
    int month();
    int day();
    int hour();
    int minute();
    int second();
}

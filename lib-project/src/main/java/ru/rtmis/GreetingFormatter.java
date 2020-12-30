package ru.rtmis;

import org.apache.commons.lang3.StringUtils;

public class GreetingFormatter {
    public static String greeting(String name) {
        String capitalizedName = StringUtils.capitalize(name);
        return "Добро пожаловать в нашу клинику, " + capitalizedName;
    }
}

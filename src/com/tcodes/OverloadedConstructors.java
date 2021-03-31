package com.tcodes;

public class OverloadedConstructors {

    private String myString;

    public OverloadedConstructors()
    {
        this("some string");
    }

    public OverloadedConstructors(String someString)
    {
        myString = someString;
    }
}

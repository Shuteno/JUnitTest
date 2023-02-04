package org.example;

import java.io.File;

public class TT {
    public boolean stringStart (String string, String shablon) {
        return string.startsWith(shablon);
    }

    public String concat (String a, String b) {
        String c = a + b;
        return c;
    }

    public boolean a1b (int a, int b) {
        return (a > b);
    }


    public boolean fileExist (String file) {
        return new File(file).exists();
    }
}

package com.example.myapplication;

import java.util.Comparator;

public class TComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
}

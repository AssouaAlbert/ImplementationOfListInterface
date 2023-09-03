package org.peronal;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Linkes links = new Linkes();
        links.setAL();
        List<String> newAl= links.rm(links.al, 2);
        System.out.println(newAl);
    }
}
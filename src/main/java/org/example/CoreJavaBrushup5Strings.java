package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushup5Strings {
    public static void main(String[] args) {

//string is an object //String literal
// String s1 = "Rahul Shetty Academy";
        String s5 = "hello";
//new

        String s2 = new String("Welcome");
        String s3 = new String("Welcome");
        String s = "Rahul Shetty Academy";
        String[] splittedString = s.split("Shetty");

        System.out.println(splittedString[0]);
        System.out.println(splittedString[1]);
        System.out.println(splittedString[1].trim());
        for(int i =s.length()-1;i>=0;i--)
        {
            System.out.println(s.charAt(i));
        }
    }
}
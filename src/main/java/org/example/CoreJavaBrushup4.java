package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushup4 {
    public static void main(String[] args) {


        int[] arr2 = {1,2,3,4,5,6};
        //for loop
        for(int i = 0; i<arr2.length ; i++)
        {
//            Even number
            if(arr2[i] % 2 == 0) {
                System.out.println("for loop-if loop- Even number- array2 is: " + arr2[i]);
//                break;  if just want to check if array has multiple of 2.
            }
            else
            {
                System.out.println("for loop-if loop- odd number- array2 is: " + arr2[i]);
            }
        }

        System.out.println("Learn ArrayList");
//        ArrayList
        ArrayList<String> a = new ArrayList<String>();
        a.add("Rahul");
        a.add("Amit");
        a.add("arun");
        a.add("Amar");
        a.add("Selenium");

        a.remove(2);
        System.out.println(a.get(3));

        System.out.println("***************");
        for(int i=0; i<a.size(); i ++)
        {
            System.out.println(a.get(i));
        }

        System.out.println("***************");

        for( String val: a)
        {
            System.out.println(val);

        }
        System.out.println("***************");

//        item is present in arraylist
        System.out.println(a.contains("Selenium"));


        // converting normal array to ArrayList
        String[] name = {"rahul", "shetty", "selenium"};
        List<String> nameArrayList = Arrays.asList(name);
        nameArrayList.contains("selenium");


    }
}

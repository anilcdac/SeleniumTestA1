package org.example;

public class CoreJavaBrushup3 {
    public static void main(String[] args) {

        int myNum = 5;
        String website = "Rahul Shetty Academy";
        char letter = 'r';
        double dec = 5.99;
        boolean myCard = true;

        System.out.println(myNum + " is the value store in the myNum variable");

        // Arrays-
        int[] arr1 = new int[5];
        arr1[0] = 11;
        arr1[1] = 12;
        arr1[2] = 13;
        arr1[3] = 14;

        int[] arr2 = {1,2,3,4,5,6};
        System.out.println("Array is: "+ arr1[2] );
        System.out.println("Array is: "+ arr2[2] );

        //for loop
        for(int i = 0; i<arr2.length ; i++)
        {
            System.out.println("for loop- array2 is: " + arr2[i]);
        }
    }
}

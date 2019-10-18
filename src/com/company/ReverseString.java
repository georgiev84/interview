package com.company;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Automation";
        String[] arrStr = str.split("");
        String[] reverse = new String[arrStr.length];

        for(int i=0; i<=arrStr.length/2; i++){
            String last = arrStr[arrStr.length-1-i];
            String first = arrStr[i];

            reverse[i]=last;
            reverse[arrStr.length-1-i] = first;
        }

        for(String a : reverse){
            System.out.println(a);
        }
    }
}

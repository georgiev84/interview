package com.company;

import java.util.HashMap;
import java.util.Map;

public class FoundWordNumbers {

       public static void main(String[] args) {
        // Found how many times each word is mentioned in the string
        String input = "John Mike John Mike Donald Ivy John Joe John Donald";
        String[] names = input.split("\\s+");

        HashMap<String, Integer> values = new HashMap<String, Integer>();
        for (String name : names){

            int count=0;
            for(String doubledName : names){
                if(name.equals(doubledName)){
                    count++;
                }
            }
            values.put(name,count);

        }

           for(Map.Entry<String, Integer> a : values.entrySet()){
               System.out.println(a);
           }
    }

}

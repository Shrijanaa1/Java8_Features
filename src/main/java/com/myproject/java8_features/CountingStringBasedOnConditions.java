/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myproject.java8_features;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author shrijanakarki
 */
public class CountingStringBasedOnConditions {
    public static void main(String[] args){
        List<String> names = Arrays.asList("shrijana","","malina","shisam","monika","deenika","","ab", "abc","z");
        
        //1. Counting empty string
        
        long count = names.stream()
                .filter(n -> n.isEmpty())
                .count();
       
        System.out.println("Count of Empty string: "+ count);
  
        
        //2. count string whose length is more than three
        
        long num = names.stream()
                .filter(n -> n.length()>=3)
                .count();
        
         System.out.println("Count of string of length > 3: " + num);
         
       //3. Count string starting with specific letter     
         
        long startsWithS = names.stream()
                 .filter(n -> n.startsWith("s"))
                 .count();
        
        System.out.println("Names startig with s: "+startsWithS);
        
        
        //another way:  
//            
//        names.stream()
//                .filter(s -> s.startsWith("s"))
//                .forEach(System.out::println);

   

        long startsWithA = names.stream()
                .filter(s -> s.startsWith("a"))
                .count();
        
        System.out.println("Count of names strating with a: " + startsWithA);
         
         
    }
    
}

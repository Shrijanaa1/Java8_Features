/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myproject.java8_features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author shrijanakarki
 */
public class ConvertStringToUpperCase {
    public static void main(String[] args){
                
        List<String> names = Arrays.asList("shrijana","","malina","shisam","monika","deenika","","ab", "abc","z");

        
        String bigList = names.stream()
                .map(n -> n.toUpperCase())
                .collect(Collectors.joining(","));
        System.out.println("Names in UpperCase: " + bigList);
        
        
            //for each for printing and uppercase letters
                    
//            names.stream()
////                  .map(String::toUpperCase) //using method reference
//                  .map(n -> n.toUpperCase()) //lambda expression
//                  .forEach(System.out::println);
    }
    
}

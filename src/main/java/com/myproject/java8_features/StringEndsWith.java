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
public class StringEndsWith {
    public static void main(String[] args){
        List<String> names = Arrays.asList("shrijana","","malina","shisam","monika","deenika","","ab", "abc","z");
     
        List<String> namesEndWithA = names.stream()
                .filter(n-> n.endsWith("a"))
                .collect(Collectors.toList());
        
        System.out.println("Names ending with a: " + namesEndWithA);
    }
    
}

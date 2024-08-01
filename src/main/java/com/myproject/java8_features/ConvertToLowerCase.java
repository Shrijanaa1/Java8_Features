/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myproject.java8_features;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author shrijanakarki
 */
public class ConvertToLowerCase {
    public static void main(String[] args){
        List<String> name = List.of("SHRIJANA", "MelishA", "BIMala");
        List<String> lowerCased = name.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println("Names in lower case: " + lowerCased);
        
    }
    
}

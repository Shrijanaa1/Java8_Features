/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myproject.java8_features;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author shrijanakarki
 */
public class FlatMapExample {
    public static void main(String[] args){
               List<List<String>> namesNested = Arrays.asList(
       Arrays.asList("Jeff","Bezos"),
       Arrays.asList("Mark", "Zuckerberg"));
       
       List<String> namesFlatStream  = namesNested.stream()
               .flatMap(Collection::stream)
               .collect(Collectors.toList());
                
       System.out.println("Flat Map: "+ namesFlatStream);
    }
    
}

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
public class SquareOfDistinctNumbers {
    public static void main(String[] args){
        List<Integer> numbers = List.of(1,0,9,4,6,9,1,5);
        
        //1. Create a list of the square of the distinct numbrs
        
        List<Integer> distinct = numbers.stream()
                .map(n -> n*n)
                .distinct()
                .collect(Collectors.toList());
        
        System.out.println("Distinct numbers after squaring: " + distinct);
        
        
        
         //4. Remove duplicate elements from List using streams
        
        List<Integer> distincts = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("List after removing duplicates: " + distincts);

    }
    
}

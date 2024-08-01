/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myproject.java8_features;

import java.util.List;

/**
 *
 * @author shrijanakarki
 */
public class AverageOfInteger {
    public static void main(String[] args){
        List<Integer> numbers = List.of(1,0,9,4,6,9,1,5);
                double averageOfNumbers = numbers.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
        System.out.println("Average of numbers: " + averageOfNumbers);
         
    }
    
}

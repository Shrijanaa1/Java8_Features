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
public class SumOfOddNumbers {
    public static void main(String[] args){
        
        List<Integer> numbers = List.of(1,0,9,4,6,9,1,5);
                
        int sumOfOdds = numbers.stream()
                .filter(num -> num%2 !=0)
                .collect(Collectors.summingInt(Integer::intValue));
        
        System.out.println("Sum of Odd numbers: " + sumOfOdds);
    }
    
}

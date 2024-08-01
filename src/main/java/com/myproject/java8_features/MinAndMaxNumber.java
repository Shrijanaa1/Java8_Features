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
public class MinAndMaxNumber {
    public static void main(String[] args){
        List<Integer> numbers = List.of(1,0,9,4,6,9,1,5);
        Integer max_value = numbers.stream()
                .max(Integer::compare)
                .orElse(null);
        
        Integer min_value = numbers.stream()
                .min(Integer::compare)
                .orElse(null);
        
        System.out.println("Max value: "+ max_value);
        System.out.println("Min value: " + min_value);
    }
    
}

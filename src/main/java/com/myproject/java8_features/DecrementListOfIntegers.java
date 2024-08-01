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
public class DecrementListOfIntegers {
    public static void main(String[] args){
                List<Integer> nos = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> decrementedNumbers = nos.stream()
                .map(num -> num-2)
                .collect(Collectors.toList());
        
       System.out.println("Decremented numbers by 2: " + decrementedNumbers);
    }
    
}

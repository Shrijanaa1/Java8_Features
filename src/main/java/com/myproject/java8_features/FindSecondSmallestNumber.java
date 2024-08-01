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
public class FindSecondSmallestNumber {
    public static void main(String[] args){
        List<Integer> numbers = List.of(1,0,9,4,6,9,1,5);
        Integer secondSmallest = numbers.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println("Second Smallest: "+ secondSmallest);
    }
}

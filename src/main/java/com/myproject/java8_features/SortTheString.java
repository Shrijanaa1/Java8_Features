/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myproject.java8_features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author shrijanakarki
 */
public class SortTheString {
    public static void main(String[] args){
        
        List<String> names = Arrays.asList("shrijana","","malina","shisam","monika","deenika","","ab", "abc","z");

        //1. Sort list of string in ascending order
        
        List<String> sortedList = names.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted names in ascending order: "+ sortedList);
        

        
        
        //2. Sort list in descending order
        List<String> descendingOrder = names.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Sorted list in descending order: " + descendingOrder);
        
        
        //3. sorted list of names on the basis of number of letters
        //user comparator
        List<String> uniqueNames = Arrays.asList("shrijana","bimala", "ruru"," ameha", "mel", "saif");
        List<String> sorting = uniqueNames.stream()
                .sorted(Comparator.comparingInt(String::length)) //sort by length of name
                .collect(Collectors.toList());
        System.out.println("Sorted name list on the basis of count in names : "+ sorting);
    }
    
}

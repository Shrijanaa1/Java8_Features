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
public class FindStringWithGivenLength {
    public static void main(String[] args){

        List<String> names = Arrays.asList("shrijana","","malina","shisam","monika","deenika","","ab", "abc","z");

        //1. Create a list with String more than 2 characters
                
        List<String> filteredLists = names.stream()
                .filter(n -> n.length()>2)
                .collect(Collectors.toList());
        System.out.println("Names having length greater than 2: " + filteredLists);
        
        
        //2. Remove all empty string from list
        
        List<String> filteredList = names.stream()
                .filter(n -> !n.isEmpty())
                .collect(Collectors.toList());
        System.out.println("Names after removing duplicates: "+ filteredList);
    }
    
}

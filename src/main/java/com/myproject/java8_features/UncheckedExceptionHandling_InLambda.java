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

//declare function interface that explicitly declare checked exceptions in their abstract methods.

@FunctionalInterface
interface Divider{
    double divide (double a, double b);
}


public class UncheckedExceptionHandling_InLambda{
    public static void main(String[] args){
        //lambda expression to perform division and handle exception
        Divider div = (a, b) -> {
            if( b == 0) {
                throw new ArithmeticException("Can't divide by zero");
            }
            return a/b;
        };
        
        //Testing the lambda expression
        try{
            double result1 = div.divide(10, 3);
            System.out.println("Result: "+ result1);
            
            double result2 = div.divide(10,0);
            System.out.println("Result: "+ result2);
        }catch(ArithmeticException e)
        {
            System.out.println("Exception Caught: "+ e.getMessage());
        }
    }
}




//Exception handling in Stream Api

//1. Unchecked exception 
// Unchecked Exceptions: Handled directly within lambdas using try-catch blocks.

//public class Student{
//    public static void main(String[] args){
//        List<String> names = Arrays.asList("apple", "banana", "cherry", "");
//        
//        names.stream()
//                .map(s -> {
//                    try{
//                        if(s.isEmpty()){
//                            throw new IllegalArgumentException("Empty String");
//                        }
//                        return s.toUpperCase();
//                    }catch(IllegalArgumentException e){
//                        System.out.println("Caught Exception: "+ e.getMessage());
//                        return null; //Handle Exception by returing a default value or skipping
//                    }
//                })
//                .filter(s -> s!= null)
//                .forEach(System.out::println);
//        
//    }
//}




//2. Checked Exception
// Checked Exceptions: Handled by wrapping them in unchecked exceptions or using helper methods to manage them.


//import java.util.Arrays;
//import java.util.List;
//
//public class Student {
//    public static void main(String[] args) {
//        List<String> strings = Arrays.asList("apple", "banana", "", "cherry");
//
//        // Lambda expression that uses a method that throws a checked exception
//        strings.stream()
//            .map(s -> {
//                try {
//                    return process(s);
//                } catch (Exception e) {
//                    throw new RuntimeException(e); // Wrap checked exception in a runtime exception
//                }
//            })
//            .forEach(System.out::println);
//    }
//
//    // Method that throws a checked exception
//    private static String process(String s) throws Exception {
//        if (s.isEmpty()) {
//            throw new Exception("Input cannot be empty");
//        }
//        return s.toUpperCase();
//    }
//}

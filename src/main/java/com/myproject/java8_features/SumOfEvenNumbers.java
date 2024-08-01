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
public class SumOfEvenNumbers {
    public static void main(String[] args){
   
        List<Integer> numbers = List.of(1,0,9,4,6,9,1,5);

        int sumOfEvens = numbers.stream() 
                    .filter(num -> num%2 == 0) 
                    .mapToInt(Integer::intValue)  //converts Integer into primitive type int
                    .sum();

            System.out.println("Sum of Even numbers: " + sumOfEvens);
            
            
                    //OR Use another method:
        
//            int sumOfEvens = numbers.stream()
//            .filter(n-> n%2 ==0)
//            .collect(Collectors.summingInt(Integer::intValue));
//            System.out.println(sumOfEvens);



        // 8. Use reduce to sum even numbers
        //identity is default value if stream is empty
        //reduce method returns single value, not stream so forEach can't be used.
        int sumOfEven = numbers.stream()
                .filter(num -> num%2 == 0)
                .reduce(0, (sum, num) -> sum + num);
                
        System.out.println("Sum of Evens using reduce: "+ sumOfEven);
    }
    
}

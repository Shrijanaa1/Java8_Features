/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myproject.java8_features;

/**
 *
 * @author shrijanakarki
 */



@FunctionalInterface
interface MyFunction<T> {
    void operate(T input) throws Exception;
}
       

public class CheckedExceptionHandling_In_Lambda {
    public static void main(String[] args) {
       //Create instance of MyFunction with lambda expression
       MyFunction<String> myFunction = input ->  {
           if(input.length() < 5){
               throw new Exception("Input is too short");
           }
           System.out.println("Input is: " + input);
       };
       
       //Handle potential exception
       try{
           myFunction.operate("HelloWorld");  //this works
       }catch(Exception e){
           System.out.println("Error: " + e.getMessage());
       }
       
       try{
           myFunction.operate("bye");
       }catch(Exception e){
           System.out.println("Error: "+ e.getMessage());
       }
    }
    
    
    
    
    ////Leveraging Functional Interfaces with Checked Exception
//@FunctionalInterface
//interface MyFunctionWithException{
//    void operate(int num) throws Exception;
//}
//
//public class Student{
//    public static void main(String[] args){
//        MyFunctionWithException func = (num) -> {
//            if(num == 0){
//                throw new Exception("Division by zero");
//            }
//            System.out.println(10/num);
//        };
//        
//        try{
//            func.operate(0);
//        }catch(Exception e){
//           System.out.println("Error:");
//        }
//    }
//}
    
    
}

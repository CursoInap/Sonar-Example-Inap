package com.acme.basic;

public class HelloWorld {

  void sayHello() {
    System.out.println("Hello World!");
    System.out.println("Hello World!"); //DUPLICO
    
    System.out.println ("Hello World!"); //DUPLICO ssssssssss

  }

  void notCovered() {
    System.out.println("This method is not covered by unit tests");
    System.out.println("Hello World!"); //DUPLICO
  }

}

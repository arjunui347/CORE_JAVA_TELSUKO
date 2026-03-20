package com.Tel.CoreJava;

public class Tel_55_Polymorphism {
    public static void main(String[] args) {
        /*

         Polymorphism in Java is a core Object-Oriented Programming (OOP) concept
         that allows a single action to be performed in different ways.
         Derived from the Greek words "poly" (many) and "morph" (forms), it enables objects to take on multiple forms,
         typically by allowing a superclass reference to point to a subclass object.

          Types of Polymorphism:
          Java supports two primary types of polymorphism:
          Compile-time Polymorphism (Static):
            Mechanism: Achieved through Method Overloading.
            How it works: Multiple methods in the same class have the same name but different parameter lists
                          (different number, type, or order of arguments).
            Resolution: The compiler determines which method to call at compile time based on the method signature.
            Example: A Math class with multiple add() methods—one for int and one for double.

          Runtime Polymorphism (Dynamic):
            Mechanism: Achieved through Method Overriding.
            How it works: A subclass provides a specific implementation for a method already defined in its superclass.
            Resolution: The Java Virtual Machine (JVM) determines which method to execute at runtime based
                        on the actual object being referred to, not the reference type. This is also known as Dynamic Method Dispatch.
            Example: An Animal superclass with a makeSound() method, overridden by Dog (Bark) and Cat (Meow) subclasses.

          Key Concepts:
          Upcasting: Using a superclass reference variable to refer to a subclass object (e.g., Animal myDog = new Dog();).
                     This is essential for achieving runtime polymorphism.
          Polymorphic Variables: A variable that can hold values of different types (its own type or any of its subtypes) during execution.
          Operator Overloading: Java has limited internal operator overloading (e.g., the + operator for both numeric addition and string concatenation)
                                but does not support user-defined operator overloading.

          Advantages and Disadvantages:
            Feature 	                        Advantages	                                                        Disadvantages
          Flexibility	Allows adding new subclasses without modifying existing code.	Can make code behavior harder to trace and understand.
          Reusability	Methods can work with generic superclass types.	                Slight performance overhead due to dynamic method lookups at runtime.
          Maintenance	Reduces the need for complex conditional (if/else) logic.	    Deep inheritance hierarchies can increase code complexity.
         */

    }
}

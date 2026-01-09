public class Tel_47_Inheritance_Theory {
    public static void main(String[] args) {

        /*
            Inheritance in Java is a core object-oriented programming (OOP) concept where a new class (subclass)
            acquires the properties (fields) and behaviors (methods) of an existing class (superclass).
            The primary goal is code reusability, which helps create a logical hierarchy and organize classes in a structured manner.

    Key Concepts and Terminology • Superclass (Parent Class or Base Class): The class whose features are inherited.
    • Subclass (Child Class or Derived Class): The class that inherits from the superclass and can add its own unique features.
    •  Keyword: Used to establish the inheritance relationship between a subclass and a superclass, like .
    •  Keyword: Used within a subclass to refer to the immediate parent class's members or constructors.
    • "IS-A" Relationship: Inheritance represents an "is-a" relationship, e.g. a Dog is an animal.
    • Constructors: Not inherited directly, but a subclass can call the superclass's constructor using .
    • Access Modifiers:  and  members are inherited;  members are not.
---------------------------------------------------------------------------------------------------
    Types of Inheritance in Java:
    Java supports the following types of inheritance with classes,
    but not multiple inheritance with classes to avoid the "diamond problem". 
    
    The concept of multiple inheritance can be achieved through interfaces.
         

    • Single Inheritance: One subclass inherits from one superclass.
        class Animal { / ... / }
    class Dog extends Animal { / ... / }
--------------------------------------------------------------------
    • Multilevel Inheritance: A class inherits from a class which also inherits from another class.
    class Animal { / ... / }
    class Dog extends Animal { / ... / }
    class BabyDog extends Dog { / ... / }
---------------------------------------------------------------------
    • Hierarchical Inheritance: Multiple subclasses inherit from a single superclass.
    class Animal { / ... / }
    class Dog extends Animal { / ... / }
    class Cat extends Animal { / ... / }
---------------------------------------------------------------------
    • Multiple Inheritance (via Interfaces): A class implements multiple interfaces. [1, 8, 9]
    interface Swimmer { void swim(); }
    interface Walker { void walk(); }
    class Duck implements Swimmer, Walker { / implementation / }
----------------------------------------------------------------------
    
    
    Why Use Inheritance?
    • Code Reusability: Common code is shared among subclasses.
    • Method Overriding: Allows subclasses to provide specific method implementations.
    • Code Organization & Maintainability: Helps structure classes logically.
    • Extensibility: Makes it easier to add new functionality.


         */

    }
}

package com.Tel.CoreJava;

import com.Tel.CoreJava2.Tel_54_AccessModifiers_Test;

public class Tel_54_AccessModifiers {
    public static void main(String[] args) {

        /*

        In Java, access modifiers (or access specifiers) are keywords that define the visibility and accessibility of classes,
        methods, and variables. They are fundamental to encapsulation,
        allowing you to protect sensitive data and control how different parts of a program interact with each other.

        Java provides four levels of access control:
            Public (public): The least restrictive modifier. Members marked public are visible from anywhere in the program,
                             regardless of the package.
            Protected (protected): Members are accessible within the same package and by subclasses (even if they are in different packages).
            Default (no keyword): Also known as package-private, it is applied when no modifier is specified.
                                  Members are accessible only within classes in the same package.
            Private (private): The most restrictive modifier. Members are accessible only within the same class.

        Visibility Comparison Table:
        Access Modifier 	Same Class	    Same Package	Subclass (Diff Package)	    Outside World
        public	                Yes	             Yes	            Yes	                    Yes
        protected	            Yes	             Yes	            Yes	                    No
        default	                Yes	             Yes	            No	                    No
        private	                Yes	             No	                No	                    No

        Important Rules and Best Practices:
        Class Level: Top-level classes can only be public or default. They cannot be private or protected.
        Method Overriding: An overridden method in a subclass cannot be more restrictive than the original method in the superclass
                           (e.g., a protected method cannot be overridden as private).
        Principle of Least Privilege: Start by making everything private and only increase visibility as needed
                                      to ensure better Data Security and maintainability.
        Encapsulation: Use private for instance variables and provide access through public Getters and Setters.

        */

        Tel_54_AccessModifiers_Test ObjAMTest = new Tel_54_AccessModifiers_Test();
        //System.out.println(ObjAMTest.marks); // it is giving an error as the int marks belongs to class Tel_54_AccessModifiers_Test(different package) and which a Default AccessModifier.
        ObjAMTest.show(); // show method is accessible as it is a public method.


        Tel_54_AccessModifiers_Test1 ObjAMTest1 = new Tel_54_AccessModifiers_Test1();
        System.out.println("mark value:::: "+ ObjAMTest1.mark); //it is giving access to int marks1  belongs to class Tel_54_AccessModifiers_Test1(same package) and which is a Default AccessModifier.



    }
}

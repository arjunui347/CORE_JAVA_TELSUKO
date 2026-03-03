package com.Tel.CoreJava2;

import com.Tel.CoreJava.Tel_52_MO_Adv_Calc;
import com.Tel.CoreJava.Tel_52_MO_Calc;

import java.util.ArrayList;

public class Tel_53_Packages {
    public static void main(String[] args) {
        /*In Java, a package is a grouping of related classes, interfaces, and sub-packages into a shared namespace,
          similar to a folder in a file system. They are used to organize code, prevent naming conflicts,
          and control access to members.

        Java has two types of packages:
        Built-in Packages (from the Java API)
        User-defined Packages (created by developers)

        Key Advantages of Using Packages:
        -> Code Organization Packages help categorize classes and interfaces, making large projects more modular, readable, and maintainable.
        -> Namespace Management They prevent naming conflicts by allowing classes with the same name to exist in different packages (e.g., java.util.Date and java.sql.Date).
        -> Access Control Packages provide access protection through modifiers (public, protected, default/package-private),
           which control the visibility of classes and members across different packages.
        -> Code Reusability Classes within a package can be easily reused in other programs by using the import statement.

        Working with Packages:
        Declaration:
        To place a class within a package, the package keyword followed by the package name must be the first statement in the Java source file.

        java Program:
        package com.example.myapp;
        // Class within the package
        public class MyClass { ... }

        Directory Structure:
        The package name must match the directory structure where the compiled .class files are stored.
        A package named com.example.myapp would correspond to a directory path of com/example/myapp/.

        Importing Packages:
        To use classes from another package, the import statement is used.

        Importing a single class: import package_name.ClassName; (e.g., import java.util.Scanner;)
        Importing an entire package: import package_name.*; (e.g., import java.util.*;)


        Classes in the java.lang package are automatically imported into every Java program.

        Common Built-in Java Packages
        Java provides a rich set of built-in packages as part of its API. Some of the most commonly used include:

        java.lang: Contains fundamental classes such as String, Math, Object, and System. It is imported automatically in all programs.
        java.util: Contains utility classes for data structures (like ArrayList, HashMap), date and time operations, and the Collections framework.
        java.io: Provides classes for input and output operations, such as reading from and writing to files and streams.
        java.net: Contains classes for networking operations and building client-server applications.
        java.awt and javax.swing: Packages used for developing graphical user interfaces (GUIs).
        java.sql: Provides classes for interacting with databases using JDBC.
         */

        //below Objects go created from the Custom/User-Defined Classes.
        Tel_52_MO_Adv_Calc ObjAdvCalc = new Tel_52_MO_Adv_Calc(); //Object Creation done without any Error by Importing the required class.
        Tel_52_MO_Calc ObjCalc = new Tel_52_MO_Calc(); //Object Creation done without any Error by Importing the required class.

        //below is the Java Util Classes.
        ArrayList ObjArLst = new ArrayList();
        int result = ObjAdvCalc.add(20,30);

        System.out.println("Result::"+ result);
    }
}

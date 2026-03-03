package com.Tel.CoreJava;

public class Tel_51_This_And_Super_Method {


    public static void main(String[] args) {
        /* In Java,
        this and super keywords are reference variables used to manage access to members
        (variables, methods, and constructors) of the current and parent classes, respectively.

        -> this Keyword: 
           this keyword refers to the current object instance within a class.
         
         
           Accessing Instance Variables: It is primarily used to differentiate between local variables (like method parameters) 
                                         and instance variables that share the same name.
           java Program:
                    class Person {
                        String name;
                        Person(String name) {
                            this.name = name; // 'this.name' refers to the instance variable
                        }
                    }
           Invoking Current Class Methods: It can be used to call other methods of the same class explicitly, 
                                           though it is optional as the compiler adds it automatically.
           Constructor Chaining: this() (with appropriate parameters) is used to call another constructor within the same class, 
                                 enabling code reuse and organized initialization logic.
           Passing the Current Object: It can be passed as an argument to a method or constructor when a reference to the current object is needed.
        
                 
        -> super Keyword:
           super keyword refers to the immediate parent (superclass) object,
           primarily used in inheritance to access parent members and constructors.

         
           Accessing Parent Members: It distinguishes parent instance variables or methods from overridden ones in the subclass.
           Constructor Chaining: super() invokes the parent constructor and must be the first statement in the subclass constructor.

         
        Key Differences:
        Reference: this acts as a reference to the current class instance, while super refers to the immediate parent instance.
        Usage: this distinguishes instance variables from local variables, and super accesses hidden parent members.
        Constructors: this() enables constructor overloading within the same class, while super() invokes parent constructors.
        Usage Constraints: Both keywords are forbidden in static contexts and must be the initial statement within a constructor,
                           preventing them from being used together.
        */

        //Scenario - 01
        //Tel_51_Child_Or_Sub_Inherited ObjThisSuper = new Tel_51_Child_Or_Sub_Inherited();

        /*Scenario-01 Note: when we created Object of Child/Sub/Inherited class: Tel_51_Child_Or_Sub_Inherited,
        it will also call the Default Constructor of its own and Super/Parent Class: Tel_51_Parent_Or_Super.

        Output:
        Default Constructor of Class: Tel_51_Parent_Or_Super
        Default Constructor of Class: Tel_51_Child_Or_Sub_Inherited

        */

        //Scenario - 02
        //Tel_51_Child_Or_Sub_Inherited ObjThisSuper = new Tel_51_Child_Or_Sub_Inherited(7);

        /*Scenario-02 Note: when we created Object of Child/Sub/Inherited class: Tel_51_Child_Or_Sub_Inherited with a parameter,
        it will call the Parameterized Constructor of its own calls only the Default Constructor Super/Parent Class: Tel_51_Parent_Or_Super.

        Output:
        Default Constructor of Class: Tel_51_Parent_Or_Super
        Parameterized Constructor of Class: Tel_51_Child_Or_Sub_Inherited

        */

        //Note: By default Every Constructor has super() method inside of it, Syntax like below.

        /*below Both constructors are same
        Default:
                public Tel_51_This_And_Super_Method() {
                    }

        Default:
                public Tel_51_This_And_Super_Method() {
                    super();
                    }
         */

        //Scenario - 03
        //Tel_51_Child_Or_Sub_Inherited ObjThisSuper = new Tel_51_Child_Or_Sub_Inherited(7);

        /*Scenario-03 Note: when we created Object of Child/Sub/Inherited class: Tel_51_Child_Or_Sub_Inherited with a parameter also with
        super(7) in Parameterized Constructor, it will call the Parameterized Constructor of its own and Parameterized Constructor Super/Parent Class: Tel_51_Parent_Or_Super.

        Output:
       Parameterized Constructor of Class: Tel_51_Parent_Or_Super
       Parameterized Constructor of Class: Tel_51_Child_Or_Sub_Inherited

        */

        //Scenario - 04
        //Tel_51_Child_Or_Sub_Inherited ObjThisSuper = new Tel_51_Child_Or_Sub_Inherited();

        /*Scenario-04 Note: when we created Object of Child/Sub/Inherited class: Tel_51_Child_Or_Sub_Inherited also with
        super(7) in Default constructor, it will call the Default Constructor of its own and Parameterized Constructor Super/Parent Class: Tel_51_Parent_Or_Super.

        Output:
        Parameterized Constructor of Class: Tel_51_Parent_Or_Super
        Default Constructor of Class: Tel_51_Child_Or_Sub_Inherited


        */

        //Scenario - 05
        Tel_51_Child_Or_Sub_Inherited ObjThisSuper = new Tel_51_Child_Or_Sub_Inherited(5);

        /*Scenario-05 Note: when we created Object of Child/Sub/Inherited class: Tel_51_Child_Or_Sub_Inherited also with
        this() in Parameterized  constructor, it will call the Default Constructor of its own, Super/Parent Class and Parameterized Constructor Super/Parent Class: Tel_51_Parent_Or_Super.

        Output:
       Default Constructor of Class: Tel_51_Parent_Or_Super
       Default Constructor of Class: Tel_51_Child_Or_Sub_Inherited
       Parameterized Constructor of Class: Tel_51_Child_Or_Sub_Inherited


        */





    }
}

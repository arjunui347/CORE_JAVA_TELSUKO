public class Tel_50_Multiple_Inheritance {
    public static void main(String[] args) {

        /*
        Java does not support multiple inheritance of classes to avoid complexity and ambiguity issues like the "diamond problem".
         However, Java allows a class to implement multiple interfaces,
         which is the primary mechanism to achieve a form of multiple inheritance of type and, since Java 8,
         limited implementation via default methods.

        Why Multiple Inheritance is Not Allowed with Classes
        The main reason for disallowing multiple inheritance of classes is the "diamond problem". Consider this scenario:

        . Class  has a method .
        . Classes  and  inherit from  and both override  with their own implementations.
        . Class  attempts to inherit from both  and .
        . If you create an object of  and call , the compiler cannot determine which version of  to execute (from  or ), leading to ambiguity and a compile-time error.

        By restricting classes to a single direct superclass, Java ensures a clear and predictable inheritance hierarchy.
        How to Achieve Multiple Inheritance with Interfaces:
        Interfaces in Java provide a powerful and safe alternative. A class can implement any number of interfaces using the  keyword.
        Basic Interface Implementation:
         .Before Java 8, interfaces only defined abstract methods (methods without a body).
            The implementing class was responsible for providing the concrete implementation for all methods,
            which naturally resolved any ambiguity.
        ---------------------------------------------------------------------------------------------------
                    interface InterfaceA {
                void methodOne();
            }

            interface InterfaceB {
                void methodTwo();
            }

            // A class can implement multiple interfaces
            class MyClass implements InterfaceA, InterfaceB {
                public void methodOne() {
                    System.out.println("Implementation of methodOne");
                }

                public void methodTwo() {
                    System.out.println("Implementation of methodTwo");
                }
            }
        --------------------------------------------------------------------------------------------------
        .In this scenario, there's no conflict because the  provides the only implementation for both methods.
        .Using Default Methods (Java 8+) Java 8 introduced default methods in interfaces, which include method bodies.
            This allows interfaces to provide some functionality, making them a closer alternative to multiple inheritance of implementation.
        .If a class implements two interfaces that have the same default method signature, the compiler will flag an error,
            forcing the implementing class to override that specific method and explicitly choose which interface's
            implementation to use (or provide its own new one).

        Other Alternatives:

        . Composition over inheritance: Often considered a better object-oriented practice,
          composition involves a class containing instances of other classes to reuse their functionality, rather than inheriting from them.
        . A class can also extend one class and implement multiple interfaces, which is a common pattern in
          Java to combine single implementation inheritance with multiple type inheritance.



         */

    }
}

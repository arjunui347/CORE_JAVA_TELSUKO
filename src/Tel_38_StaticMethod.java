public class Tel_38_StaticMethod {

    /*A static method in Java is a method that belongs to the class itself,
    rather than to any specific instance (object) of that class. It can be called directly using the class name,
    without the need to create an object, making it useful for utility functions and shared operations.

    Key Characteristics:
        Invocation: Static methods are called using the class name (e.g., ClassName.methodName()), not an object reference.
        No Object Required: They can be executed even if no objects of the class have been created.
                            The main method is a prime example, as it is the entry point for a Java program and must be callable by the JVM
                            before any objects exist.
        Access Restrictions: A static method can only directly access other static variables and static methods of the class.
                             It cannot directly access instance variables or non-static (instance) methods because it is not associated with a
                             specific object's state (this reference is not available).
        Memory Efficiency: Static methods and variables are loaded into memory once when the class is loaded,
                           and that single copy is shared across all potential instances.
        Overriding: Static methods cannot be overridden in the way instance methods are (runtime polymorphism).
                    If a subclass declares a static method with the same signature, it is considered method hiding, not overriding.
        Syntax:
        The static keyword is used in the method declaration:
        java
        public class Calculator {
            // Static method for addition
            public static int add(int a, int b) {
                return a + b;
            }
        }

        Calling a Static Method:
        From another class: Use the class name: int sum = Calculator.add(5, 10);
        From the same class: The class name can be omitted: add(5, 10);

        Common Use Cases:
            Utility/Helper Classes: Classes like Java's built-in Math class or Collections provide a collection of static methods for common,
            reusable operations that don't rely on object-specific data.
            Factory Methods: Used in design patterns (like the Singleton pattern) to control object creation and return a single instance of a class.
            Constants: Accessing static final variables (constants).
            Program Entry Point: The mandatory public static void main(String[] args) method.
 */

    public static void main(String[] args) {

        MobileMethod mobileMethod1 = new MobileMethod();
        mobileMethod1.Brand= "Vodafone";
        mobileMethod1.Price = 1400;
        MobileMethod.Name = "KeyPadPhone1";

        MobileMethod mobileMethod2 = new MobileMethod();
        mobileMethod2.Brand= "Nokia";
        mobileMethod2.Price = 2500;
        MobileMethod.Name = "KeyPadPhone2";
        System.out.println("Before changes::::");

        mobileMethod1.show();
        mobileMethod2.show();

        System.out.println("AFTER changes::::");

        MobileMethod.Name = "KeyPadPhone"; // we can call static variable directly using class Name.
        mobileMethod1.show();
        mobileMethod2.show();
    }


}

class MobileMethod {
    String Brand;
    int Price;
    //String Name;
    //change the name to static variable like Below.
    static String Name = "Phone";

    //this is an Instance method, we have to create an object to call this method.
    public void show(){
        System.out.println(Brand + " : " + Price + " : " + Name);
    }

    //this is a static method, we can call this method using class name and non-static variables are called using object only.
    public static void showStatic(MobileMethod Obj){
        System.out.println(Obj.Brand + " : " + Obj.Price + " : " + Name);
    }

}

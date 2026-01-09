public class Tel_46_AnonymousObject {

/*
     An anonymous object in Java is an object that is created without assigning it to a reference variable.
     This means you can instantiate a class and call its methods in a single expression,
     and the object is eligible for garbage collection once that expression is finished and it is no longer reachable.

    Anonymous objects are useful for one-time operations when you don't need to reuse the object elsewhere in your code.
    How to Create an Anonymous Object
    The syntax for creating an anonymous object is straightforward: you use the  keyword followed by the class name,
    constructor arguments, and a direct method call using dot notation, all in one line.

    new ClassName().methodName();

---------------------------------------------------------------------------------------------------------------------
    Examples and Use Cases:
    Here are common scenarios where anonymous objects are used:
----------------------------------
    • Calling a method only once: When you need to perform a single action defined in a class method.

    class Person {
        void call(String name) {
            System.out.println("Hello, " + name + "!");
        }
    }

    // Creating an anonymous object to call the 'call' method once
    new Person().call("Jose"); // Output: Hello, Jose!
------------------------------------
    • Passing objects as method arguments: Anonymous objects are often created inline when a method requires an object as a parameter,
        and that specific object instance isn't needed again.

        public void printArea(Calculation calc) {
        calc.area();
    }

    // Passing an anonymous object as an argument
    printArea(new Calculation(50)); // Uses an object created just for this call
-----------------------------------
    • Event handling (GUI programming): They are frequently used in AWT or Swing for one-off event listeners,
      although lambda expressions (introduced in Java 8) are now more common for functional interfaces.
------------------------------------------------------------------------------------------------------------------------
    Key Characteristics and Considerations:

    • No Reference Variable: The primary characteristic is the lack of a named variable pointing to the object.
    • One-Time Use: They are best suited for single operations. You cannot access the same object instance again
      after the statement where it was created is executed.
    • Memory Efficiency: By using anonymous objects for one-off tasks, you avoid cluttering the namespace with unnecessary variable names,
      and the objects become eligible for garbage collection more quickly.
    • Not the same as "anonymous inner classes": While related, an anonymous object is a nameless instance of a named class,
      whereas an anonymous inner class is a class that is declared and instantiated without a name,
      typically used to implement an interface or extend an abstract class.
 */
public static void main(String[] args) {
    //    Anonymous Obj;//this is Object Reference Creation.
    //    Obj = new Anonymous(); //Object assigned to Reference

    new Anonymous(); // Anonymous Object created.

    new Anonymous().show(); // Anonymous Object created and called show().


}

}


class Anonymous {

    public Anonymous() {
        System.out.println("In Constructor");
    }

    public void show(){
        System.out.println("In a show method");
    }
}

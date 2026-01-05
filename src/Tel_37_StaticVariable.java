public class Tel_37_StaticVariable {
    /*
    Static variables in Java, also known as class variables,
    are declared using the static keyword within a class but outside of any method,
    constructor, or block.
    They are associated with the class itself rather than with any specific instance (object) of that class.
    1.Key characteristics of static variables:
      a.Shared across instances:
            All instances of a class share a single copy of a static variable.
            Changes made to a static variable through one instance will be reflected when accessed
            through any other instance or directly via the class name.
    2.Memory allocation:
        Static variables are allocated memory only once,
        when the class is loaded into the Java Virtual Machine (JVM),
        and they persist in memory until the program terminates.
        This differs from instance variables, which are allocated memory with each new object creation.
    3.Access:
        Static variables can be accessed directly using the class name,
        without needing to create an object of the class. For example, ClassName.staticVariable.
    4.Default values:
        Like instance variables, static variables are automatically initialized with default values
        if not explicitly assigned: 0 for numeric types, false for booleans, and null for object references.
    5.Use cases:
        Static variables are commonly used for values that should be shared globally within a class, such as:
          a.Counters: To keep track of the number of objects created for a class.
          b.Constants: Declared as public static final to represent immutable values that are accessible throughout the application.
          c.Configuration settings: To store application-wide settings.
          */
    public static void main(String[] args) {
        
        Mobile mobile1 = new Mobile();
        mobile1.Brand= "Vodafone";
        mobile1.Price = 1400;
        //mobile1.Name = "KeyPadPhone";

        Mobile mobile2 = new Mobile();
        mobile2.Brand= "Nokia";
        mobile2.Price = 2500;
        //mobile2.Name = "KeyPadPhone2";
        System.out.println("Before changes::::");

        mobile1.show();
        mobile2.show();

        System.out.println("AFTER changes::::");

        Mobile.Name = "KeyPadPhone"; // we can call static variable directly using class Name.
        mobile1.show();
        mobile2.show();



    }


}

class Mobile {
    String Brand;
    int Price;
    //String Name;
    //change the name to static variable like Below.
    static String Name = "Phone";

    //this is an Instance method, we have to create an object to call this method.
    public void show(){
        System.out.println(Brand + " : " + Price + " : " + Name);
    }
}

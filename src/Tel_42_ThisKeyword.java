public class Tel_42_ThisKeyword {

    /*
    this keyword in Java is a reference variable that refers to the current object
    (the instance of the class) within a method or a constructor.

    It is primarily used to eliminate ambiguity between instance variables and local variables
    (including method or constructor parameters) that have the same name.

    Primary Uses of the this Keyword:
    To refer to current class instance variables: This is the most common use, ensuring you are accessing
    the object's field and not a local variable or parameter with the same name.

    To invoke the current class constructor (this()): You can call one constructor from another within the same class.
                                                      This is useful for code reuse and is called constructor chaining.
                                                      The call to this() must be the first statement in the constructor.


    To invoke the current class method: Although method calls are often implicit, using this.methodName()
                                        explicitly shows that an instance method of the current object is being called.
    To pass the current object as an argument: this keyword can be passed to another method or constructor when the recipient needs a reference to the current object.
                                               This is often used in event handling or data exchange between objects.
    To return the current class instance: A method can return this to allow for method chaining
                                          (e.g., object.method1().method2().method3();).
    Important Note:
    this keyword cannot be used within a static method or a static block because static members belong to the class itself,
    not to a specific object instance.

         */


    public static void main(String[] args) {
        StudentDetails myObj = new StudentDetails();
        myObj.setId(10329);
        myObj.setName("arjun"); // Set the value using the setter
        System.out.println(myObj.getName()); // Get and print the value using the getter
        System.out.println(myObj.getId());
    }
}


class StudentDetails {
    int id; // Instance variable
    String name; //Instance variable


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name; // "this.name" refers to the instance variable
    }

    public int getId() {
        return id; // "this.id" refers to the instance variable
    }

    public void setId(int id) {
        this.id = id;
    }
}

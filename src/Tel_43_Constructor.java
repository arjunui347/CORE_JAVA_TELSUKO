public class Tel_43_Constructor {

    /*
    A constructor in Java is a special block of code used to initialize objects when they are created.
    It sets the initial state of an object by assigning values to its instance variables and is automatically invoked when the new keyword is used.

    Key Characteristics:
    Same Name as Class: A constructor's name must exactly match its class name.
    No Return Type: It does not have a return type, not even void.
    Automatic Invocation: It is called implicitly by the Java runtime when an object is instantiated.
    Initialization Focus: Its primary purpose is to ensure that a newly created object starts in a valid state.
    Types of Constructors:
    Java generally recognizes three types of constructors:
    Default Constructor: If you don't define any constructor in a class, the Java compiler automatically provides a no-argument default constructor.
                         This constructor initializes instance variables with default values (e.g., 0 for int, null for String, false for boolean).
    No-Argument Constructor (No-Args): This is a constructor you explicitly write that takes no parameters.
                                       It overrides the compiler's default constructor and allows you to define custom initialization logic,
                                       even if it has an empty body.
    Parameterized Constructor: This constructor takes one or more arguments. It allows you to initialize an object's instance variables with specific,
                               user-defined values at the time of creation.

*/
    public static void main(String[] args) {
        Human myObj = new Human();
        System.out.println("after Object Creation::::"+myObj.getAge()+"::::"+myObj.getName());

        //myObj.setId(10329);
        //myObj.setName("arjun"); // Set the value using the setter
        //System.out.println(myObj.getName()); // Get and print the value using the getter
        //System.out.println(myObj.getId());
    }
}

class Human{
    int age; // Instance variable
    String name; //Instance variable

    //Constructor Creation
    public Human() {
        System.out.println("Inside Of Constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Tel_44_Parameterized_Constructor {

    /*
    A parameterized constructor in Java is a constructor that accepts one or more arguments (parameters).
    It is used to initialize the instance variables of a new object with specific, user-defined values at the time of its creation, rather than using default values.
    Key Concepts:
    Initialization with Specific Values: Unlike a default (no-argument) constructor, which assigns default values
                                         (e.g., 0 for int, null for String) or does nothing,
                                         a parameterized constructor ensures an object starts in a valid, programmer-defined state.
    Explicit Definition: The programmer must explicitly define a parameterized constructor. If any constructor (parameterized or otherwise) is defined in a class,
                         the Java compiler will not automatically provide the default no-argument constructor.
    Constructor Overloading: A class can have multiple constructors with the same name (the class name) but different parameter lists
                            (different number or types of parameters). This is known as constructor overloading and provides flexibility in object creation.
    No Return Type: Like all constructors, a parameterized constructor has no return type, not even void.

    Syntax:
    public class ClassName {
        private dataType field1;
        private dataType field2;

        // Parameterized constructor
        public ClassName(dataType param1, dataType param2) {
            this.field1 = param1;
            this.field2 = param2;
        }
    }

    * */

    public static void main(String[] args) {
        HumanParameter myObj = new HumanParameter();
        System.out.println("after Object Creation Updated with Constructor Default Values::::"+myObj.getAge()+"::::"+myObj.getName());

        myObj.setAge(35);
        myObj.setName("arjun"); // Set the value using the setter
        System.out.println("setting with new values ::::"+myObj.getAge()+"::::"+myObj.getName());

        HumanParameter myObjParam = new HumanParameter(30,"Priyanka");
        System.out.println("after Object Creation Updated with Parameter values::::"+myObjParam.getAge()+"::::"+myObjParam.getName());
    }
}



class HumanParameter{
    int age; // Instance variable
    String name; //Instance variable

    /*Constructor Creation / default Constructor Creation with added printing statement */
    public HumanParameter() {
        System.out.println("Inside Of Constructor");
    }

    //Parameterized Constructor.
    public HumanParameter(int age, String name) {
        this.age = age;
        this.name = name;
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
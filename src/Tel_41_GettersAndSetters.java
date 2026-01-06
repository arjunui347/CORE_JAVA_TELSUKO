public class Tel_41_GettersAndSetters {

    /*
    Getters and setters are public methods in Java used to retrieve and update the values of private variables (fields) within a class.
    They are a core mechanism for implementing encapsulation, one of the fundamental principles of Object-Oriented Programming (OOP).
    Purpose and Benefits:
    Encapsulation: Getters and setters hide the internal state of an object from the outside world, preventing direct,
                   unauthorized access to its data.
    Data Validation: Setter methods provide a centralized point to validate data before it modifies an object's state,
                     ensuring data integrity. For example, you can add logic to ensure an age is a positive number.
    Controlled Access: You can make fields read-only by providing only a getter, or write-only by providing only a setter.
    Flexibility and Maintainability: If the internal data representation needs to change in the future,
                                     you only need to modify the logic within the getter or setter methods.
                                     The external code that uses these methods remains unaffected.
    Naming Conventions:
    By convention (following the JavaBeans standard), getter methods start with get and setter methods start with set,
    followed by the field name with the first letter capitalized. For boolean fields, the getter typically starts with is.

    Integrated Development Environments (IDEs) like Eclipse, IntelliJ, and VS Code can automatically generate these methods for you,
    reducing boilerplate code. Project Lombok also offers annotations (@Getter, @Setter) to generate them automatically during compilation.

     */

    public static void main(String[] args) {
        PersonGetterSetter myObj = new PersonGetterSetter();
        myObj.setName("arjun"); // Set the value using the setter
        System.out.println(myObj.getName()); // Get and print the value using the getter
    }
}

    class PersonGetterSetter {
    // Private field (data is hidden)
    private String name;

    // Public getter method to read the 'name'
    public String getName() {
        return name;
    }

    // Public setter method to write to the 'name'
    public void setName(String newName) {
        // Optional: add validation logic here
        if (newName != null && !newName.isEmpty()) {
            this.name = newName;
        }
    }
}


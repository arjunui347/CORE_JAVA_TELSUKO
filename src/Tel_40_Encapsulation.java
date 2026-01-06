public class Tel_40_Encapsulation {
    /* Encapsulation in Java is a core concept of Object-Oriented Programming (OOP).
        It refers to the process of bundling data (variables) and the methods that operate on that data into a single unit, known as a class.

        The primary purpose of encapsulation is data hiding,
        which restricts direct access to an object’s internal state and helps protect its integrity.

        How to Implement Encapsulation:

        Encapsulation is implemented using the following two steps:

        1.Declare class variables as private

        2.This prevents direct access to variables from outside the class.

        3.Provide public getter and setter methods

        4.Getter methods are used to read variable values.

        5.Setter methods are used to modify variable values in a controlled way.

        Benefits of Encapsulation:

        Data Security and Integrity:
        Protects data from unauthorized access and ensures modifications occur only through class methods,
        allowing validation (e.g., preventing negative values).

        Modularity and Maintainability:
        Internal implementation can be changed without affecting other parts of the program,
        as long as the public interface remains unchanged.

        Flexibility:
        Variables can be made:

        Read-only (by providing only a getter)

        Write-only (by providing only a setter)

        Easier Testing:
        Encapsulated code is easier to unit test since components are self-contained and interactions are controlled.
*/
    public static void main(String[] args) {

        Person myObj = new Person();
        myObj.setName("Mallikharjuna"); // Set the value using a setter
        myObj.setAge(35);      // Set age with validation

        System.out.println(myObj.getName()); // Output: John (using a getter)
        System.out.println(myObj.getAge());  // Output: 30

        myObj.setAge(150); // This will print an error message but not change the age field

        System.out.println("age after changes::::"+myObj.getAge());


    }
}


class Person{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120) { // Validation for age
            this.age = age;
        } else {
            System.out.println("Invalid age value attempted: " + age);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
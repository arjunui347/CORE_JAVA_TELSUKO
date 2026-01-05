public class Tel_39_StaticBlock {

    /* A static block in Java is a block of code associated with the static keyword that is automatically executed only once,
    when the class is first loaded into memory by the Java Virtual Machine (JVM).
    It is primarily used for initializing static variables that require complex setup logic.

    Key Characteristics:
    Execution Timing: A static block runs as soon as its containing class is loaded by the class loader,
                      which happens even before the main method or any constructors are called.

    Execution Frequency: It is executed only once during the entire program lifecycle, regardless of how many objects of the class are created.

    Syntax: It is defined using the static keyword followed by curly braces {}.

    java:
    public class MyClass {
        static {
            // Code inside the static block
            System.out.println("Static block executed.");
        }

        public static void main(String[] args) {
            System.out.println("Main method executed.");
        }
    }
    // Output:
    // Static block executed.
    // Main method executed.


    Access Restrictions: Static blocks can only directly access other static members (variables and methods)
                         of the class because instance members belong to specific objects which haven't been created yet when the block runs.
    Multiple Blocks: A class can have multiple static blocks, which are executed sequentially in the order they appear in the source code.

    Common Uses:
    Static blocks are useful for tasks that need to be performed once at the class level:
    Complex Static Variable Initialization: For variables (like a static Map or an array) that cannot be initialized in a single line.
    Loading Resources: Loading native libraries (e.g., using System.loadLibrary()), configuration settings from a file or database, or setting up connections.
    Exception Handling: Handling exceptions that might occur during static initialization, which is difficult with simple variable assignment.

    Static Block vs. Constructor
    Feature 	                Static Block	                                    Constructor
    Execution	        Once, when the class is loaded.	            Every time a new object instance is created.
    Purpose	        Initializes static variables/resources. 	    Initializes instance variables for an object.
    Access	        Can only access static members directly.	    Can access both static and instance members.
    Keyword	        Uses the static keyword.	                        Has the same name as the class.
    */


    public static void main(String[] args) {

        MobileMethodBlock mobileMethod1 = new MobileMethodBlock();
        mobileMethod1.Brand= "Vodafone";
        mobileMethod1.Price = 1400;
        MobileMethod.Name = "KeyPadPhone1";

        MobileMethodBlock mobileMethod2 = new MobileMethodBlock();



    }
}

 class MobileMethodBlock {
            String Brand;
            int Price;
            //String Name;
            //change the name to static variable like Below.
            static String Name;

            //constructor created for updating the default values during Object Creation.
            public MobileMethodBlock() {
                Brand= "";
        Price = 200;
        System.out.println("Inside Constructor");
    }

    //whn ever class loads static block will execute always first.
    static
    {
        Name= "Phone";
        System.out.println("Inside static block");
    }

    /*Note: when ever object creation starts then only class Loads and then static block executes first and calls only once as Class loads during first Object creation itself.
     and constructor will get called for every object creation.*/

    //this is an Instance method, we have to create an object to call this method.
    /* public void show() {
        System.out.println(Brand + " : " + Price + " : " + Name);
    }*/
}

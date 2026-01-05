public class Tel_34_String_Introduction {
     /* In Java, a String is an object that represents a sequence of characters.
           It is a fundamental class in the java.lang package and is widely used for handling text data.
        1.Key characteristics of Java Strings:
            a.Immutable:
                Once a String object is created, its content cannot be changed.
                Any operation that appears to modify a String (like concatenation or toUpperCase())
                actually creates a new String object with the modified content.
        2.Object, not primitive:
            Unlike int or char, String is a class, and String variables are instances of this class.
        3.Creation:
            Strings can be created in two primary ways:
            a.String literals: String greeting = "Hello world!";
                This is the most common and direct way.
                Java places string literals in a special memory area called the "String pool" for efficiency.
            b.Using the new keyword: String name = new String("John Doe");
                This explicitly creates a new String object in the heap,
                even if an identical string exists in the String pool.
        4.Methods:
            The String class provides a rich set of methods for various operations, including:
            Length: length()
            Case conversion: toUpperCase(), toLowerCase()
            Comparison: equals(), equalsIgnoreCase(), compareTo()
            Searching: indexOf(), contains()
            Substring extraction: substring()
            Concatenation: Can be done using the + operator or the concat() method.  */

    public static void main(String[] args) {

        //Regularly string will be use like below.
        String strName = "Arjun";
        System.out.println(strName);

        //by seeing above DataType it starts with Capital letter 'S'
        //Other than string if you are using the Datatypes int,long,double,char..... these are all starts with small letters.
        //if we hover the cursor on String, it will show us that it is a Class.
        //as String is class, we can use like below also, but it will like same with above Syntax also.
        String strName1 = new String("Ganishka"); // it will give some warnings.
        System.out.println(strName1);
        //we can use all the String related methods same as Object creation for regular syntax like above/below.
        String strName2 = "Mokshith";
        System.out.println(strName1);
        System.out.println(strName1.length());
        System.out.println(strName1.concat("_Amma"));
    }
}

public class Tel_35_Mutable_Immutable_String {
     /*In Java, objects are categorized as mutable or immutable based on
        whether their internal state can be altered after they are created*/

        /*
        * Mutable Objects:
1. A mutable object's state can be changed after its creation.
  This means the values of its fields can be modified.
2. Examples include StringBuilder, ArrayList, HashMap,
   and custom classes with setter methods that allow modification of their fields.
3. When a method modifies a mutable object, it changes the original object in memory.
4. Mutable objects are generally not thread-safe by default, as multiple threads concurrently
   modifying the same object can lead to data inconsistencies. Synchronization mechanisms are often required for safe concurrent access.
         */

        /* Immutable Objects:
1. An immutable object's state cannot be changed once it is created.
    All its fields are effectively "final" after instantiation.
2. Examples include String, Integer, Long, Boolean, and other wrapper classes for primitive types.
3. Any operation that appears to modify an immutable object,
    such as concatenating a String, actually results in the creation of a
    new immutable object with the modified state. The original object remains unchanged.
4. Immutable objects are inherently thread-safe because their state
    cannot be modified after creation, eliminating the risk of concurrent modification issues.
5. To create an immutable class, all fields should be declared private final,
   and no setter methods should be provided. Additionally,
   if the class contains mutable objects as fields,
    deep copies of those objects should be made during construction and
    when returning them from getter methods to prevent external modification. */

    public static void main(String[] args) {
        //Notes: Strings are always Immutable.
        String strName = "Mallikharjuna";
        String strName1 = "Mallikharjuna";
        System.out.println(strName1.hashCode());
        System.out.println(strName1.hashCode());
        //Result:
        /* "C:\Program Files\Java\jdk-24\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2025.1.3\lib\idea_rt.jar=52767"
        -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath
         C:\Users\arjun\IdeaProjects\CORE_JAVA_TELSUKO\out\production\CORE_JAVA_TELSUKO Mutable_Immutable_String_35
            -337274047
            -337274047*/
        // as we have the same name with 2 different String Datatypes but heap memory address is same.
    }
}

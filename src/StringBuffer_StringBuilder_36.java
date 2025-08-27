public class StringBuffer_StringBuilder_36 {
    /*
        * In Java, both StringBuffer and StringBuilder are mutable classes used for manipulating
        sequences of characters, providing an alternative to the immutable String class.
        The key differences between them lie in thread safety and performance:
        1. Thread Safety (Synchronization):
            a. StringBuffer: It is thread-safe and synchronized.
                This means that its methods are designed to be accessed by only one thread at a time,
                preventing data corruption in multi-threaded environments.
                This synchronization comes with a performance overhead.
            b. StringBuilder: It is not synchronized and therefore not thread-safe.
                Multiple threads can access and modify a StringBuilder instance concurrently,
                which can lead to unpredictable results in a multi-threaded context.
        2.Performance:
            a. StringBuilder: Due to the lack of synchronization,
                StringBuilder generally offers better performance than StringBuffer in single-threaded environments.
                It avoids the overhead associated with managing concurrent access.
            b. StringBuffer: The synchronization mechanism makes StringBuffer slower than
                StringBuilder in single-threaded scenarios because of the overhead of acquiring and
                releasing locks for each operation.
        3.When to Use Which:
            a. StringBuffer:
                Use StringBuffer when you are working in a multi-threaded environment and require
                thread safety for your string manipulations.
            b. StringBuilder:
                Use StringBuilder when you are working in a single-threaded environment or
                when thread safety is not a concern, as it provides better performance.
        4.In summary:
                If you need to modify strings frequently and are operating in a single-threaded context,
                StringBuilder is the preferred choice for its performance benefits.
                If thread safety is a requirement in a multi-threaded application,
                StringBuffer is the appropriate option despite its performance overhead.
         */
    public static void main(String[] args) {

        //Basically String Buffer has some default Capacity : 16
        StringBuffer sbName = new StringBuffer();
        System.out.println("Default Capacity:::" + sbName.capacity());
        System.out.println("Default length:::" + sbName.length()); //default length is 0 only

        //if we assign some value to StringBuffer it will Extent the Capacity of assigned value with Default Capacity
        //Example: StringBuffer sbName = new StringBuffer("Malli"); //added 5 characters, so new capacity is 21
        StringBuffer sbName1 = new StringBuffer("Malli");
        System.out.println("Capacity:::" + sbName1.capacity());
        System.out.println("length:::" + sbName1.length()); // length will give same as assigned.

        //we can append data for StringBuffer using Below.
        System.out.println("StringBuffer Value:::" + sbName1);
        sbName1.append("kharjuna");
        System.out.println("StringBuffer Value after appending:::" + sbName1);

        //we can convert String Buffer into String also.
        String strName = sbName1.toString();
        System.out.println("String Value:::" + strName);

        //we can also delete some value at required position.
        sbName1.deleteCharAt(6);
        System.out.println("StringBuffer Value after deleting at particular position:::" + sbName1); //result : mallikarjuna.

        //we can Insert some value at particular position also.
        sbName1.insert(6,"h");
        System.out.println("StringBuffer Value after Inserting at particular position:::" + sbName1); //result : mallikharjuna.

        //as minimum Capacity is 16, we can also make minimum capacity to required value (Example: 100)
        System.out.println("Default Capacity:::" + sbName.capacity());
        sbName.ensureCapacity(100); //16
        System.out.println("Default Capacity after Increase:::" + sbName.capacity()); //100

        //as default length is 0, we can set(Increase) the length also as required.
        System.out.println("Default length:::" + sbName.length()); //default length is 0 only
        sbName.setLength(30);
        System.out.println("length after setting:::" + sbName.length()); //length is 30

        //StringBuilder concept yet to discuss it.

    }
}

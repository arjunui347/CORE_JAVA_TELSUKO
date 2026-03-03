public class Tel_52_Method_Overriding {
    public static void main(String[] args) {
        /*
        Method overriding in Java is a feature that allows a subclass to provide a specific implementation of a method
        that is already defined in its superclass. This mechanism enables runtime (dynamic) polymorphism,
        where the actual object type determines which method is executed.

        Key Rules and Best Practices:
        Requirements: Involves an inheritance relationship, with the subclass method matching the name, return type,
                      and parameter list of the parent method.
        Execution: Polymorphism occurs at runtime, with the JVM calling the method based on the actual object.
        Restrictions: final, static, and private methods cannot be overridden. Subclass methods cannot have more restrictive access.
        Usage: The @Override annotation is recommended for compiler-checked validation.

         */

        Tel_52_MO_Adv_Calc ObjMethodOverride = new Tel_52_MO_Adv_Calc();
        int iResult = ObjMethodOverride.add(10,20);
        System.out.println("Final result:::"+iResult);

    }
}

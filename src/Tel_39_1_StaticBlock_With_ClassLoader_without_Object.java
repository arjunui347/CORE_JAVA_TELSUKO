public class Tel_39_1_StaticBlock_With_ClassLoader_without_Object {

    public static void main(String[] args) throws ClassNotFoundException {

        //Class Loader without Object Creation.
        Class.forName("MobileMethodBlockClassLoader");



    }
}

class MobileMethodBlockClassLoader {
    String Brand;
    int Price;
    //String Name;
//change the name to static variable like Below.
    static String Name;

    //constructor created for updating the default values during Object Creation.
    public MobileMethodBlockClassLoader() {
        Brand = "";
        Price = 200;
        System.out.println("Inside Constructor");
    }

    //whn ever class loads static block will execute always first.
    static {
        Name = "Phone";
        System.out.println("Inside static block");
    }

    /*Note: when ever object creation starts then only class Loads and then static block executes first and calls only once as Class loads during first Object creation itself.
     and constructor will get called for every object creation.*/

//this is an Instance method, we have to create an object to call this method.
    /* public void show() {
        System.out.println(Brand + " : " + Price + " : " + Name);
    }*/
}

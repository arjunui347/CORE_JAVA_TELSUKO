public class TypeConversionAndTypeCasting {
    public static void main(String[] args) {
        byte b = 127;
        System.out.println("Byte value===" + b);
        
        //Type Conversion
        //byte b1 = 257;//this will through an error and due to range of byte.
        byte b1 = 117;
        int a = b1;
        System.out.println("Integer value after conversion===" + a);

        //Type Casting
        int a2 =12;
        //byte b2 = a2; //this will fail with Incompatible Type.
        byte b2 = (byte)a2; //Casting will work with in the range of byte.
        System.out.println("byte value after Casting===" + b2);

        float f = 5.6f;
        //int t = f;//this will fail with Incompatible Type.
        int t = (int)f;
        System.out.println("Integer value after casting===" + t);

        //TypeCasting wit out of range.
        int a3 = 300;
        //byte b3 = a3; //this will fail with Incompatible Type.
        byte b3 = (byte)a3; //Casting will work if value is out of range of byte also (300%128 = 44)
        System.out.println("byte value after Casting with out of range===" + b3);

        //Type promotion
        byte bt1 = 10;
        byte bt2 = 40;

        int nt = bt1*bt2; //as the result will cross the Byte range assigning to integer (Type promotion)
        System.out.println("Integer value after multiplying two bytes===" + nt);
    }
}
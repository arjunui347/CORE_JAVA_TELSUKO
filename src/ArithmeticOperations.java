public class ArithmeticOperations {
    public static void main(String[] args) {

        int a = 7;
        int b= 4;
        int result = a+b;
        System.out.println("result after addition==" + result);
        result = a-b;
        System.out.println("result after Substraction==" + result);
        result = a*b;
        System.out.println("result after Multiplcation==" + result);
        result = a/b;
        System.out.println("result after Divison==" + result);
        result = a%b;
        System.out.println("result after Modulus(reminder)==" + result);

        //Arithmetic Operations Dynamic values
        result = a+2;
        System.out.println("result after addition with 2 Dynamically==" + result);
        result = a-2;
        System.out.println("result after Subtraction with 2 Dynamically==" + result);
        result = a*2;
        System.out.println("result after Multiplication with 2 Dynamically==" + result);
        result = a/2;
        System.out.println("result after divison with 2 Dynamically==" + result);
        result = a%2;
        System.out.println("result for reminder with 2 Dynamically==" + result);

        //post-Increment
        result = a++;
        System.out.println("result post-Increment=" + result);//7

        //pre-Increment
        result = ++a;// (already Increment to 8 and Incremented again 9)
        System.out.println("result pre-Increment=" + result);//9
    }    
}

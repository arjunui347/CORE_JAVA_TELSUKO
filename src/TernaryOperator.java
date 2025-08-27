public class TernaryOperator {
    public static void main(String [] args){
        int n = 4;
        int result = 0;

        // if(n%2 == 0)
        //     result = 10;
        // else
        //     result = 20;

        //we can replace the above code by using Ternary Operator.
        //?: ternary Operator.
        result = n%2==0 ? 10 : 20; //Ternary operation.

        System.out.println(result);

    }
}
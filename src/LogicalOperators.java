public class LogicalOperators {
    
    public static void main(String[] args) {
        int a = 6;
        int b = 7;
        int x = 5;
        int y = 8;

        boolean result = a>b && x<y;
        System.out.println("result value after first logical operation== " + result);
        System.out.println("result value after first logical operation with not operation== " + !result);

        result = a<b && x<y;
        System.out.println("result value after second logical operation== " + result);
        System.out.println("result value after sB B BKKKKecond logical operation with not operation== " + !result);

        result = a<b && x>y;
        System.out.println("result value after third logical operation== " + result);
        System.out.println("result value after third logical operation with not operation== " + !result);

        result = a>b && x>y;
        System.out.println("result value after fourth logical operation== " + result);
        System.out.println("result value after fourth logical operation with not operation== " + !result);

        result = !(a<b);
        System.out.println("result value after 5th logical operation== " + result);

    }
    
}

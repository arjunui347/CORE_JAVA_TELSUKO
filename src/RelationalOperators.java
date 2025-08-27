public class RelationalOperators {
    public static void main(String[] args) {

        int x=5;
        int y=6;

        boolean result = x>y;
        System.out.println("result1 == " + result);
        result = x<y;
        System.out.println("result2 == " + result);

        int x1 = 6;
        int y1 = 6;
        result = x1==y1;
        System.out.println("result3 == " + result);

        int x2 = 5;
        int y2 = 6;
        result = x2 <= y2;
        System.out.println("result4 == " + result);
        result = x2 >= y2;
        System.out.println("result5 == " + result);
        result = x2 == y2;
        System.out.println("result6 == " + result);
        result = x2 != y2;
        System.out.println("result7 == " + result);

        double d1 = 25.6;
        double d2 = 23.56;

        result = d1 == d2;
        System.out.println("result8 for double comparison == " + result);
        result = d1 != d2;
        System.out.println("result9 for double comparison == " + result);



    }
}

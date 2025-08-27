public class ConditionalStatements2 {

    public static void main(String[] args) {
        int x = 8;
        int y = 7;
        int z = 9;
        if (x>y && x>z){
            System.out.println(" x is greater than  y & z" + x);

        }else if (y>z && y>x){
            System.out.println(" y is greater than  x & z" + y);

        }else {
            System.out.println(" z is greater than  x & y" + z);
        }
    }
}

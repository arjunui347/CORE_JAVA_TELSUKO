public class Tel_07_Literals {
    public static void main(String[] args) {
        //literals in Decimal format.
        int num1 = 9;
        int num2 = 7389;

        System.out.println("num1===" + num1);
        System.out.println("num2===" + num2);

        //literals in binary format
        int bNum = 0b1011;
        System.out.println("bNum===" + bNum);

        //literal in Hexa Decimal format
        int hNum = 0x7E;
        System.out.println("hNum===" + hNum);

        //literals with more no.of same type of numbers
        //able to differenciate numbers with underscore to know exact number
        int sNum  = 100000000;
        int sNum1 = 10_00_00_000;
        System.out.println("sNum===" + sNum + "," + "sNum1===" + sNum1);

        int sNum2  = 19_99_99_999;
        int sNum3  = 199999999;
        System.out.println("sNum2===" + sNum2 + "," + "sNum3===" + sNum3);

        int sNum4  = 123456789;
        int sNum5  = 12_34_56_789;
        System.out.println("sNum4===" + sNum4 + "," + "sNum5===" + sNum5);

        //literals with double
        double  dNum = 58; //assigned Integer value to double, but double accepted
        System.out.println("dNum===" + dNum);

        double dNum1 = 12e10; //12 X 10^10
        System.out.println("dNum1===" + dNum1);



        //literals with boolean
        boolean b = true;
        boolean b1 = false;
        //boolean b2 = 1; //Integer can't be converted into boolean
        System.out.println("b===" + b);
        System.out.println("b1===" + b1);
        //System.out.println("b2===" + b2);



        //literals with character
        char ch = 'b';
        System.out.println("ch value before increment===" + ch);//ch value before increment===b

        //lets try increment operation character

        ch++;
        System.out.println("ch value after increment===" + ch);//ch value after increment===c


    }
    
}

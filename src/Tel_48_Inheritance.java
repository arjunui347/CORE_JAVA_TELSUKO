public class Tel_48_Inheritance {

    public static void main(String[] args) {
        Tel_48_AdvanceCalculator AdvanCal = new Tel_48_AdvanceCalculator();
        int result1 = AdvanCal.add(2,5);
        int result2 = AdvanCal.sub(9,5);
        int result3 = AdvanCal.multi(2,5);
        int result4 = AdvanCal.div(10,5);

        System.out.println("addition::::"+result1);
        System.out.println("Subtraction::::"+result2);
        System.out.println("Multiplication::::"+result3);
        System.out.println("Division::::"+result4);

    }
}

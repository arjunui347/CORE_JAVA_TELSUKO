public class Tel_49_MultiLevel_Inheritance {
    public static void main(String[] args) {
        Tel_49_AdvanceCalc2 AdvnsCalc2 = new Tel_49_AdvanceCalc2();
        int result1 = AdvnsCalc2.add(2,5);
        int result2 = AdvnsCalc2.sub(9,5);
        int result3 = AdvnsCalc2.multi(2,5);
        int result4 = AdvnsCalc2.div(10,5);
        int result5 = AdvnsCalc2.reminder(10,3);

        System.out.println("addition::::"+result1);
        System.out.println("Subtraction::::"+result2);
        System.out.println("Multiplication::::"+result3);
        System.out.println("Division::::"+result4);
        System.out.println("reminder::::"+result5);


    }
}

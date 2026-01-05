public class Tel_22_ClassAndObjectPractical{

    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;
        int result;
        Calculator1 calc = new Calculator1(); //Object creation
        result = calc.add(num1,num2);
        System.out.println(result);

    }
}

class Calculator1{
    public int add(int n1,int n2){
        int r = n1+n2;
        System.out.println("Addition");
        return r;
    }
}



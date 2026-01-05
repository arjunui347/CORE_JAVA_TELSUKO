


public class Tel_25_MethodOverloading{

    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;
        int num3 = 7;
        int result;
        Calculator calc = new Calculator(); //Object creation
        result = calc.add(num1,num2);
        System.out.println(result);

        result = calc.add(num1,num2,num3);
        System.out.println(result);         
    }
}

class Calculator{  
    public int add(int n1,int n2){
        int r = n1+n2;
        System.out.println("Addition of 2 numbers");
        return r;
    }

    //MethodOverloading : method with same name and different arguments or more number of arguments
    public int add(int n1, int n2, int n3){
        int r = n1+n2+n3;
        System.out.println("Addition of 3 numbers");
        return r;
    }
}



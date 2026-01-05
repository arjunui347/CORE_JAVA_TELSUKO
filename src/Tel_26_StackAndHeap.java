public class Tel_26_StackAndHeap{


    //each method has its own stack Memory
    public static void main(String[] args) {
        //int data=10;
        Calculator2 obj = new Calculator2(); //Object creation
        int r1 = obj.add(3,4); //here the Object:obj belongs to Stack memory with address(ex:101).
                               // all the Object:obj related values are in the Heap memory.
        System.out.println(r1);

        Calculator2 obj1 = new Calculator2();


        System.out.println(obj.num);
        obj.num = 8;
        System.out.println(obj.num);
        System.out.println(obj1.num);

        
    }
}

class Calculator2{
    int num= 5; //Instance Variables and belongs to Heap Memory

    //each method has its own Stack memory.
    public int add(int n1,int n2){ //here n1 nd n2 are local variables and they are belongs to Stack.
        System.out.println(num); 
        return n1+n2;
    }
}



public class Tel_51_Child_Or_Sub_Inherited extends Tel_51_Parent_Or_Super{

    public Tel_51_Child_Or_Sub_Inherited() {
        super();//Comes under Scenario-02 and scenario-05 of class: Tel_51_This_And_Super_Method.
        //super(7);//Comes under Scenario-4 of class: Tel_51_This_And_Super_Method.
        System.out.println("Default Constructor of Class: Tel_51_Child_Or_Sub_Inherited");
    }

    public Tel_51_Child_Or_Sub_Inherited(int n) {
        //super();//Comes under Scenario-02 of class: Tel_51_This_And_Super_Method.
        //super(7);//Comes under Scenario-03 of class: Tel_51_This_And_Super_Method.
        this(); //Comes under Scenario-05 of class: Tel_51_This_And_Super_Method.
        System.out.println("Parameterized Constructor of Class: Tel_51_Child_Or_Sub_Inherited");
    }
}

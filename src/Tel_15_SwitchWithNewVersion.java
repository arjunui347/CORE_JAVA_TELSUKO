public class Tel_15_SwitchWithNewVersion {
    public static void main (String [] args){

        String day = "Monday";

        //Enhanced version of switch without break.

        switch (day){
            case "Saturday","Sunday" -> System.out.println ("wake up at 7AM");
            case "Monday" -> System.out.println ("wake up at 6AM");
            default -> System.out.println ("wake up at 6:30AM");
        }

    }
}
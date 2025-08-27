public class SwitchWithString {

    public static void main (String [] args){

        //java started supporting String in switch statement from version 5 onwards.

        String day = "Sunday";

        switch(day){

        case "Saturday","Sunday":
            System.out.println ("wake up at 7AM");
            break;
        
        case "Monday":
            System.out.println ("wake up at 6AM");
            break;
        
        default:
            System.out.println ("wake up at 6:30AM");
        }

    }
}
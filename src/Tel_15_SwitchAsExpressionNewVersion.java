public class Tel_15_SwitchAsExpressionNewVersion {
    public static void main(String [] args){

        String day = "Sunday";
        String result = "";

        //Enhanced version of Switch

        result = switch (day){
            case "Saturday","Sunday" -> "wake up at 7AM";
            case "Monday" -> "wake up at 6AM";
            default -> "wake up at 6:30AM";
        };

        System.out.println (result);

        //Switch as Exprssion with : and yield

        String strDay = "Monday";
        String strResult = "";

        //Enhanced version of Switch

        strResult = switch (strDay){
            case "Saturday","Sunday" : yield "wake up at 7AM";
            case "Monday" : yield "wake up at 6AM";
            default : yield "wake up at 6:30AM";
        };

        System.out.println (strResult);

    }
}
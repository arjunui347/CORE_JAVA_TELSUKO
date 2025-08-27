public class NestedForLoop {
    public static void main (String [] args){

         for (int i=1; i<=7; i++) {
             System.out.println ("DAY " +i);

             for (int j=9; j<=17; j++) {

                 System.out.println ("HOURS " + j +"-" + (j+1));
             }            
        }

    }
}
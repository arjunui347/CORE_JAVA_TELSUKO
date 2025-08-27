public class NestedWhileLoop {

    public static void main (String [] args){
        int i=1;

        while (i<=4){ // whil loop takes true or false

            System.out.println ("Hi "+i);
            int j=1;
            while (j<=3) { 
                System.out.println ("Hello "+j);
                j++;
            }
            System.out.println ("Bye "+j);
            i++;
        }

        System.out.println ("Bye Bye "+i);

    }
}
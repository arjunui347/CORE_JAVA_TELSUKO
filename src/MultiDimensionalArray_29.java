public class MultiDimensionalArray_29 {
    public static void main(String[] args) {

        int[][] multiIntArray = new int [3] [4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                //below **random**  method will give some random numbers everytime by multiplying with 10.
                multiIntArray[i][j] = (int)(Math.random() * 10);
            }
        }

        System.out.println("using regular for loop::::");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(multiIntArray [i] [j] + " ");
            }
            System.out.println();
        }

        //printing with for-each loop

        System.out.println("using for_each loop::::");
        for (int n[]: multiIntArray ){
            for (int m: n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
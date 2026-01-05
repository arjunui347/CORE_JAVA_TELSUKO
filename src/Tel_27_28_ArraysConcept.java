public class Tel_27_28_ArraysConcept {
    public static void main(String[] args) {

        int[] intArray = {3,7,2,4}; //array creation and declaration of values Dynamically.

        System.out.println(intArray[0]); //zero index value
        System.out.println(intArray[1]); //1st index value
        System.out.println(intArray[2]); //2nd index value
        System.out.println(intArray[3]); //3rd index value

        //Array with Object.
        int[] numbs = new int [4];
        numbs[0] = 4;
        numbs[1] = 6;
        numbs[2] = 7;
        numbs[3] = 10;

        for (int i = 0; i < 4; i++) {
            System.out.println(numbs[i]);
        }
    }    
}
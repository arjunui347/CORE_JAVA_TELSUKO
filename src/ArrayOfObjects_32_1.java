public class ArrayOfObjects_32_1 {
    public static void main(String[] args) {
        //this example is for prevent the ArrayIndexOut of bounds Exception.
        int[] numbs = new int [4];
        numbs[0] = 4;
        numbs[1] = 6;
        numbs[2] = 7;
        numbs[3] = 10;

        //for (int i = 0; i < 5; i++) { //as the Index of array is 4, but mistakenly gave as 5, it will cause Exception.
        //below will makes to avoid the exception.
        //for (int i = 0; i < numbs.length; i++) {
        for (int numb : numbs) {
            System.out.println(numb);
        }

        /*
        * "C:\Program Files\Java\jdk-24\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2025.1.3\lib\idea_rt.jar=51654" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\arjun\IdeaProjects\CORE_JAVA_TELSUKO\out\production\CORE_JAVA_TELSUKO ArrayOfObjects_32
4
6
7
10
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
	at ArrayOfObjects_32.main(ArrayOfObjects_32.java:11)

Process finished with exit code 1
*/
    }
}

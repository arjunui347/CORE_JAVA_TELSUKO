public class ArrayOfObjects_32_2 {
    public static void main(String[] args) {
        //Objects creation Manually
        Student s1 = new Student();
        s1.RollNo = 10;
        s1.Name = "Mallikarjuna";
        s1.Marks = 98;

        Student s2 = new Student();
        s2.RollNo = 11;
        s2.Name = "Kumar";
        s2.Marks = 98;

        Student s3 = new Student();
        s3.RollNo = 12;
        s3.Name = "Dachepalli";
        s3.Marks = 98;

        System.out.println(s1); //output: Student@8efb846
        System.out.println(s2); //output: Student@2a84aee7
        System.out.println(s3); //output: Student@a09ee92
        //above objects gives you some wired results in output (which is not understable).
        /*"C:\Program Files\Java\jdk-24\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2025.1.3\lib\idea_rt.jar=52265"
        -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\arjun\IdeaProjects\CORE_JAVA_TELSUKO\out\production\CORE_JAVA_TELSUKO ArrayOfObjects_32_2
Student@8efb846
Student@2a84aee7
Student@a09ee92
        * */

        //we need to follow like below for all 3 Objets to print.
        System.out.println(s1.RollNo +":" +s1.Name + ":" + ":" +s1.Marks);
        System.out.println(s2.RollNo +":" +s2.Name + ":" + ":" +s2.Marks);
        System.out.println(s3.RollNo +":" +s3.Name + ":" + ":" +s3.Marks);


        //above created Objects assigning to an Array as we can't write multiple print statements for each Object.
        Student[] students = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;


        System.out.println("Printing of Objects with for loop by assigning to array::::");
        for(int i = 0; i < students.length; i++) {
            System.out.println(students[i].RollNo +":" +students[i].Name + ":" + ":" +students[i].Marks);
        }
        System.out.println("Printing of Objects with Enhanced for loop by assigning to array::::");
        for (Student student : students) {
            System.out.println(student.RollNo + ":" + student.Name + ":" + ":" + student.Marks);
        }
        }
    }


class Student{
    //Instance variables.
    int RollNo;
    String Name;
    int Marks;
}

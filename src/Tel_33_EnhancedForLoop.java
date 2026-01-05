
    public class Tel_33_EnhancedForLoop {
        public static void main(String[] args) {
            //Objects creation Manually
            StudentEnhanced s1 = new StudentEnhanced();
            s1.RollNo = 10;
            s1.Name = "Mallikarjuna";
            s1.Marks = 98;

            StudentEnhanced s2 = new StudentEnhanced();
            s2.RollNo = 11;
            s2.Name = "Kumar";
            s2.Marks = 98;

            StudentEnhanced s3 = new StudentEnhanced();
            s3.RollNo = 12;
            s3.Name = "Dachepalli";
            s3.Marks = 98;



            //above created Objects assigning to an Array as we can't write multiple print statements for each Object.
            StudentEnhanced[] students = new StudentEnhanced[3];
            students[0] = s1;
            students[1] = s2;
            students[2] = s3;


            /*System.out.println("Printing of Objects with for loop by assigning to array::::");
            for(int i = 0; i < students.length; i++) {
                System.out.println(students[i].RollNo +":" +students[i].Name + ":" + ":" +students[i].Marks);
            }*/

            //Enhanced For Loop.
            System.out.println("Printing of Objects with Enhanced for loop by assigning to array::::");
            for (StudentEnhanced student : students) {
                System.out.println(student.RollNo + ":" + student.Name + ":" + ":" + student.Marks);
            }
        }
    }


    class StudentEnhanced{
        //Instance variables.
        int RollNo;
        String Name;
        int Marks;
    }

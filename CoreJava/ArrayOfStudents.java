package CoreJava;
/**
 * ArrayOfStudents
 */
public class ArrayOfStudents {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Navin";
        s1.rollNo = 2;
        s1.marks = 35;

        Student s2 = new Student();
        s2.name = "kevin";
        s2.rollNo = 4;
        s2.marks = 55;

        Student s3 = new Student();
        s3.name = "Dan";
        s3.rollNo = 7;
        s3.marks = 45;

        Student[] students = new Student[3];
        students[0]= s1;
        students[1] = s2;
        students[2] = s3;
        System.out.println(students[0].name);

        for (Student student : students) {
            System.out.println(student.name + " : " + student.rollNo + " : " +  student.marks);
            
        }


    }

    
}

class Student {
    String name;
    int rollNo;
    int marks;
}

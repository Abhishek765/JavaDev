
class Student {
    int rollno;
    String name;
    int marks;

    Student(int rollno, String name, int marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }
}

public class ArrayOfObjects {

    public static void main(String[] args) {

        Student s1 = new Student(1, "Abhishek", 90);
        Student s2 = new Student(2, "Harsh", 88);
        Student s3 = new Student(3, "Kiran", 92);

        Student students[] = new Student[3];

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (Student student : students) {
            System.out.println(student.name + " with rollno:" + student.rollno + " got " + student.marks + " marks");
        }
    }

}

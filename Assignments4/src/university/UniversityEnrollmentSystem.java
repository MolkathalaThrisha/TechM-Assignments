package university;
public class UniversityEnrollmentSystem {
    public static void main(String[] args) {
        Course math101 = new Course("MATH101", "Calculus I");
        Course cs102 = new Course("CS102", "Introduction to Programming");

 
        Student alice = new Student("S001", "Alice");
        Student bob = new Student("S002", "Bob");
        Student charlie = new Student("S003", "Charlie");

     
        math101.enrollStudent(alice);
        math101.enrollStudent(bob);
        cs102.enrollStudent(charlie);
        cs102.enrollStudent(alice);

     
        System.out.println();
        math101.displayEnrolledStudents();
        System.out.println();
        cs102.displayEnrolledStudents();

       
        System.out.println();
        math101.removeStudent("S002");

       
        System.out.println();
        math101.displayEnrolledStudents();
    }
}

package university;
import java.util.LinkedList;
import java.util.ListIterator;

public class Course {
    private final String courseCode;
    private final String courseName;
    private final LinkedList<Student> enrolledStudents;

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.enrolledStudents = new LinkedList<>();
    }

    public String getCourseCode() { return courseCode; }
    public String getCourseName() { return courseName; }

 
    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
        System.out.println(student.getName() + " has been enrolled in " + courseName);
    }

   
    public void displayEnrolledStudents() {
        System.out.println("Enrolled Students in " + courseName + ":");
        for (Student student : enrolledStudents) {
            System.out.println(student);
        }
    }


    public void removeStudent(String studentId) {
        ListIterator<Student> iterator = enrolledStudents.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().getStudentId().equals(studentId)) {
                iterator.remove();
                System.out.println("Student with ID " + studentId + " has been removed from " + courseName);
                return;
            }
        }
        System.out.println("Student with ID " + studentId + " not found in " + courseName);
    }
}

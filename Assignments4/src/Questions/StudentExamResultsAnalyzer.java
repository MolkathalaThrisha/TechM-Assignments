package Questions;
import java.util.*;
public class StudentExamResultsAnalyzer {
    private HashMap<String, Integer> studentRecords;
    public StudentExamResultsAnalyzer() {
        studentRecords = new HashMap<>();
    }

    public void addStudentRecord(String studentId, int score) {
        studentRecords.put(studentId, score);
    }

    public Integer getStudentScore(String studentId) {
        return studentRecords.get(studentId);
    }
    public void displayAllRecordsSortedById() {
        // TreeMap to store records sorted by student ID
        TreeMap<String, Integer> sortedRecords = new TreeMap<>(studentRecords);
        System.out.println("Student Records Sorted by ID:");
        for (Map.Entry<String, Integer> entry : sortedRecords.entrySet()) {
            System.out.println("Student ID: " + entry.getKey() + ", Score: " + entry.getValue());
        }
    }
    public void displayAllRecordsSortedByScore() {
        // List to store map entries
        List<Map.Entry<String, Integer>> list = new ArrayList<>(studentRecords.entrySet());

        // Sort list by score
        list.sort(Map.Entry.comparingByValue());

        System.out.println("Student Records Sorted by Score:");
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println("Student ID: " + entry.getKey() + ", Score: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        StudentExamResultsAnalyzer analyzer = new StudentExamResultsAnalyzer();

       
        analyzer.addStudentRecord("S001", 85);
        analyzer.addStudentRecord("S002", 92);
        analyzer.addStudentRecord("S003", 78);
        analyzer.addStudentRecord("S004", 88);

      
        String studentId = "S002";
        Integer score = analyzer.getStudentScore(studentId);
        if (score != null) {
            System.out.println("Score of student " + studentId + ": " + score);
        } else {
            System.out.println("Student ID " + studentId + " not found.");
        }

        System.out.println();

      
        analyzer.displayAllRecordsSortedById();

        System.out.println();

       
        analyzer.displayAllRecordsSortedByScore();
    }
}

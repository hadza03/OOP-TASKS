import People.Student;

public class Main {
    public static void main(String[] args){
        Student student1 = new Student("Alice", 20, "USA", 101);

        // Get and set student_id using getters and setters
        int studentId = student1.getVariablesstudent_id();
        System.out.println("Initial Student ID: " + studentId);

        student1.setVariablesstudent_id(102);
        studentId = student1.getVariablesstudent_id();
        System.out.println("Updated Student ID: " + studentId);

        // Add grades for the student
        student1.addGrade(85);
        student1.addGrade(92);
        student1.addGrade(105);  // Invalid grade

        // Display student information
        System.out.println("Student Information:");
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("Country: " + student1.getCountry());
        System.out.println("Student ID: " + student1.getVariablesstudent_id());
        System.out.println("Grades: " + student1.getGrades());
    }
}
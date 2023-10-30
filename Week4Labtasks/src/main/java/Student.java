package People;
import java.util.ArrayList;
import java.util.List;

public class Student extends People.Person {
    private int credit;
    private int variablesstudent_id;
    private List<Integer> grades;
    public Student(String name,int age, String country, int variablesstudent_id) {
        super(name,age,country);
        this.variablesstudent_id=variablesstudent_id;
        this.grades=new ArrayList<>();
    }
    public void study(){
        this.credit++;
    }

    public int getCredit() {
        return credit;
    }

    public int getVariablesstudent_id() {
        return variablesstudent_id;
    }

    public void setVariablesstudent_id(int variablesstudent_id) {
        this.variablesstudent_id = variablesstudent_id;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
            System.out.println("Grade added: " + grade);
        } else {
            System.out.println("Invalid grade. Grade should be between 0 and 100.");
        }
    }
    public List<Integer> getGrades(){
        return grades;
    }

}

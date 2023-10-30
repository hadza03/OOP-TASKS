package org.example;
public class Teacher extends People.Person {
    private int salary;
    public Teacher(String name,int age, String country,int salary){
        super(name, age, country);
        this.salary=salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String toString(){
        return getName()+'\n'+getAdress()+'\n'+salary;
    }
}

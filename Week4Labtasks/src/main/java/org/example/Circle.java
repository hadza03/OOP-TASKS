package org.example;
public class Circle extends Shape{
    private double radius;
    public Circle(String color, FillType filled, double radius){
        super(color,filled);
        this.radius=radius;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Shape: Circle, Radius: " + radius + ", Area: " + getArea());
    }
    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    }
    // Function to calculate circumference with PI as a parameter
    public double calculateCircumference(double PI, double r){
        return 2 * PI * r;
    }
    // Function to calculate circumference with PI as constant
    public double calculateCircumference(double r){
        final double PI = Math.PI;
        return 2 * PI * r;
    }
}

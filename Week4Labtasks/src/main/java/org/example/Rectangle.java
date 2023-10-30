package org.example;

public class Rectangle extends Shape{
    private double width;
    private double height;
    public Rectangle(FillType filled, String color, double width ,double height){
        super(color, filled);
        this.width=width;
        this.height=height;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Shape: Rectangle, Width: " + width + ", Height: " + height + ", Area: " + getArea());
    }
    @Override
    public double getArea(){
        return width*height;
    }
}

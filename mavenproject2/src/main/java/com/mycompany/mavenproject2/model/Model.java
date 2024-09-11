package com.mycompany.mavenproject2.model;

public class Model {
    private double wallWidth;
    private double wallHeight;
    private final double CONSUMPTION_PER_M2 = 0.3; 
    private final double LITERS_PER_CAN = 2.0;     

    public void setWallDimensions(double width, double height) {
        this.wallWidth = width;
        this.wallHeight = height;
    }

    public double calculateArea() {
        return this.wallWidth * this.wallHeight;
    }

    public int calculateRequiredCans() {
        double area = calculateArea();
        double paintNeeded = area * CONSUMPTION_PER_M2;
        return (int) Math.ceil(paintNeeded / LITERS_PER_CAN);//arredonda
    }
}

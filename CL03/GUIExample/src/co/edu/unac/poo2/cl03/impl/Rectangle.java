package co.edu.unac.poo2.cl03.impl;

import co.edu.unac.poo2.cl03.Figure;



public class Rectangle extends Figure {

    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return this.base * this.height;
    }
}

package co.edu.unac.poo2.cl03.impl;

import co.edu.unac.poo2.cl03.Figure;

public class Triangle extends Figure {

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    private double height;

    @Override
    public double calculateArea() {
        return (this.base * this.height) / 2;
    }
}

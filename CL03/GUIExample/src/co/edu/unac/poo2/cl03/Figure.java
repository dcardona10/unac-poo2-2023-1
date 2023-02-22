package co.edu.unac.poo2.cl03;

public abstract class Figure {

    protected double base;
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public abstract double calculateArea();
}

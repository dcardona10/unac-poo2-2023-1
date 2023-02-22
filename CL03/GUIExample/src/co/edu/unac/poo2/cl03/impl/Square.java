package co.edu.unac.poo2.cl03.impl;

import co.edu.unac.poo2.cl03.Figure;

public class Square extends Figure {
    @Override
    public double calculateArea() {
        return Math.pow(this.base, 2);
    }
}

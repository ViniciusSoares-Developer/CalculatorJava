package model.services;

public class Division implements Calculation {
    @Override
    public Double calculation(Double a, Double b) {
        return a / b;
    }
}

package model.services;

public class Multiplicator implements Calculation {
    @Override
    public Double calculation(Double a, Double b) {
        return a * b;
    }
}

package model.services;

public class Subtractor implements Calculation {
    @Override
    public Double calculation(Double a, Double b) {
        return a - b;
    }
}

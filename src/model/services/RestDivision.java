package model.services;

public class RestDivision implements Calculation{
    @Override
    public Double calculation(Double a, Double b) {
        return a % b;
    }
}

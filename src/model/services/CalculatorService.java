package model.services;

import model.entities.Calculator;

public class CalculatorService {
    private Calculator calculator;
    private Calculation calculation;

    public CalculatorService(Calculator calculator, Calculation calculation) {
        this.calculator = calculator;
        this.calculation = calculation;
    }

    public Calculator getCalculator() {
        return calculator;
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public Calculation getCalculation() {
        return calculation;
    }

    public void setCalculation(Calculation calculation) {
        this.calculation = calculation;
    }

    public Double calculation() {
        return getCalculation().calculation(
                getCalculator().getNumberator(),
                getCalculator().getDenominator());
    }
}

package model.entities;

public class Calculator {
    private Double denominator;
    private Double numberator;

    public Calculator(Double numberator, Double denominator) {
        this.denominator = denominator;
        this.numberator = numberator;
    }

    public Double getDenominator() {
        return denominator;
    }

    public void setDenominator(Double denominator) {
        this.denominator = denominator;
    }

    public Double getNumberator() {
        return numberator;
    }

    public void setNumberator(Double numberator) {
        this.numberator = numberator;
    }
}

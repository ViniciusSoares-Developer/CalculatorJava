import model.entities.Calculator;
import model.services.*;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("For necessary calc:\n- First adding one numerator and then a calculation method and last adding the denomination");
            System.out.println("- Put an invalid method of calculation to finalize the account!");
            System.out.println("1 - \"+\" for Sum");
            System.out.println("2 - \"-\" for Subtraction");
            System.out.println("3 - \"*\" for Multiplication");
            System.out.println("4 - \"/\" for Division");
            System.out.println("5 - \"%\" for Rest Division");
            System.out.println("6 - \"**\" for Raise the potency");
            System.out.println("7 - \"//\" for Square root (ignoring denominator)");

            sc.nextLine();
            boolean calcBool = true;
            System.out.print("Numerator: ");
            Double numerator = sc.nextDouble();
            do {
                System.out.print(": ");
                String equation = sc.next();

                System.out.print("Denominator: ");
                Double denominator = sc.nextDouble();


                Calculator calculator = new Calculator(numerator, denominator);

                CalculatorService sumService;

                switch (equation) {
                    case "+" -> sumService = new CalculatorService(calculator, new Sum());
                    case "-" -> sumService = new CalculatorService(calculator, new Subtractor());
                    case "*" -> sumService = new CalculatorService(calculator, new Multiplicator());
                    case "/" -> sumService = new CalculatorService(calculator, new Division());
                    case "%" -> sumService = new CalculatorService(calculator, new RestDivision());
                    case "**" -> sumService = new CalculatorService(calculator, new RaisePotency());
                    case "//" -> sumService = new CalculatorService(calculator, new SquareRoot());
                    default -> {
                        calcBool = false;
                        continue;
                    }
                }

                numerator = sumService.calculation();
                System.out.println("Result: " + numerator);
            }while(calcBool);

        } catch (InputMismatchException e) {
            System.out.println("Tipo invalido para calcular!");
        }
    }
}
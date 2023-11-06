package calculator;

import javax.xml.stream.events.StartDocument;
import java.util.HashMap;
import java.util.Map;

public class Calculator {


    private Map<Character, Operation> operationMap = new HashMap<>();


    public Calculator() {
        operationMap.put('+', new Addition());
        operationMap.put('-', new Subtraction());
        operationMap.put('*', new Multiplication());
        operationMap.put('/', new Division());
    }



    public String makeCalculation(double num1, double num2, char operation) {
        switch (operation) {
            case '/':
                if (num2 == 0) {
                    try {
                        int a = (int) num1 / (int) num2;
                    } catch (ArithmeticException e) {
                        System.err.println("на ноль делить нельзя.");
                    }
                    break;
                }
            default:
                Operation operationMapValue = operationMap.get(operation);
                return String.valueOf(operationMapValue.calculateResult(num1, num2));
        }
        return null;
    }
}

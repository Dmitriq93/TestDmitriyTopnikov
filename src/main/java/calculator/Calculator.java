package calculator;

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

    public double makeCalculation(double num1, double num2, char operation) {
        Operation operationMapValue = operationMap.get(operation);
        return operationMapValue.calculateResult(num1, num2);
    }
}

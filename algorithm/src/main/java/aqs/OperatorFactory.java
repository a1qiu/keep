package aqs;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mawei
 * @date 5/13/21
 */
public class OperatorFactory {
    private final static Map<String, Operation> operationMap = new HashMap<>();

    static {
        operationMap.put("add", new Addition());
        operationMap.put("divide", new Division());
        // more operators
    }

    public static Operation getOperation(String operator) {
        return operationMap.get(operator);
    }


    public int calculate(int a, int b, String operate) {
        if (OperatorFactory.getOperation(operate) == null) {
            throw new IllegalArgumentException("Invalid Operator");
        }
        return OperatorFactory.getOperation(operate).apply(a, b);
    }

    public static void main(String[] args) {
        OperatorFactory operatorFactory = new OperatorFactory();
        System.out.println(operatorFactory.calculate(2, 3, "add"));
    }
}

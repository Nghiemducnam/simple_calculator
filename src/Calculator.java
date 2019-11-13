public class Calculator {
    public static float Calculate (float firstOperand, float secondOperand, char Operator) {
        switch (Operator) {
            case '+':
                return firstOperand + secondOperand;
            case '-':
                return firstOperand - secondOperand;
            case '*':
                return firstOperand*secondOperand;
            case '/':
                if(secondOperand !=0)
                    return firstOperand / secondOperand;
                 else
                    throw new RuntimeException("can't divide by zero");
            default: throw  new RuntimeException("invalid operation");
        }

    }
}

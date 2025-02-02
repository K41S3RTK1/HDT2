import java.util.StringTokenizer;


// Clase que evalúa expresiones matemáticas en notación Postfix.

public class CalculadoraPostfix {
    private StackInterface<Integer> stack;

    public CalculadoraPostfix(StackInterface<Integer> stack) {
        this.stack = stack;
    }

    public int evaluar(String expresion) {
        StringTokenizer tokens = new StringTokenizer(expresion);
        
        while (tokens.hasMoreTokens()) {
            String token = tokens.nextToken();

            if (esNumero(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                int b = stack.pop();
                int a = stack.pop();
                int resultado = realizarOperacion(a, b, token);
                stack.push(resultado);
            }
        }
        return stack.pop();
    }

    private boolean esNumero(String token) {
        return token.matches("\\d+");
    }

    private int realizarOperacion(int a, int b, String operador) {
        switch (operador) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": 
                if (b == 0) throw new ArithmeticException("División por cero.");
                return a / b;
            case "%": return a % b;
            default: throw new IllegalArgumentException("Operador inválido: " + operador);
        }
    }
}

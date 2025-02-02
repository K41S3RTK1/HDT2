import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


// Clase principal que lee expresiones Postfix de un archivo y las evalúa.
 
public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("datos.txt"))) {
            String expresion;
            
            // Elegir qué implementación de pila usar (Module o VectorStack)
            StackInterface<Integer> stack = new Module<>(); // Puedes cambiar a new VectorStack<>();
            CalculadoraPostfix calculadora = new CalculadoraPostfix(stack);

            while ((expresion = br.readLine()) != null) { // Leer todas las líneas
                int resultado = calculadora.evaluar(expresion);
                System.out.println("Expresión: " + expresion);
                System.out.println("Resultado: " + resultado);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}

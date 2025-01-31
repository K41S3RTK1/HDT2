import java.util.Vector; //vectores se parece a arraylist

public class Module implements StackInterface<Integer> {
    // leer .txt = linea por linea tiene que leer el postfix y hacer la operacion
    // solo se usan enteros positivos y operadores aritmeticos +, -, *, /, %
    // el stack(echo con un vector) se muestra despues de cada operacion
    // stack crece hacia la derecha
    Vector<Integer> stack = new Vector<>();
    
    public void sizeSetter(int size) {
        stack.setSize(size);
    }
    
    @Override
    public void push(Integer elemento) {
        stack.add(elemento);
    }

    @Override
    public Integer pop() {
        return stack.remove(stack.size()-1);
    }

    @Override
    public int size() {
        return stack.size();
    }
    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public void AumentarCapacidad() {
        stack.setSize(stack.size()*2);
    }
}

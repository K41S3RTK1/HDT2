import java.util.Vector;

/**
 * Implementación de una pila utilizando la clase Vector.
 * @param <T> Tipo de elementos almacenados en la pila.
 */
public class VectorStack<T> implements StackInterface<T> {
    private Vector<T> stack;

    /**
     * Constructor que inicializa la pila basada en un Vector.
     */
    public VectorStack() {
        stack = new Vector<>();
    }

    @Override
    public void push(T elemento) {
        stack.add(elemento);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack vacío.");
        }
        return stack.remove(stack.size() - 1);
    }

    @Override
    public int size() {
        return stack.size();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}

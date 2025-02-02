import java.util.Arrays;

/**
 * Implementación de una pila basada en un array dinámico.
 * @param <T> Tipo de elementos almacenados en la pila.
 */
public class Module<T> implements StackInterface<T> {
    private T[] Stack;
    private int capacidad;
    private int cantidad;

    /**
     * Constructor que inicializa la pila con capacidad de 8 elementos.
     */
    public Module() {
        capacidad = 8;
        Stack = (T[]) new Object[capacidad];
        cantidad = -1;
    }

    @Override
    public void push(T elemento) {
        if (cantidad + 1 == capacidad) {
            aumentarCapacidad();
        }
        cantidad++;
        Stack[cantidad] = elemento;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack vacío.");
        }
        T elemento = Stack[cantidad];
        Stack[cantidad] = null;
        cantidad--;
        return elemento;
    }

    @Override
    public boolean isEmpty() {
        return cantidad == -1;
    }

    @Override
    public int size() {
        return cantidad + 1;
    }

    /**
     * Duplica la capacidad del array cuando está lleno.
     */
    private void aumentarCapacidad() {
        capacidad *= 2;
        Stack = Arrays.copyOf(Stack, capacidad);
    }
}

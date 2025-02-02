import java.util.Arrays;

public class Module<T> implements StackInterface<T> {
    private T[] Stack;
    private int capacidad;
    private int cantidad;

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

    private void aumentarCapacidad() {
        capacidad *= 2;
        Stack = Arrays.copyOf(Stack, capacidad);
    }
}

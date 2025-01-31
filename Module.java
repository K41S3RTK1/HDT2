//import java.util.Vector; //vectores se parece a arraylist
import java.util.Arrays;

public class Module<T> implements StackInterface<T> {
    // creditos a ricardo

    private T[] Stack;
    private int capacidad;
    private int cantidad;

    public void VectorStack()
    {
        capacidad = 8;
        Stack = (T[]) new Object[capacidad];
        cantidad = -1;
    }

    @Override
    public void push(T caracter)
    {
        if (cantidad + 1 == capacidad)
        {
            AumentarCapacidad();
        }
        cantidad++;
        Stack[cantidad] = caracter;
    }

    @Override
    public T pop()
    {
        if (this.isEmpty())
        {
            throw new IllegalStateException("Stack vacío.");
        }
        T caracter = this.Stack[cantidad];
        this.Stack[cantidad] = null;
        cantidad--;
        return caracter;
    }

    @Override
    public boolean isEmpty()
    {
        if (this.size()==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public int size()
    {
        return this.cantidad + 1;
    }

    @Override
    public void AumentarCapacidad()
    {
        this.capacidad = 2 * this.capacidad;
        this.Stack = Arrays.copyOf(this.Stack, this.capacidad);
    }

}

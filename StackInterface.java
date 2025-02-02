/**
 * Interfaz que define los métodos básicos para una pila (Stack).
 * @param <T> Tipo de elementos almacenados en la pila.
 */
public interface StackInterface<T> {
    void push(T elemento);
    T pop();
    int size();
    boolean isEmpty();
}

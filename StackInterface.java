public interface StackInterface<T> {
    // creditos a ricardo, el primero que la hizo y compartio
    void push(T elemento);
    T pop();
    int size();
    boolean isEmpty();
    void AumentarCapacidad();
 } 

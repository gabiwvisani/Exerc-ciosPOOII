package Stack;

import java.util.ArrayList;
import java.util.List;
public class StackImplementacao <T> implements Stack<T>{

    private final List<T> lista;

    // Construtor
    public StackImplementacao() {
        lista = new ArrayList<>();
    }

    // Implementação dos métodos da interface
    @Override
    public void push(T elemento) {
        lista.add(elemento);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia. Não é possível realizar pop.");
        }
        int lastIndex = lista.size() - 1;
        T elementoRemovido = lista.get(lastIndex);
        lista.remove(lastIndex);
        return elementoRemovido;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia. Não é possível realizar peek.");
        }
        return lista.get(lista.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return lista.isEmpty();
    }
}

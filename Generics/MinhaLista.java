package Generics;

import java.util.ArrayList;
import java.util.List;

public class MinhaLista<T, U> {
    private final List<T> elementos = new ArrayList<>();;

    public void adicionar(T elemento) {
        this.elementos.add(elemento);
    }

    public T obter(int indice) {
        if (indice >= 0 && indice < this.elementos.size()) {
            return this.elementos.get(indice);
        } else {
            return null;
        }
    }

    public int indice(U identificador) {
        for (int i = 0; i < this.elementos.size(); i++) {
            if (this.elementos.get(i) instanceof Pessoa) {
                Pessoa pessoa = (Pessoa) this.elementos.get(i);
                Long l =(Long) pessoa.getId();
                if (l.equals(identificador)) {
                    return i;
                }
            }
        }
        return -1; //para casos onde não é
    }

    public boolean contem(T elemento) {
        return this.elementos.contains(elemento);
    }


}

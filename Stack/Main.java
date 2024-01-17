package Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> Minhapilha = new StackImplementacao<Integer>();

        Minhapilha.push(1);
        Minhapilha.push(2);
        Minhapilha.push(3);

        System.out.println("Elemento do topo: " + Minhapilha.peek());

        System.out.println("Desempilhado: " + Minhapilha.pop());
        System.out.println("Desempilhado: " + Minhapilha.pop());

        System.out.println("A pilha está vazia? " + Minhapilha.isEmpty());
    }
}

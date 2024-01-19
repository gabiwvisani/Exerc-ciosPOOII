package Generics;

public record Pessoa(long id, String nome) implements ObjetoComId<Long> {
    public Pessoa(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return this.id;
    }
    public String getnome() {
        return this.nome;
    }
}

package AreasFormas;
public class Retangulo implements Shape {
    private double comprimento;
    private double largura;

    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    @Override
    public double calcularÁrea() {
        return comprimento * largura;
    }
}

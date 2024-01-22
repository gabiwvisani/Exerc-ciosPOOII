package AreasFormas;
public class Circulo  implements Shape {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularÁrea() {
        return Math.PI * Math.pow(raio, 2);
    }
}

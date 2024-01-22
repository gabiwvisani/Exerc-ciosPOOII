package AreasFormas;
public class Main {
    public static void main(String[] args) {
        Shape circulo = new Circulo(5);
        Shape retangulo = new Retangulo(4, 6);
        Shape triangulo = new Triangulo(3, 8);

        System.out.println("Área do Círculo: " + circulo.calcularÁrea());
        System.out.println("Área do Retângulo: " + retangulo.calcularÁrea());
        System.out.println("Área do Triângulo: " + triangulo.calcularÁrea());
    }
}

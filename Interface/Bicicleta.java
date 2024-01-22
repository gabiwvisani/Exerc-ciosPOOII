package Interface;
public class Bicicleta implements Veiculo {
    @Override
    public void ligar() {
        System.out.println("Bicicleta não possui motor para ligar.");
    }

    @Override
    public void desligar() {
        System.out.println("Bicicleta não possui motor para desligar.");
    }

    @Override
    public void acelerar(int velocidade) {
        System.out.println("Bicicleta não possui motor para acelerar.");
    }

    @Override
    public void frear() {
        System.out.println("Bicicleta freando.");
    }
}

package Interface;
public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro();
        Veiculo moto = new Moto();
        Veiculo bicicleta = new Bicicleta();

        // Chamadas polimórficas
        carro.ligar();
        carro.acelerar(60);
        carro.acelerar(40);
        carro.frear();
        carro.desligar();

        System.out.println();

        moto.ligar();
        moto.acelerar(60);
        moto.frear();
        moto.desligar();

        System.out.println();

        bicicleta.ligar();
        bicicleta.frear();
        bicicleta.desligar();
    }
}

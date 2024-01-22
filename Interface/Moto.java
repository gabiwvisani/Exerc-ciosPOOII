package Interface;
public class Moto implements Veiculo {
    private Boolean ligado;
    private Integer velocidademoto;

    public Moto(){
        this.ligado=true;
        this.velocidademoto=0;
    }

    @Override
    public void ligar() {
        this.ligado=true;
        System.out.println("Moto ligada.");
    }

    @Override
    public void desligar() {
        this.ligado=false;
        System.out.println("Moto desligada.");
    }

    @Override
    public void acelerar(int velocidade) {
        this.velocidademoto+=velocidade;
        System.out.println("Moto acelerando a " + this.velocidademoto + " km/h.");
    }

    @Override
    public void frear() {
        this.velocidademoto=0;
        System.out.println("Moto freando.");
    }
}

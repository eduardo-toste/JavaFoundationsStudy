package nivel_1_fundamentos.oop.abstracao;

public class Carro extends Veiculo {

    public Carro(String modelo) {
        super(modelo);
    }

    @Override
    public void mover() {
        System.out.println("O carro esta andando");
    }
}

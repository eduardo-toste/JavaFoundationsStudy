package nivel_1_fundamentos.oop.abstracao;

public class Aviao extends Veiculo {

    public Aviao(String modelo) {
        super(modelo);
    }

    @Override
    public void mover() {
        System.out.println("O aviao esta voando");
    }
}

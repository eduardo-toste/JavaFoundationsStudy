package nivel_1_fundamentos.oop.abstracao;

public abstract class Veiculo {

    private String modelo;

    public Veiculo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public abstract void mover();

}

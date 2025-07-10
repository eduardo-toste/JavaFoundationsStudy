package nivel_1_fundamentos.oop.heranca;

public class Funcionario {

    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String exibirInformacoes() {
        return "Nome: " + this.nome + ", salario: " + this.salario;
    }
}

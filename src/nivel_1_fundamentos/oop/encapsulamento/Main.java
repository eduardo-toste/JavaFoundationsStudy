package nivel_1_fundamentos.oop.encapsulamento;

public class Main {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1, "Eduardo", 100.0);

        conta.deposito(11);
        System.out.println(conta.getSaldo());

        conta.saque(111);
        System.out.println(conta.getSaldo());
    }

}

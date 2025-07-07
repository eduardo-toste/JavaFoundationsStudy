package nivel_1_fundamentos.streams;

import java.util.List;

public class Exercicio5_ContarMaioresQue5 {
    public static void main(String[] args) {
        List<Integer> valores = List.of(3, 5, 7, 8, 2, 10, 6);

        Long quantidade = valores.stream().filter(v -> v > 5).count();
        System.out.println(quantidade);

        // TODO: Contar quantos números são maiores que 5
    }
}

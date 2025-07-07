package nivel_1_fundamentos.streams;

import java.util.List;

public class Exercicio2_SomaPares {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numeros.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        List<Integer> pares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println(pares);

        // TODO: Somar apenas os números pares da lista e imprimir o resultado
    }
}

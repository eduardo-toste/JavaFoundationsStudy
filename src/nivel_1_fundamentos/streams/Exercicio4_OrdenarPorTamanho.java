package nivel_1_fundamentos.streams;

import java.util.Comparator;
import java.util.List;

public class Exercicio4_OrdenarPorTamanho {
    public static void main(String[] args) {
        List<String> frases = List.of("Java", "Programação", "Stream", "API");

        frases.stream()
                .sorted(Comparator.comparingInt(String::length))
                .forEach(System.out::println);

        // TODO: Ordenar as frases pelo tamanho (menor para maior) e imprimir
    }
}

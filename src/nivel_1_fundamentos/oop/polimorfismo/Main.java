package nivel_1_fundamentos.oop.polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Animal animal = new Animal();

        List<Animal> animais = List.of(cachorro, gato, animal);
        animais.forEach(Animal::emitirSom);
    }

}

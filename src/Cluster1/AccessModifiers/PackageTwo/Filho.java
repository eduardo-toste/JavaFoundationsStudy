package Cluster1.AccessModifiers.PackageTwo;

import Cluster1.AccessModifiers.PackageOne.Pai;

public class Filho extends Pai {

    public void testeHeranca() {
        System.out.println("Dentro da classe Filho (subclasse de Pai)");
        System.out.println("public: " + pub);       // Acesso permitido
        System.out.println("protected: " + prot);  // Acesso permitido
        // System.out.println("package-private: " + pack); // Acesso negado (compilação falha)
        // System.out.println("private: " + priv); // Acesso negado (compilação falha)
    }
}

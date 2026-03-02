package Cluster1.AccessModifiers.PackageTwo;

import Cluster1.AccessModifiers.PackageOne.Pai;

public class OutroPacote {
    public static void main(String[] args) {
        Pai pai = new Pai();
        System.out.println("Acessando membros de Pai a partir de OutroPacote:");
        System.out.println("public: " + pai.pub);       // Acesso permitido
        // System.out.println("protected: " + pai.prot);  // Acesso negado (compilação falha)
        // System.out.println("package-private: " + pai.pack); // Acesso negado (compilação falha)
        // System.out.println("private: " + pai.priv); // Acesso negado (compilação falha)
    }
}

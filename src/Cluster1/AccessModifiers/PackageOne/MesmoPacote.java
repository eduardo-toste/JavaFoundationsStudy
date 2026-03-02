package Cluster1.AccessModifiers.PackageOne;

public class MesmoPacote {
    public static void main(String[] args) {
        Pai pai = new Pai();
        System.out.println("Acessando membros de Pai a partir de MesmoPacote:");
        System.out.println("public: " + pai.pub);       // Acesso permitido
        System.out.println("protected: " + pai.prot);  // Acesso permitido
        System.out.println("package-private: " + pai.pack); // Acesso permitido
        // System.out.println("private: " + pai.priv); // Acesso negado (compilação falha)
    }
}

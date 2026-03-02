package Cluster1.AccessModifiers.PackageOne;

public class Pai {
    public    int pub  = 1;
    protected int prot = 2;
    int pack = 3;
    private   int priv = 4;

    public void test() {
        System.out.println("Dentro da classe Pai");
        System.out.println("public: " + pub);
        System.out.println("protected: " + prot);
        System.out.println("package-private: " + pack);
        System.out.println("private: " + priv);
    }

}

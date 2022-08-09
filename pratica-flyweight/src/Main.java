public class Main {
    public static void main(String[] args) {
        ArvoreFactory arvoreFactory = new ArvoreFactory();

        Arvore arvore2 = null;
        Arvore arvore1 = null;
        for(int i = 0; i< 100000 ; i++){
            arvore1 = arvoreFactory.getArvore(5.0,3.0, "vermelha");
            arvore2 = arvoreFactory.getArvore(2.0,3.0, "verde");
        }

        System.out.println(arvore1.toString());
        System.out.println(arvore2.toString());


        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memória utilizada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));


        for (int i = 0; i<100000 ; i++){
            arvore2 = new Arvore(2.0,3.0, "verde");
            arvore2 = new Arvore(2.0,3.0, "verde");
        }

        System.out.println("Memória utilizada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));


    }
}
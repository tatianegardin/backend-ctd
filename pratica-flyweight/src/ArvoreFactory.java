import java.util.HashMap;
import java.util.Map;

public class ArvoreFactory {
    private Map<String, Arvore> arvoreMap = new HashMap<>();

    public Arvore getArvore(double altura, double largura, String cor){
        String id = "id: " + altura + ":" + largura + ":" + "cor";
        if(arvoreMap.containsKey(id)){
            Arvore arvore = arvoreMap.get(id);
            arvore.setContador(arvore.getContador() + 1);
            System.out.println("Arvore Obtida");
            return arvore;
        }
        arvoreMap.put(id, new Arvore(altura, largura, cor));
        System.out.println("Arvore criada");
        return arvoreMap.get(id);
    }
}

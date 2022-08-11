import org.apache.log4j.Logger;

import java.util.List;


public class Validador {

    private static final Logger logger = Logger.getLogger(Validador.class);


    public static void validador (List<Integer> lista){
        if(lista.isEmpty()) {
            logger.error("lista vazia");
            throw new RuntimeException();
        }
        double media = lista.stream().mapToDouble(Integer::doubleValue).average().getAsDouble();
        if(lista.size() > 5){
            logger.info("[Lista média: " + media + "]" + "lista com mais de 5 itens");
        } if(lista.size() > 10){
            logger.info("[Lista média: " + media + "]" +"lista com mais de 10 itens");
        }

    }
}

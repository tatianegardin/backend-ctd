import org.apache.log4j.BasicConfigurator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        BasicConfigurator.configure();
        List<Integer> notas = new ArrayList<>();
        notas.add(10);
        notas.add(3);
        notas.add(8);
        notas.add(5);
        notas.add(5);
        notas.add(5);

        List<Integer> notas2 = new ArrayList<>(notas);
        notas2.addAll(notas);
        notas2.addAll(notas);
        List<Integer> notas3 = new ArrayList<>();

        Validador.validador(notas);
        Validador.validador(notas2);
        Validador.validador(notas3);
    }
}
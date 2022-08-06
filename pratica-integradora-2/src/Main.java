import com.dh.backend.exception.FilmeNaoHabilitadoException;
import com.dh.backend.model.Ip;
import com.dh.backend.model.Serie;
import com.dh.backend.service.GradeDeFilmes;
import com.dh.backend.service.GradeDeFilmesProxy;
import com.dh.backend.service.GradeSerieProxy;
import com.dh.backend.exception.SerieNaoHabilitadaException;

public class Main {
    public static void main(String[] args) {
         //Teste filmes
        GradeDeFilmesProxy proxy = new GradeDeFilmesProxy(new GradeDeFilmes());
        proxy.setIp(new Ip(21, 23, 23, 25));

        try {
            System.out.println(proxy.getFilme("The White Tiger").getLink());
            System.out.println("Acesso Liberado");
        } catch (FilmeNaoHabilitadoException e) {
            System.out.println(e);
        }


        // Teste series
        GradeSerieProxy gradeSerieProxy = new GradeSerieProxy();
        gradeSerieProxy.addSerie(new Serie("Moon Knight"));
        gradeSerieProxy.addSerie(new Serie("Sandman"));
        gradeSerieProxy.addSerie(new Serie("Resident Evil"));
        gradeSerieProxy.addSerie(new Serie("Vikings"));
        gradeSerieProxy.addSerie(new Serie("How i meet You Mother"));

        try{
            System.out.println();
            System.out.println(gradeSerieProxy.getSerie("Moon Knight"));
        }catch (SerieNaoHabilitadaException ex){
            System.out.println(ex);
        }

    }


}

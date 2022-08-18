import dh.backend.model.Materia;
import dh.backend.service.MateriaService;

public class Main {

    public static void main(String[] args) {
        MateriaService materiaService = new MateriaService();

        materiaService.saveMateria(new Materia("backend"));
        materiaService.saveMateria(new Materia("frontend"));
        materiaService.saveMateria(new Materia("infraestrutura"));


    }
}
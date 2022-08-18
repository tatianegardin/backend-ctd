import com.dh.backend.dao.ConfigJDBC;
import com.dh.backend.model.Filial;
import com.dh.backend.service.FilialService;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

        FilialService filialService = new FilialService();

        Filial filial = new Filial("filial1", "rua", "1", "cidade1", "estado1", true);
        filialService.save(filial);

    }
}
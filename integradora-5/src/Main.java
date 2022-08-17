import com.dh.backend.model.Endereco;
import com.dh.backend.model.Paciente;
import com.dh.backend.service.PacienteService;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        PacienteService pacienteService = new PacienteService();
        Endereco endereco = new Endereco("rua", "numero", "cidade", "bairro");
        Paciente paciente = new Paciente("Paciente", "1", "1232", LocalDate.now(), endereco );

        Endereco endereco2 = new Endereco("rua2", "numero2", "cidade2", "bairro2");
        Paciente paciente2 = new Paciente("Paciente", "2", "123245", LocalDate.now(), endereco2 );


        System.out.println(pacienteService.savePaciente(paciente));
        System.out.println(pacienteService.savePaciente(paciente2));
    }
}
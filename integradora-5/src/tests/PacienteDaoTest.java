package tests;


import com.dh.backend.dao.impl.PacienteDao;
import com.dh.backend.model.Paciente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tests.utils.TestUtils;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PacienteDaoTest {

    PacienteDao pacienteDao = new PacienteDao();
    Paciente paciente, paciente2;

    @BeforeEach
    public  void setup(){
        Paciente newPaciente = TestUtils.newPaciente();
        newPaciente.setNome("Paciente1");
        Paciente newPaciente2 = TestUtils.newPaciente();
        newPaciente2.setNome("Paciente2");

        paciente = pacienteDao.save(newPaciente);
        paciente2 = pacienteDao.save(newPaciente2);
    }

    @Test
    void save_find_delete() {
        Paciente paciente = TestUtils.newPaciente();

        //Adicione um paciente com endereço
        Paciente insertPaciente = pacienteDao.save(paciente);
        assertEquals(paciente.getNome(), insertPaciente.getNome());
        assertTrue(insertPaciente.getId() != 0 );

        //e pesquise no banco de dados pelo ID;
        Paciente findById = pacienteDao.findById(insertPaciente.getId());
        assertEquals(insertPaciente.getId(), findById.getId());
        assertEquals(insertPaciente.getNome(), findById.getNome());

        //Exclua o paciente criado anteriormente e procure-o
        pacienteDao.deleteById(insertPaciente.getId());
        Paciente findByIdNotExists = pacienteDao.findById(insertPaciente.getId());
        assertNull(findByIdNotExists);

        //Pesquise e imprima no console todos os pacientes com seus endereços
        // serão listados todos os pacientes que incluímos antes de realizar o primeiro teste.
        List<Paciente> pacienteList = new ArrayList<>(pacienteDao.findAll());
        System.out.println(pacienteList);
        assertTrue(pacienteList.size() > 2 );
    }

}
package com.dh.backend.testes;

import com.dh.backend.model.Filial;
import com.dh.backend.service.FilialService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilialDaoTest {

    FilialService service = new FilialService();

    @Test
    void save() {
        Filial filial1 = TesteFilialUtil.newFilial1();
        Filial filial2 = TesteFilialUtil.newFilial2();
        Filial filial3 = TesteFilialUtil.newFilial3();
        Filial filial4 = TesteFilialUtil.newFilial4();
        Filial filial5 = TesteFilialUtil.newFilial5();

        Filial filialResult1 = service.save(filial1);
        Filial filialResult2 = service.save(filial2);
        Filial filialResult3 = service.save(filial3);
        Filial filialResult4 = service.save(filial4);
        Filial filialResult5 = service.save(filial5);

        assertEquals(filial1.getNomeFilial(), filialResult1.getNomeFilial());
        assertEquals(filial2.getEstado(), filialResult2.getEstado());
        assertTrue(filialResult3.getId() != filialResult4.getId());
        assertTrue(filialResult4.getId() != filialResult5.getId());
        assertTrue(filial1.isCincoEstrelas());
        assertTrue(filialResult1.isCincoEstrelas());
    }
}
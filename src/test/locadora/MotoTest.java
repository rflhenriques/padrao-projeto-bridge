package test.locadora;

import locadora.ConfiguracaoLocadora;
import locadora.Economico;
import locadora.Luxo;
import locadora.Moto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotoTest {

    @BeforeEach
    void setUp() {
        ConfiguracaoLocadora.getInstance().setTaxaSeguroGlobal(0.10f);
    }

    @Test
    void deveRetornarDiariaMotoEconomica() {
        Moto moto = new Moto(50.0f);
        moto.setCategoria(Economico.getInstance());
        assertEquals(52.5f, moto.calcularDiaria(), 0.01f);
    }

    @Test
    void deveRetornarDiariaMotoLuxo() {
        Moto moto = new Moto(50.0f);
        moto.setCategoria(Luxo.getInstance());
        assertEquals(78.75f, moto.calcularDiaria(), 0.01f);
    }
}

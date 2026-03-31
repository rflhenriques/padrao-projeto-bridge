package test.locadora;

import locadora.Carro;
import locadora.ConfiguracaoLocadora;
import locadora.Economico;
import locadora.Luxo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @BeforeEach
    void setUp() {
        // Reseta a taxa global para 10% (0.10f) antes de cada teste
        ConfiguracaoLocadora.getInstance().setTaxaSeguroGlobal(0.10f);
    }

    @Test
    void deveRetornarDiariaCarroEconomico() {
        Carro carro = new Carro(100.0f);
        carro.setCategoria(Economico.getInstance());
        assertEquals(110.0f, carro.calcularDiaria(), 0.01f);
    }

    @Test
    void deveRetornarDiariaCarroLuxo() {
        Carro carro = new Carro(100.0f);
        carro.setCategoria(Luxo.getInstance());
        assertEquals(165.0f, carro.calcularDiaria(), 0.01f);
    }

    @Test
    void deveRetornarDiariaCarroLuxoComTaxaGlobalAlterada() {
        ConfiguracaoLocadora.getInstance().setTaxaSeguroGlobal(0.20f);
        Carro carro = new Carro(100.0f);
        carro.setCategoria(Luxo.getInstance());
        assertEquals(180.0f, carro.calcularDiaria(), 0.01f);
    }
}

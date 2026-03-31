package test.locadora;

import locadora.ConfiguracaoLocadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class ConfiguracaoLocadoraTest {

    @Test
    public void deveRetornarNomeLocadora() {
        ConfiguracaoLocadora.getInstance().setNomeLocadora("Locadora Central");
        Assertions.assertEquals("Locadora Central", ConfiguracaoLocadora.getInstance().getNomeLocadora());
    }

    @Test
    public void deveRetornarTaxaSeguroGlobal() {
        ConfiguracaoLocadora.getInstance().setTaxaSeguroGlobal(0.15f);
        assertEquals(0.15f, ConfiguracaoLocadora.getInstance().getTaxaSeguroGlobal(), 0.01f);
    }
}

package locadora;

public class ConfiguracaoLocadora {

    private ConfiguracaoLocadora() {};
    private static ConfiguracaoLocadora instance = new ConfiguracaoLocadora();

    public static ConfiguracaoLocadora getInstance() {
        return instance;
    }

    private String nomeLocadora = "Locadora Central";
    private float taxaSeguroGlobal = 0.10f;

    public String getNomeLocadora() {
        return nomeLocadora;
    }

    public void setNomeLocadora(String nomeLocadora) {
        this.nomeLocadora = nomeLocadora;
    }

    public float getTaxaSeguroGlobal() {
        return taxaSeguroGlobal;
    }

    public void setTaxaSeguroGlobal(float taxaSeguroGlobal) {
        this.taxaSeguroGlobal = taxaSeguroGlobal;
    }
}

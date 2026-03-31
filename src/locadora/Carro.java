package locadora;

public class Carro extends Veiculo {

    public Carro(float diariaBase) {
        super(diariaBase);
    }

    @Override
    public float calcularDiaria() {
        float valorComCategoria = this.diariaBase * (1 + this.categoria.percentualAcrescimo());

        float taxaGlobal = ConfiguracaoLocadora.getInstance().getTaxaSeguroGlobal();

        return valorComCategoria * (1 + taxaGlobal);
    }
}

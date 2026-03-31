package locadora;

public class Moto extends Veiculo {

    public Moto(float diariaBase) {
        super(diariaBase);
    }

    @Override
    public float calcularDiaria() {
        float valorComCategoria = this.diariaBase * (1 + this.categoria.percentualAcrescimo());

        float taxaEspecialMoto = ConfiguracaoLocadora.getInstance().getTaxaSeguroGlobal() / 2;

        return valorComCategoria * (1 + taxaEspecialMoto);
    }
}

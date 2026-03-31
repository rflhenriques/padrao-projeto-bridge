package locadora;

public abstract class Veiculo {

    protected Categoria categoria;
    protected float diariaBase;

    public Veiculo(float diariaBase) {
        this.diariaBase = diariaBase;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public abstract float calcularDiaria();
}

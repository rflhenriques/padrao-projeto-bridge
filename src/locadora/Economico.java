package locadora;

public class Economico implements Categoria {

    private static Economico instance = new Economico();

    private Economico() {}

    public static Economico getInstance() {
        return instance;
    }

    public float percentualAcrescimo() {
        return 0.0f;
    }
}

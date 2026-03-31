package locadora;

public class Luxo implements Categoria {

    private static Luxo instance = new Luxo();

    private Luxo() {}

    public static Luxo getInstance() {
        return instance;
    }

    public float percentualAcrescimo() {
        return 0.5f;
    }
}

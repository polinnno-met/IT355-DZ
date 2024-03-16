package met.model;
public class Kvadrat implements Oblik {
    private double strana;

    public Kvadrat(double strana) {
        this.strana = strana;
    }

    @Override
    public double obim() {
        return 4 * strana;
    }

    @Override
    public double povrsina() {
        return strana * strana;
    }

    public double getStrana() {
        return strana;
    }

}

package met.model;
public class JednakostranicniTrougao implements Oblik {
    private double strana;

    public JednakostranicniTrougao(double strana) {
        this.strana = strana;
    }

    @Override
    public double obim() {
        return 3 * strana;
    }

    @Override
    public double povrsina() {
        return (Math.sqrt(3) / 4) * strana * strana;    }

    public double getStrana() {
        return this.strana;
    }
}

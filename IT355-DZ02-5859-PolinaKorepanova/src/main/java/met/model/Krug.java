package met.model;
public class Krug implements Oblik {
    private final double radius;

    public Krug(double radius) {
        this.radius = radius;
    }

    @Override
    public double obim() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double povrsina() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return this.radius;
    }
}

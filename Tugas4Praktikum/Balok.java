public class Balok extends Perhitungan{
    private double p, l, t;

    public Balok(double p, double l, double t) {
        this.p = p;
        this.l = l;
        this.t = t;
    }

    public double V() {
        return p * l * t;
    }

    public double LPermukaan() {
        return 2 * (p * l + p * t + l * t);
    }
}

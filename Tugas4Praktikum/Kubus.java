public class Kubus extends Perhitungan{
    private double s;

    public Kubus(double s) {
        this.s = s;
    }

    public double V() {
        return s*s*s;
    }

    public double LPermukaan() {
        return 6 * s * s;
    }
}

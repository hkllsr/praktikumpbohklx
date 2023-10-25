import mtklama.Matematika;

public class Matematika2 extends Matematika {
Matematika MTK = new Matematika();

    public double bagi(int a, int b) {
        if (b == 0) {
            return Double.NaN;
        }
        return (double) a / b;
    }
    public int modulus(int a, int b) {
        return a % b;
    }
}


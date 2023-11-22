public class Prima {

    public static void main(String[] args) {
        System.out.println("Deret bilangan prima dan bukan dari 0 - 20:");
        PrimeorNot();
    }

    public static void PrimeorNot() {
        for (int i = 0; i <= 20; i++) {
            if (BilPrima(i)) {
                System.out.println(i + " adalah bilangan prima");
            } else {
                System.out.println(i + " bukan bilangan prima");
            }
        }
    }

    // Fungsi untuk mengecek apakah suatu bilangan prima
    public static boolean BilPrima(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

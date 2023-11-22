public class GanjilGenap {

    public static void main(String[] args) {
        System.out.println("Deret bilangan ganjil dan genap dari 0 - 20:");
        GanjilOrGenap();
    }

    public static void GanjilOrGenap() {
        int i = 0;
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println(i + " adalah bilangan genap");
            } else {
                System.out.println(i + " adalah bilangan ganjil");
            }
            i++;
        }
    }
}

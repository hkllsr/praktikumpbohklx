public class MatematikaInheritance {
    public static void main(String[] args) {
        Matematika2 MTK = new Matematika2();

        System.out.println("Hasil Tambah  = " + MTK.pertambahan(20, 10));
        System.out.println("Hasil Kurang  = " + MTK.pengurangan(10, 5));
        System.out.println("Hasil Kali    = " + MTK.perkalian(10, 3));
        System.out.println("Hasil Bagi    = " + MTK.pembagian(21, 2));
        System.out.println("Hasil Modulus = " + MTK.modulus(21, 2));
    }
}


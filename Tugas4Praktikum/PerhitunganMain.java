public class PerhitunganMain {
    public static void main(String[] args) {
        Perhitungan kubus = new Kubus(8);
        System.out.println("Volume Kubus: " + kubus.V());
        System.out.println("Luas Permukaan Kubus: " + kubus.LPermukaan());

        Perhitungan balok = new Balok(5, 3, 4);
        System.out.println("Volume Balok: " + balok.V());
        System.out.println("Luas Permukaan Balok: " + balok.LPermukaan());
    }
}

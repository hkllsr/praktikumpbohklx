public class LaguAnakAyam {
    public static void main(String[] args) {
        int jumlahAnakAyam = 7; // Sesuaikan jumlah anak ayam dengan keinginan kalian
        System.out.println("Lagu Anak Ayam Turun " + jumlahAnakAyam);

        for (int i = jumlahAnakAyam; i > 0; i--) {
            if (i == 1) {
                System.out.println("Anak ayam turun " + i + ", mati satu tinggal induknya.");
            } else {
                System.out.println("Anak ayam turun " + i + ", mati satu tinggal " + (i - 1) + ".");
            }
        }
    }
}

import java.util.Scanner;

public class TokoSerbaAvailable {

    public static void main(String[] args) {
        String[] namaBarang = {"Buku", "Pensil", "Pulpen"};
        int[] hargaBarang = {3000, 4000, 5000};
        Scanner input = new Scanner(System.in);
        System.out.println("TOKO SERBA ADA");
        System.out.println("**********************");
        System.out.print("Masukkan jumlah barang yang akan dibeli: ");
        int jumlahBeli = input.nextInt();
        String[] kodeBarang = new String[jumlahBeli];
        int[] jumlahBeliArray = new int[jumlahBeli];
        for (int i = 0; i < jumlahBeli; i++) {
            System.out.println("Data barang ke-" + (i + 1));
            System.out.print("Masukkan kode barang (a001 - a003): ");
            kodeBarang[i] = input.next();
            while (!KodeBarangValid(kodeBarang[i])) {
                System.out.println("Kode barang tidak valid. Masukkan ulang.");
                System.out.print("Masukkan kode barang (a001 - a003): ");
                kodeBarang[i] = input.next();
            }
            System.out.print("Masukkan jumlah beli: ");
            jumlahBeliArray[i] = input.nextInt();
        }
        System.out.println("\n Toko Serba Ada ");
        System.out.println("**********************");
        System.out.println("No   Kode Barang   Nama Barang   Harga    Jumlah Beli   Jumlah Bayar");
        System.out.println("====================================================================");

        int JumlahBayar = 0;
        for (int i = 0; i < jumlahBeli; i++) {
            int index = Integer.parseInt(kodeBarang[i].substring(1)) - 1;
            int totalHargaBarang = hargaBarang[index] * jumlahBeliArray[i];
            JumlahBayar += totalHargaBarang;
            System.out.printf("%-5d%-14s%-14s%-14d%-13d%-13d\n", (i + 1), kodeBarang[i], namaBarang[index], hargaBarang[index], jumlahBeliArray[i], totalHargaBarang);
        }
        System.out.println("=====================================================================");
        System.out.println("\nTotal Harga:                                                       " + JumlahBayar);
        System.out.println("=====================================================================");
    }

    static boolean KodeBarangValid(String kode) {
        return kode.matches("a00[1-3]");
    }
}

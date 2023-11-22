import java.util.Scanner;

public class TabelPerkalian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nilai n (lebih kecil atau sama dengan 10)
        System.out.print("Masukkan nilai n (<=10): ");
        int n = scanner.nextInt();

        // Validasi input
        if (n <= 0 || n > 10) {
            System.out.println("Masukkan nilai n yang sesuai.");
        }

        // Membuat tabel perkalian n x n
        System.out.println("Tabel Perkalian " + n + " x " + n + ":");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%-4d", i * j);
            }
            System.out.println();
        }

        scanner.close();
    }
}

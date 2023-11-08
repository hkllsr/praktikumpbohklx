import java.util.Scanner;
public class IndeksMassaTubuh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double BB, TB, IMT;
		String keterangan;
        System.out.println("|=================|==================|");
		System.out.println("|    NILAI IMT    |     KRITERIA     |");
        System.out.println("|=================|==================|");
        System.out.println("|      <18.5      |Berat Badan Kurang|");
        System.out.println("|    18.5-24.9    |Berat Badan Ideal |");
        System.out.println("|     25-29.9     |Berat Badan Lebih |");
        System.out.println("|     30-39.9     |       Gemuk      |");
        System.out.println("|       >=40      |   Sangat Gemuk   |");
        System.out.println("|=================|==================|");
        
        System.out.print("\nMasukkan Berat Badan (kg): ");
        BB = input.nextDouble();
        System.out.print("Masukkan Tinggi Badan (m): ");
        TB = input.nextDouble();
        
        IMT = BB / (TB * TB);
        
        if (IMT < 18.5) {
            keterangan = "Berat Badan Kurang";
        } else if (IMT < 25) {
            keterangan = "Berat Badan Ideal";
        } else if (IMT < 30) {
            keterangan = "Berat Badan Lebih";
        } else if (IMT < 40) {
            keterangan = "Gemuk";
        } else {
            keterangan = "Sangat Gemuk";
        }
        
        System.out.println("\nIMT Anda adalah          : " + IMT);
        System.out.println("Kriteria                 : " + keterangan);
	}

}

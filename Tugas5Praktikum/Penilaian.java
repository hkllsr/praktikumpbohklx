import java.util.Scanner;

public class Penilaian {
public static void main(String[] args) {
		String npm, nama, grade = null, ket = null;
		int nilaiKehadiran, nilaiTugas, nilaiUTS, nilaiUAS;
		double nilaiAkhir, nilaiRerata;
		Scanner input = new Scanner(System.in);
		System.out.print("NPM: ");
		npm = input.nextLine();
		System.out.print("Nama Mahasiswa: ");
		nama = input.nextLine();
		System.out.print("Nilai Kehadiran: ");
		nilaiKehadiran = input.nextInt();
		System.out.print("Nilai Tugas: ");
		nilaiTugas = input.nextInt();
		System.out.print("Nilai UTS: ");
		nilaiUTS = input.nextInt();
		System.out.print("Nilai UAS: ");
		nilaiUAS = input.nextInt();
		
		nilaiRerata = (nilaiKehadiran + nilaiTugas + nilaiUTS + nilaiUAS) / 4;
		nilaiAkhir = (0.1*nilaiKehadiran) + (0.2*nilaiTugas) + (0.3*nilaiUTS) + (0.4*nilaiUAS);
		if(nilaiAkhir >= 76) {
			grade = "A";
			ket = "Istimewa";
		} else if(nilaiAkhir >= 66) {
			grade = "B";
			ket = "Baik";
		} else if(nilaiAkhir >= 56) {
			grade = "C";
			ket = "CUKUP";
		} else if(nilaiAkhir >= 46) {
			grade = "D";
			ket = "Kurang";
		} else if(nilaiAkhir <= 45) {
			grade = "E";
			ket = "Kurang Sekali";
		}
		
		System.out.println();
		System.out.println("NPM Mahasiswa    : " + npm);
        System.out.println("Nama Mahasiswa   : " + nama);
        System.out.println("Nilai Rata-Rata  : " + nilaiRerata);
        System.out.println("Grade            : " + grade);
        System.out.println("Keterangan       : " + ket);
        System.out.println("Nilai Akhir      : " + nilaiAkhir);
	}

}

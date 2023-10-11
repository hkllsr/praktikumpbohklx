public class Nilai {
	
	String nim;
	String name;
	Float  NilaiAbsen;
	Float  NilaiTugas;
	Float  NilaiUTS;
	Float  NilaiUAS;
	Float  NilaiAkhir;
	
	float nilai() {
		NilaiAkhir = (NilaiAbsen * 10/100) + (NilaiTugas * 20/100) + (NilaiUTS * 30/100) + (NilaiUAS * 40/100);
		return NilaiAkhir;
	}
	
	void CetakNilai() {
		System.out.println("NIM: "+nim);
		System.out.println("nama: "+name);
		System.out.println("Nilai Absen [10%]: "+NilaiAbsen);
		System.out.println("Nilai Tugas [20%]: "+NilaiTugas);
		System.out.println("Nilai UTS [30%]: "+NilaiUTS);
		System.out.println("Nilai UAS [40%]: "+NilaiUAS);
		System.out.println("Nilai Akhir: "+nilai());
	}
}

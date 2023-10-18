public class MTK1Main {

	public static void main(String[] args) {
		MTK1 MTK = new MTK1() {
		};
		int Pertambahan = MTK.Pertambahan(20, 10);
		int Pengurangan = MTK.Pengurangan(10, 5);
		int Perkalian = MTK.Perkalian(10, 3);
		double Pembagian = MTK.Pembagian(21, 2);
		
		System.out.println("Pertambahan: 20 + 10 = "+Pertambahan);
		System.out.println("Pengurangan: 20 - 5 = "+Pengurangan);
		System.out.println("Perkalian: 10 x 3 = "+Perkalian);
		System.out.println("Pembagian: 21 / 2 = "+Pembagian);
	}

}

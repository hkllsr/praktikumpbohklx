public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika mtk = new Matematika();
        int pertambahan = mtk.pertambahan(20, 10);
        int pengurangan = mtk.pengurangan(10, 5);
        int perkalian = mtk.perkalian(10, 3);
        double pembagian = mtk.pembagian(21, 2);
        mtk.info();
    }
}
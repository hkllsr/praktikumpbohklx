public class Matematika {
    int a, b;

    int pertambahan (int a, int b){
        int hasil = a+b;
        return hasil;
    }

    int pengurangan (int a, int b){
        int hasil = a-b;
        return hasil;
    }

    int perkalian (int a, int b){
        int hasil = a*b;
        return hasil;
    }

    double pembagian (int a, int b){
        int hasil = a/b;
        return hasil;
    }

    void info(){
        System.out.println("Pertambahan 20 + 10 = "+pertambahan(20, 10));
        System.out.println("Pengurangan 10 - 5 = "+pengurangan(10, 5));
        System.out.println("Perkalian 10 * 3 = "+perkalian(10, 3));
        System.out.println("Pembagian 21/2 = "+pembagian(21, 2));
    }
}
    
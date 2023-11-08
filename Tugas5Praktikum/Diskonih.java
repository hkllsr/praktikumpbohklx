import java.util.Scanner;

public class Diskonih {
    public static void main(String[] args) {
        int diskon, jumlah, totpem;
        Scanner input = new Scanner(System.in);

        System.out.print("Total Pembelian: ");
        totpem = input.nextInt();
        if (totpem>=50000){
            diskon=totpem*20/100;
        System.out.println("Diskon = "+diskon);

        }else{
            diskon=totpem*5/100;
        System.out.println("Diskon = "+diskon);
        }
        jumlah=totpem-diskon;
        System.out.println("Jumlah harga yang harus dibayar = "+jumlah);
    }
}

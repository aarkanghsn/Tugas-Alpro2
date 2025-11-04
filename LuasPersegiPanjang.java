import java.util.Scanner;

public class LuasPersegiPanjang {

    public static double hitungLuas(double panjang, double lebar) {
        return panjang * lebar;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hitung Luas Persegi Panjang");
        System.out.print("Masukkan Panjang: ");
        double panjang = input.nextDouble();
        
        System.out.print("Masukkan Lebar: ");
        double lebar = input.nextDouble();

        double luas = hitungLuas(panjang, lebar);

        System.out.println("\nLuas Persegi Panjang adalah: " + luas);
        
        input.close();
    }
}
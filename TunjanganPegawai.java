import java.util.Scanner;

public class TunjanganPegawai {

    public static double hitungTunjangan(double gajiKotor, int jumlahAnak) {
        double persentaseTunjangan;

        if (jumlahAnak < 3) {
            persentaseTunjangan = 0.20;
        } else {
            persentaseTunjangan = 0.30;
        }

        double tunjangan = gajiKotor * persentaseTunjangan;
        return tunjangan;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Hitung Tunjangan Pegawai ---");
        
        System.out.print("Masukkan Gaji Kotor (Rp): ");
        double gajiKotor = input.nextDouble();

        System.out.print("Masukkan Jumlah Anak: ");
        int jumlahAnak = input.nextInt();

        double besarTunjangan = hitungTunjangan(gajiKotor, jumlahAnak);

        System.out.printf("\nBerdasarkan %d anak dan gaji kotor Rp %,.2f, \n", jumlahAnak, gajiKotor);
        System.out.printf("Besar Tunjangan yang Diterima adalah: Rp %,.2f\n", besarTunjangan);

        input.close();
    }
}

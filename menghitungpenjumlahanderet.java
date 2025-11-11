import java.util.Scanner;

public class menghitungpenjumlahanderet {
    public static int pangkatRekrusif(int bilangan, int pangkat) {
        if (pangkat == 0) {
            return 1;
        }
        else{
            return bilangan * pangkatRekrusif(bilangan, pangkat -1);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input bilangan:"); int bilangan = scanner.nextInt();
        System.out.println("input pangkat: "); int pangkat = scanner.nextInt()
        System.out.println("Hasil "+bilangan+" pangkat "+pangkat+"="+pangkatRekrusif(bilangan,pangkat));
    }
}

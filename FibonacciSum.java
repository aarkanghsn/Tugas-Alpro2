import java.util.Scanner;

public class FibonacciSum {
    // Fungsi rekursif untuk menghitung angka Fibonacci ke-n
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Fungsi rekursif untuk menghitung jumlah deret Fibonacci hingga n angka
    public static int fibSum(int n) {
        if (n <= 0) {
            return 0;
        }
        return fibonacci(n) + fibSum(n - 1);
    }

    // Fungsi untuk mencetak deret dan jumlah
    public static void printFibSeries(int n) {
        System.out.print("Deret fibonanci : ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i));
            if (i < n - 1) {
                System.out.print(" + ");
            }
        }
        System.out.println(" = " + fibSum(n));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("jumlah deret fibonanci : ");
        int n = scanner.nextInt();
        printFibSeries(n);
        scanner.close();
    }
}
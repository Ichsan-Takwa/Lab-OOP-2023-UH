import java.util.Scanner;
import java.lang.Math;

public class Nomor6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("masukkan jari (cm) : ");
        int r = scanner.nextInt();

        Double luasLungkaran =  Math.PI *r * r;

        System.out.printf("Luas lingkaran adalah : %.02f cmf", luasLungkaran);

        scanner.close();
    }
}

import java.util.Scanner;
public class Nomor2 {
    public static void main(String[] args) {
        countNumType();
    }

    static void countNumType(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int countBulat = 0;
        int countDecimal = 0;
        
        for (int i = 0; i < n; i++) {
            if(  scanner.hasNextInt()){
                countBulat++;
                scanner.nextInt();
            } else if (scanner.hasNextDouble()){
                countDecimal++;
                scanner.nextDouble();
            } else {
                System.out.println(scanner.next() + " bukan bilangan");
            }

        }
        System.out.println("\n Hasil : ");
        System.out.println(countBulat + " Bilangan Bulat");
        System.out.println(countDecimal + " Bilangan Desimal");
        scanner.close();
    }
}

import java.util.Scanner;

public class Nomor3 {
    public static void main(String[] args) {
        inputNprintData();
    }

    static void inputNprintData(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama : ");
        String nama = scanner.nextLine();
        
        int umur = 0;
        try{
            System.out.print("Umur : ");
            umur = scanner.nextInt();
        } catch (Exception e){
            System.out.println("umur harus angka");
        }

        System.out.print("Hobby : ");
        String hobby = scanner.next();

        System.out.printf("Nama saya %s, %d tahun, hobby %s", nama, umur, hobby);
        scanner.close();
    }
}

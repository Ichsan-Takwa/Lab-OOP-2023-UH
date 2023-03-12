import java.util.Scanner;

public class Nomor4 {
    public static void main(String[] args) {
        capitalize2();
    }   
    
    static void capitalize1(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan Judul Film");
        String judulFilm = scanner.nextLine();

        String kata[] = judulFilm.split(" ");
        String kataCapitalized = ""; 
        for (int i = 0; i < kata.length; i++) {
            char c = kata[i].charAt(0);

            if(i != kata.length-1)
                kata[i] = Character.toUpperCase(c) + kata[i].substring(1)+" ";
            else
            kata[i] = Character.toUpperCase(c) + kata[i].substring(1)+"_";

        }


        System.out.println(kataCapitalized);
        scanner.close();
    }

    static void capitalize2(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan Judul Film");
        String judulFilm = scanner.nextLine();

        String kataCapitalized = ""; 

        for (String kata : judulFilm.split(" ")) {
            kataCapitalized += kata.substring(0,1).toUpperCase() + kata.substring(1)+" ";
        }
        kataCapitalized = kataCapitalized.substring(0,kataCapitalized.length()-1);

        System.out.println(kataCapitalized);
        scanner.close();
    }
}

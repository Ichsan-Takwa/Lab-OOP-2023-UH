import java.util.Scanner;

public class Nomor8 {
    public static void main(String[] args) {
           int[][] num = {{8,11,3,4}, {6,2,7,10}, {1,9,5,12}};

           Scanner sc = new Scanner(System.in);

           System.out.print("find number : ");
           int findme = sc.nextInt();
           sc.close();
           System.out.println();

           for (int i = 0; i < num.length; i++) {
                for (int j = 0; j < num.length; j++) {
                    if (findme == num[i][j]){
                        System.out.printf("Found %d at [%d][%d]", findme, i, j);
                    }
                }
           }
    }
}

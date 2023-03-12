import java.util.HashMap;
import java.util.Scanner;

class Nomor5{
    public static void main(String[] args) {
        dateFormat();
    }

    static void dateFormat(){
        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> mapMonth = new HashMap<>();
        mapMonth.put("01", "January");
        mapMonth.put("02", "February");
        mapMonth.put("03", "Maret");
        mapMonth.put("04", "April");
        mapMonth.put("05", "Mei");
        mapMonth.put("06", "Juni");
        mapMonth.put("07", "July");
        mapMonth.put("08", "Agustus");
        mapMonth.put("09", "September");
        mapMonth.put("10", "Oktober");
        mapMonth.put("11", "November");
        mapMonth.put("12", "Desember");

        String date = scanner.next();
        String d = date.substring(0,2);
        String m = date.substring(3,5);
        String y = date.substring(6,8);

        String year = Integer.parseInt(y)>23? "19"+y: "20"+y;

        String finalDate = d.replace("0","") +" "+ mapMonth.get(m) +" "+ year;  
        System.out.println(finalDate);

        scanner.close();
    } 
}
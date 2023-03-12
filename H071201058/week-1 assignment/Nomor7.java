import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.*;

class Nomor7 {

    String[] negara = {
        "Indonesia", 
        "Filipina",
        "Singapura",
        "Thailand",
        "Brunei",
        "Darussalam",
        "Vietnam",
        "Laos"
    };
    public static void main(String[] args) {
   
        findIndex("washington");
    }

    static void findIndex(String text){

        String fn = "negara.txt";
        Pattern p = Pattern.compile(String.format("[a-z1-9\s]*%s[a-z1-9\s]*", text), Pattern.CASE_INSENSITIVE);

        try (
                FileReader file = new FileReader(fn);
                BufferedReader reader = new BufferedReader(file)
            ){
                
                String line;
                while ((line = reader.readLine()) != null){
                    if (p.matcher(line).find()){
                        System.out.println(line);
                    }
                }
        } catch (Exception e) {
            System.out.println(e);
        }




    }
}
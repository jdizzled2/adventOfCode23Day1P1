import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        URL path = Main.class.getResource("day1.txt");
        File f = new File(path.getFile());
        //final String FILENAME = "day1.txt";
        System.out.printf("Hello and welcome!");

        String input = """
1abc2
pqr3stu8vwx
a1b2c3d4e5f
treb7uchet
                """;


        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(f));
            int sum = 0;
            for(String line: bufferedReader.lines().toList()){  /*input.split("\n")*/
                int firstNo = -1;
                int lastNo = -1;
                char blerg = '-'; //this character doesn't exist in the sample input.... guess it doesn't matter, just need it initialised.
                for (int i=0;i<line.length();i++){
                    blerg = line.charAt(i);
                    if(Character.isDigit(line.charAt(i))){
                        firstNo = Character.getNumericValue(line.charAt(i));
                        break;
                    }
                    System.out.println(blerg);
                }
                System.out.println("firstNo: " + firstNo);
                for (int i=line.length()-1;i>=0;i--){
                    //blerg = line.charAt(i);
                    if(Character.isDigit(line.charAt(i))){
                        lastNo = Character.getNumericValue(line.charAt(i));
                        break;
                    }
                    //System.out.println(blerg);
                }
                System.out.println("lastNo: " + lastNo);
                for(String c: line.split("")){
                    //int firstNo = -1;
                    //int lastNo = -1;

                }
                String value = firstNo + "" + lastNo;
                System.out.println(value);
                sum += Integer.parseInt(value);
            }
            System.out.println("The sum is: " + sum);

            /*for(String line: input.split("\n")){
                System.out.println(line);
            }   */
        }
        catch (Exception e){
            e.printStackTrace();
        }
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
    }
}
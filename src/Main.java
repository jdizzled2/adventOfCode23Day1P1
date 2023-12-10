import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        URL path = Main.class.getResource("day1.txt");
        File f = new File(path.getFile());

        String input = """
1abc2
pqr3stu8vwx
a1b2c3d4e5f
treb7uchet
                """;

        /*Solution checks from front of string for first number, back of string for second number
        * Worst case (O)n time if first and last number are the same.
        * */
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(f));
            int sum = 0;
            for(String line: bufferedReader.lines().toList()){  /*input.split("\n")*/
                int firstNo = -1;
                int lastNo = -1;
                char blerg = '-'; //this character doesn't exist in the sample input.... guess it doesn't matter, just need it initialised.

                //find first number from front of string
                for (int i=0;i<line.length();i++){
                    blerg = line.charAt(i);
                    if(Character.isDigit(line.charAt(i))){
                        firstNo = Character.getNumericValue(line.charAt(i));
                        break;
                    }
                }
                //System.out.println("firstNo: " + firstNo);

                //find last number from end of string
                for (int i=line.length()-1;i>=0;i--){
                    blerg = line.charAt(i);
                    if(Character.isDigit(blerg)){
                        lastNo = Character.getNumericValue(blerg);
                        break;
                    }
                }
                //System.out.println("lastNo: " + lastNo);

                String value = firstNo + "" + lastNo;
                System.out.println(value);
                sum += Integer.parseInt(value);
            }
            System.out.println("The sum is: " + sum);


        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
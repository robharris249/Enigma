import java.util.Locale;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Machine m = new Machine(new int[] {1,2,3}, new int[] {0,0,0}, new int[] {21,4,2,5,1,3,6,23,19,18,14,11,13,12,10,15,16,25,9,8,24,0,22,7,20,17});
        LetterConverter l = new LetterConverter();
        Scanner c = new Scanner(System.in);

        String originalLetters = c.nextLine().toLowerCase();

        int[] originalNumbers = l.ConvertToNumbers(originalLetters);
        int[] convertedNumbers = new int[originalLetters.length()];

        for(int i = 0; i < convertedNumbers.length; i++) {
            convertedNumbers[i] = m.takeNumber(originalNumbers[i]);
        }

        String convertedLetters = l.ConvertToLetters(convertedNumbers);

        System.out.println(convertedLetters);
        c.close();
    }

}

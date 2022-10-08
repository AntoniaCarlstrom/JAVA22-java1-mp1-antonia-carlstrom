import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //Generera nummer
        do {
            Random rightAnswer = new Random();
            int num = rightAnswer.nextInt(101);
            int guess;
            int count = 1;


            //Scanner för input nummer mellan 0-100
            do {
                System.out.println("Gissa ett nummer mellan 0-100!");
                Scanner s = new Scanner(System.in);
                guess = s.nextInt();


                //Det som händer när numret skrivits in:
                if (sameNumber(guess, num)) {
                    System.out.println("Bra jobbat! Numret var " + num + "!");
                    // Det tog dig X antal försök!
                    System.out.println("Det tog dig " + count + " försök att gissa rätt!");
//
                } else if (tooHigh(guess, num)) {
                    System.out.println("Tyvärr, " + guess + " är för högt!");
                } else if (tooLow(guess, num)) {
                    System.out.println("Tyvärr, " + guess + " är för lågt!");
                }
                count = count + 1;

            }
            while (guess != num);
        }
        while (true);

    }

    static boolean sameNumber(int x, int y) {
        return x == y;
    }
    static boolean tooHigh(int x, int y) {
        return x > y;
    }
    static boolean tooLow(int x, int y) {
        return x < y;
    }


}

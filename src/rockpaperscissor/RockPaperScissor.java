/**
 * Sebastian Callejas
 * Period 2
 * Project: RockPaperScissor
 * */
package rockpaperscissor;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Seb's Life
 */
public class RockPaperScissor {

    static Scanner scan = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        // Lets get it done!
        mainMenu();
        retry();
    }

    public static void mainMenu() {
        System.out.println("How would you like to play??");
        System.out.println("1. Against AI");
        System.out.println("2. 2 Player Local");
        int choice = scan.nextInt();
        if (choice == 1) {
            randomGen();
        } else if (choice == 2) {
            singlePlayer();
            
        }
    }

    public static void randomGen() {
        System.out.println("Rock Paper or Scissors?");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
        int choice = scan.nextInt();
        int ai = rand.nextInt(3) + 1;

        if (choice == ai) {
            System.out.println("It's a tie!!");

        } else if (choice < ai) {
            System.out.println("You Lost...");
        } else if (choice == 3 && ai == 1) {
            System.out.println("You Lost...");
        } else if (choice == 3 && ai == 2) {
            System.out.println("You Won!");
        }

    }

    public static void singlePlayer() {

    }

    public static void retry() {
        System.out.println("would you like to play again??");
        System.out.println("Y/N");
        String choice = scan.nextLine().toLowerCase();
        if (choice == "y"){
            singlePlayer();
        }
        else {
            System.exit(0);
        }
    }
}

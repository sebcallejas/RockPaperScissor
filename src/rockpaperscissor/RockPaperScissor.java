/**
 * Sebastian Callejas
 * Period 2
 * Project: RockPaperScissor
 * */
package rockpaperscissor;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
/**
 *
 * @author Seb's Life
 */
public class RockPaperScissor {
    static int total = 0;
    static Scanner scan = new Scanner(System.in);
    static Random rand = new Random();
    public static void main(String[] args) {
        // Lets get it done!
        mainMenu();
 
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
        //AI Choice
        if (ai == 1){
            System.out.println("---------------------------------------------");
            System.out.println("I Choose Rock!");
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        } else if (ai == 2){
            System.out.println("---------------------------------------------");
            System.out.println("I Choose Paper!");
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        } else if (ai == 3){
            System.out.println("---------------------------------------------");
            System.out.println("I Choose Scissor!");
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        }
        //Winner Winner Chicken Dinner
        if (choice == ai) {
            System.out.println("---------------------------------------------");
            System.out.println("It's a tie!!");
            System.out.println("---------------------------------------------");
            itsATie();
        } else if (choice == 3 && ai == 1) {
            System.out.println("---------------------------------------------");
            System.out.println("You Lost...");
            System.out.println("---------------------------------------------");
            trashTalk();
        } else if (choice == 3 && ai == 2) {
            System.out.println("---------------------------------------------");
            System.out.println("You Won!");
            System.out.println("---------------------------------------------");
            total++;
        } else if (choice == 2 && ai == 1){
            System.out.println("---------------------------------------------");
            System.out.println("You Won");
            System.out.println("---------------------------------------------");
            total++;
        } else if (choice == 2 && ai == 3){
            System.out.println("---------------------------------------------");
            System.out.println("You Lost");
            System.out.println("---------------------------------------------");
            trashTalk();
            //total-=total.length;
        } else if (choice == 1 && ai == 2){
            System.out.println("---------------------------------------------");
            System.out.println("You Lose!");
            System.out.println("---------------------------------------------");
            trashTalk();
        } else if (choice == 1 && ai == 3){
            System.out.println("---------------------------------------------");
            System.out.println("You Win!");
            System.out.println("---------------------------------------------");
            total++;
        }
        System.out.println("---------------------------------------------");  
        System.out.println("Your HighScore is: "+total);
        System.out.println("---------------------------------------------");
            retry();
    }
 
    public static void singlePlayer() {
        
    }
    
    public static void trashTalk() {     
        String[] trash = new String[]{"C'mon I was playing "
                + "with my eyes closed...","Dude my grandma can do "
                + "better...and she is dead.","Well this game isn't "
                + "for everybody!","Umm were u even trying?" };
        int randoBando = rand.nextInt(4);
        System.out.println(trash[randoBando]);
        }
    public static void itsATie(){
        String [] tie = new String[] {"Well i guess we are on the same "
                + "playing field","Meh, i didn't even wanna win that one"
                ,"Well we both suck i guess.","I played that one with my eyes"
                + "closed -_-"};
        int randoBando = rand.nextInt(4);
        System.out.println(tie[randoBando]);
    }
    

    public static void retry() {
        System.out.println("would you like to play again??");
        System.out.println("Y/N");
        String choice = scan.next().toLowerCase();
        if (choice.equals("y")){ 
            randomGen();
        }
        else {
            System.out.println("Goodbye!");
            System.exit(0);
        }
    }
}

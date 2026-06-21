import java.util.Random;
import java.util.Scanner;

public class guessgame {
    public static void main(String[] args) {
        Random ran= new Random();
        int secrtenum=ran.nextInt(50)+1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Number Guessing Game");
        System.out.println("Guess a number: ");
        int usernum=sc.nextInt();
        int attempt=0;
        while(usernum!=secrtenum) {
            attempt++;
            if (secrtenum < usernum) {
                System.out.println("Too High");
                System.out.println("Guess again: ");
                usernum=sc.nextInt();
                System.out.println("Your Total attempts: " + attempt);

            } else {
                System.out.println("Too Low");
                System.out.println("Guess again:");
                usernum=sc.nextInt();
                System.out.println("Your Total attempts: " + attempt);
            }
        }
        if (secrtenum == usernum) {
            attempt++;
            System.out.println("You Win");
            System.out.println("Your Total attempts: " + attempt);
            System.out.println("End");
        }
    }
}

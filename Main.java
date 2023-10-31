
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



        System.out.println("---------------Welcome to My Game--------------\n");

        System.out.print("Do you have an existing account (Y) or (N): ");
        char answer = input.next().toUpperCase().charAt(0);
        int x = 0;

        while(x!=1) {
            if (answer == 'Y') {
                Database db = new Database();
                db.display();
                x = 1;
                break;

            } else {
                SignUp s = new SignUp();
                s.signUp();
                System.out.println();
                s.signIn();
                x = 1;

            }



        }




    }
}
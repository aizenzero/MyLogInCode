
import java.util.Scanner;


public class SignIn extends SignUp{

    SignUp su = new SignUp();

    Scanner input = new Scanner(System.in);

    SignIn(){
        super();
    }

    public void sigUp(){

    }


    public void signIn(){
        System.out.println("Welcome "+su.getName());

    }

}

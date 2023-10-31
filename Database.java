import java.util.Scanner;

public class Database {
    private String userName = "jeff";
    private String password = "test";
    private String name = "Aizen";


    Database(){
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getUserName(){
        return userName;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return password;
    }

    public String getName(){
        return name;
    }

    public void display(){
        Scanner input = new Scanner(System.in);


        System.out.print("Username: ");
        String username1 = input.next();
        System.out.print("Password: ");
        String password1 = input.next();

        if(username1.equals(getUserName()) && password1.equals(getPassword())){

            System.out.println("---------------Welcome---------------\n");

            System.out.println("Hi! "+ getName());


        }else{
            System.out.println("Wrong password");
        }

    }

}

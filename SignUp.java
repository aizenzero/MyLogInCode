import java.sql.SQLOutput;
import java.util.Scanner;

public class SignUp extends  Database{



    private String name,gender,username,password;
    private int age;

    SignUp(){
        super();
    }

    SignUp(String name,String gender,String username,String password,int age){
        super();
        this.name     = name;
        this.gender   = gender;
        this.username = username;
        this.password = password;
        this.age      = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return gender;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getUsername(){
        return username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return password;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void signUp(){
        Scanner input = new Scanner(System.in);


        System.out.println("-----------Sign Up-----------\n");

        System.out.print("Name: ");
        setName(input.next());

        System.out.print("Gender: ");
        setGender(input.next());

        System.out.print("Age: ");
        setAge(input.nextInt());

        System.out.print("Username: ");
        setUsername(input.next());

        System.out.print("Password: ");
        setPassword(input.next());



        System.out.println("----------Successfully Created---------");


    }

    public void signIn(){

        Scanner input = new Scanner(System.in);


        System.out.print("Username: ");
        String myUsername1 = input.next();

        System.out.print("Password: ");
        String myPassword1 = input.next();


        if(myPassword1.equals(password) && myUsername1.equals(username)){
            System.out.println("\n---Successfully Log in----");
            System.out.println("\nWelcome "+ name);
        }else{
            System.out.println("Wrong password");
        }

    }



}

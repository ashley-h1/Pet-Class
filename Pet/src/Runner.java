import java.util.Scanner;
public class Runner{
    public static void main(String[] args){
        //default pet
        Pet myPet = new Pet();
        System.out.println(myPet.toString());
        //pet 1
        Pet myPet2 = new Pet("Princess", "dog", 19);
        System.out.println(myPet2.toString());
        //user input
        Scanner ok = new Scanner(System.in);
        System.out.println("Enter animal type: ");
        String usertype = ok.nextLine();
        System.out.println("Enter animal name: ");
        String username = ok.nextLine();
        System.out.println("Enter animal age: ");
        int userage = ok.nextInt();
        ok.close();
        //user's pet
        Pet userPet = new Pet(username, usertype, userage); //(name, type, age)
        System.out.println(userPet.toString());
    }
}
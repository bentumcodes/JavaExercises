
package Mod1;

import java.util.Scanner;
public class Welcome {
    public static void main(String[] args){
        
        Intro newUser = new Intro("Bright ", 40);
        
        Scanner input = new Scanner(System.in);
//        System.out.println("What is your name?: ");
//        newUser.userName = input.nextLine();
//        
//        System.out.println("What is your age?: ");
//        newUser.userAge = input.nextInt();
//        input.nextLine();
        System.out.println("Where do you currently live?: ");
        newUser.loc = input.nextLine();
        
        System.out.println("Waht is your favourite food?: ");
        newUser.food = input.nextLine();
        
        newUser.display();
        
        System.out.println("What message do you have for the Youth");
        String msg = input.nextLine();
        
        newUser.WelomeMsg(msg);
    }
    
}

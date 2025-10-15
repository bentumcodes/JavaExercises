
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
//        System.out.println("Where do you currently live?: ");
//        newUser.loc = input.nextLine();
//        
//        System.out.println("Waht is your favourite food?: ");
//        newUser.food = input.nextLine();
//        
//        newUser.display();
//        
//        System.out.println("What message do you have for the Youth");
//        String msg = input.nextLine();
//        
//        newUser.WelomeMsg(msg);
        
        Capsule cp = new Capsule();
        
        System.out.println("What is your Bank ID?: ");
        String id= input.nextLine();
        cp.setUserName(id);
        //clear scanner buffer because of the int used previously
        //input.nextLine();
        
        //ask for users bank account number
        System.out.println("Enter your Account NO: ");
        int acc = input.nextInt();
        cp.setAccno(acc);
        
        //request previous redrawal amount
        System.out.println("Enter previous Redrawal amount: ");
        double amt = input.nextDouble();
        cp.setBal(amt);
        
        //using the get method to display variables to user
        System.out.println("Dear "+cp.getUserName(id)+ "Your Account no is: "+cp.getAccno(acc)+
                "and your last redrawal is "+cp.getBal(amt));
    }
    
}

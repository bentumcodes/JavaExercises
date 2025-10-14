
package Mod1;


public class Intro {
    String userName;
    int userAge;
    String loc;
    String food;
    
    void display(){
        System.out.println("Hello! "+userName+", You are "+userAge+" years old."+
                "You come from "+loc+" and your favourite food is "+food);
    }
    Intro(String name, int age){
        userName = name;
        userAge = age;
    }
    String WelomeMsg(String msg){
        System.out.println("This is a powerful messgage: " +msg);
        return msg;
    }
    
}

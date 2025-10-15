
package Mod1;


public class Capsule {
    //this is an example of encapsulation lessons
    //set private instance variables
    int accno;
    String userName;
    double balance;
    
    //using setters to set data for the variables
    
    void setAccno(int acNo){//variable name does not matter
        accno = acNo; 
    }
    //using getter to get data from the variable
    int getAccno(int acNo){
        return accno;
    }
    
    //setter and getters for userName
    void setUserName(String userName){
        this.userName = userName;//this is used when the parameter name is the same as the instance variable
    }
    
    String getUserName(String userName){
        return userName;
    }
    //setter and getter for balance
    void setBal(double balance){
        this.balance = balance;
    }
    
    double getBal(double balance){
        return balance;
    }
}

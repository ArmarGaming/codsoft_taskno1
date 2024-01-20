import java.util.Random;
import java.util.Scanner;
class sd{
    public static void main(String args[]){
        Random red = new Random();
        int x = red.nextInt(10)+1;
        int a,b;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Weclcom world of Number Guess Game");
        System.out.println("Guess Number Game");

        System.out.println("Enter guess number 1 to 10 ");
        a = s1.nextInt();
        if(x == a){
            System.out.println("Your number guess right");
            
        }
        else{
            System.out.println("Try Agin!!!");
        }
        
            
        
    }
}
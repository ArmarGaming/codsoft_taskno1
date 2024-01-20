//Task 1.3
import java.util.Scanner;
import java.util.Random;
class sa{
    public static void main(String args[]){
        int a=0,b=0,c=0,x=0;
        Random re = new Random();
        Scanner se = new Scanner(System.in);
        System.out.println(":::::::Guess game::::::");
        System.out.println("Enter guess number: ");
        a = se.nextInt();
         x = re.nextInt(10)+1;
         System.out.println("computer number"+x);
   
         if(x == a){
            System.out.println("correct");
         }
         else if(a < x){
            System.out.println("Too Low");
         }
         else{
            System.out.println("Too High");
         }

    }
}
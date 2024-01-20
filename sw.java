// Task 1.4
import java.util.Scanner;
import java.util.Random;
class sw{
    public static void main(String args[]){
        Random re = new Random();
        Scanner se = new Scanner(System.in);
    
        for(int i=1;i<4;i++){
        System.out.println("   Enetr guess number 1 to 10 ");
        
        
            System.out.println("Enter the number : ");
            int r = se.nextInt();
            int a = re.nextInt(10)+1;
        if(a==r){
            System.out.println("...You Win...");
        }
        
        else{
            int j=3-i;
            System.out.println("try to 3 out remain attempt"+j);
        }
        
        

     }
    }
}
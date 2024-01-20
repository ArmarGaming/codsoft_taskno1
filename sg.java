import java.util.Scanner;
import java.util.Random;

class sg {
    public static void main(String args[]){
        Random re = new Random();
        Scanner se = new Scanner(System.in);
        int j = 0, m = 0, n = 0;
        char ans;
        //System.out.println("You won to play");
        //ans = se.next().charAt(0);
        for (;;)
        {
            
            int x = re.nextInt(5) + 1;
            System.out.println("Enter the Guess Number");
            int a = se.nextInt();
            if (a == x) {
                System.out.println("Correct");
                m++;
            } else {
                System.out.println("try agin");
                n++;
            }
            j++;
            System.out.println("You won to play again y/n");
            ans = se.next().charAt(0);
            if( ans == 'n'){
                break;
            }

        }
        
    
        if(m >= 10 && n <= 5){
            System.out.println("You are excelent"+"\n Total attempt: "+ j + "\n win time:"+ m + "\n loss time:" + n);
        } else if (m <= 5 && n <= 10) {
            System.out.println("You are good"+"\n Total attempt: "+ j + "\n win time:"+ m + "\n loss time:" + n );
        } else {
            System.out.println("good try" +"\n Total attempt: "+ j + "\n win time:"+ m + "\n loss time:" + n);
        }
    
    }
}
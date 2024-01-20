
//Task 1.7

import java.util.Scanner;
import java.util.Random;

class sf
{
    public static void main(String args[])
    {
        System.out.println(":::::Number Guess Game:::::\n");
        //System.out.println("Rules & Levels");
        System.out.println(":::Level to choose:::");
        System.out.println("press 1 to Easy level\n" +
                "press 2 to Mideum Level\n" +
                "press 3 to hard Level\n");
        System.out.print(":::Easy Level Ruels:::\n" +
                "1: unlimited chance  to correct number\n" +
                "2: guess numbers in 1 to 10\n\n");
                System.out.print(":::Mideum Level Ruels:::\n" +
                "1: only Five chance to win \n" +
                "2: guess numbers in 1 to 100\n\n");
                System.out.print(":::Hard Level Ruels:::\n" +
                "1: only Three Chance to Win \n" +
                "2: guess numbers in 1 to 100\n\n");

        int ch;
        Random re = new Random();
        Scanner dd = new Scanner(System.in);
        try{
        System.out.println("Enter  your level chood");

        ch = dd.nextInt();
        switch (ch)
        {
            case 1:
                System.out.println("Easy Level");
                for (;;)
                {
                    System.out.println("Enter your guess number");               
                    int a = dd.nextInt();
                    int s = re.nextInt(10) + 1;
                    if (a == s)
                    {
                        System.out.println("Correct You Win");
                        break;
                    } 
                    else
                    {
                        System.out.println("try agin");
                    }

                }
                break;
            case 2:
            System.out.println("Medium Level");
            for(int i=1;i<=5;i++)
            {
                System.out.println("Enter your guess number");
                    int a = dd.nextInt();
                    int s = re.nextInt(100) + 1;
                    int j=5-i;
                    if (a == s)
                    {
                        System.out.println("Correct You Win");
                        break;
                    } 
                    else if(j>0)
                    {
                        System.out.println("remaining try 5 out of"+j);
                    }
                    else{
                        System.out.println("better luck next time");
                    }

            }
            break;
            case 3:
                System.out.println("Hard Level");
                for(int i=1;i<=3;i++)
                {
                    System.out.println("Enter your guess number");
                    int a = dd.nextInt();
                    int s = re.nextInt(100) + 1;
                    int j=3-i;
                    if (a == s)
                    {
                        System.out.println("Correct You Win");
                        break;
                    } 
                    else if(j>0)
                    {
                        System.out.println("remaining try 3 out of"+j);
                    }
                    else{
                        System.out.println("better luck next time");
                    }

                 }
                break;
            default:
                System.out.println("Enter Valid Opation");
                break;
        }
    }
    catch(Exception e){
    System.out.println("Enter only Number ");
    }
    }
}
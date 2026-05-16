import java.lang.System;
import java.util.Scanner;
public class ifelse {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        if(num1 == num2)
        {
            System.out.println("Number is equal");
        }
        else
        {
            System.out.println("Not equal");
        }
    }
    
}

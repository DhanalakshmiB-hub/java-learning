import java.lang.System;
import java.util.Scanner;

public class userinput {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        {
            int age = sc.nextInt();

            System.out.println("Enter name: "+name);
            System.out.println("Enter age: "+age);
        }
    }
}
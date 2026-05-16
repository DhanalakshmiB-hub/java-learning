import java.lang.System;
import java.util.Scanner;
public class userinputnsd {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        double score = sc.nextInt();
        sc.nextLine();
        String department = sc.nextLine();
        System.out.println("My name is " + name);
        System.out.println("My score is " + score/10 + "/10");
        System.out.println("My depatment is " + department);
    }
    
}

package month01.Week4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 0;
        while (true) {
            System.out.print("Enter username: ");
            String username = input.nextLine();
            System.out.print("Enter password: ");
            String password = input.nextLine();

            if (username.equals("lyhong") && password.equals("9999")) {
                System.out.println("Login Successful");
                break;
            } else {
                i++;
                System.out.println("Login Failed");
                if (i == 3){
                    System.out.println("You have enter wrong password 3 times");
                    System.out.println("Account locked");
                    break;
                }
            }
        }

        int count = 1;

        do {
            if (count % 2 == 0) {
                System.out.println(count + " is Even");
            } else {
                System.out.println(count + " is Odd");
            }

            count++;
        } while (count <= 5);
    }
}

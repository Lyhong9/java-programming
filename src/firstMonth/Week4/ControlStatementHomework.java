package firstMonth.Week4;

import java.util.Scanner;

public class ControlStatementHomework {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        // Exercise IE-1: Positive or Negative
//        System.out.println("System for check the Number are Positive or Negative");
//        System.out.print("Input number: ");
//        int number = input.nextInt();
//
//        if (number > 0){
//            System.out.println(number + " is Positive");
//        } else if (number < 0) {
//            System.out.println(number + " is Negative");
//        }else {
//            System.out.println(number + " is Zero");
//        }
//
//        // Exercise IE-2: Pass or Fail
//        System.out.println("System for check the Score Pass or Fail");
//        System.out.print("Input Ur Score: ");
//        int score = input.nextInt();
//        if (score > 49 && score < 101){
//            System.out.println("Ur score is "+score+" Pass (Het taa ke nor)");
//        }else if (score >= 0) {
//            System.out.println("Ur score is "+score+" Fail (Kak hah Bro Khom rean lerng vinh P'on");
//        }else {
//            System.out.println("Error Score (Bro what the fuck are u hacking!");
//        }
//
//        // Exercise IE-3: Grade Calculator
//        System.out.println("System for check the Grade");
//        System.out.print("Input ur score: ");
//        int gradeScore = input.nextInt();
//        if (gradeScore > 89 && gradeScore < 101){
//            System.out.println("Ur grade is A (Juii Khlang mes)");
//        } else if (gradeScore > 79 && gradeScore < 90) {
//            System.out.println("Ur grade is B");
//        } else if (gradeScore > 69 && gradeScore < 80) {
//            System.out.println("Ur grade is C");
//        } else if (gradeScore > 59 && gradeScore < 70) {
//            System.out.println("Ur grade is D");
//        } else if (gradeScore >= 0 && gradeScore < 60) {
//            System.out.println("Bro u are stupid ur grade is super KaK F (Chhob Rean tov ah kak)");
//        } else {
//            System.out.println("Error Score (Call 911 Please)");
//        }
//
//        // Exercise IE-4: Even or Odd?
//        System.out.println("System for check the Number are Even or Odd");
//        System.out.print("Input number: ");
//        int evenOdd = input.nextInt();
//        if (evenOdd % 2 == 0){
//            System.out.println(evenOdd + " is Even");
//        }else {
//            System.out.println(evenOdd + " is Odd");
//        }
//
//        // Exercise IE-5: Biggest of Three
//        System.out.println("System for check the Biggest of Three");
//        System.out.print("Enter number One: ");
//        int n1 = input.nextInt();
//        System.out.print("Enter number Two: ");
//        int n2 = input.nextInt();
//        System.out.print("Enter number Three: ");
//        int n3 = input.nextInt();
//        if ( n1 == n2 && n2 == n3 ) {
//            System.out.println("The number of three is Equalm = " + n1);
//        } else if (n1 >= n2 && n1 >= n3){
//            System.out.println("The largest number is "+ n1);
//        } else if (n2 >= n1 && n2 >= n3) {
//            System.out.println("The largest number is "+ n2);
//        } else {
//            System.out.println("The largest number is " + n3);
//        }
//
//        // Exercise IE-6: Smart Delivery Fee
//        System.out.print("Input distance(KM): ");
//        int distance = input.nextInt();
//        System.out.print("Order amount($): ");
//        int orderAmount = input.nextInt();
//        int fee = 0;
//        int totalAmount;
//
//        if (distance < 0){
//            System.out.println("Invalid distance");
//        } else if (orderAmount >= 50) {
//            totalAmount = orderAmount;
//        }else if (distance <= 5) {
//            fee = 2;
//        } else if (distance <= 15) {
//            fee = 5;
//        } else {
//            fee = 10;
//        }
//        if (distance > 20 && orderAmount < 20){
//            fee += 3;
//        }
//        totalAmount = fee + orderAmount;
//        System.out.println("Total fee: " + fee);
//        System.out.println("Total amount: $" + totalAmount);
//
//        // Exercise IE-7: Login Security System
//        String username = "Lyhong";
//        String password = "9999";
//
//        System.out.print("Enter your username: ");
//        String usernameinput = input.nextLine();
//        System.out.print("Enter your password: ");
//        String passwordinput = input.nextLine();
//
//        if ( username.equals(usernameinput) && password.equals(passwordinput)){
//            System.out.println("Login successfully");
//        } else if (username.equals(usernameinput)) {
//            int attempt = input.nextInt();
//            if (attempt < 3){
//                System.out.println("Try again!");
//            } else {
//                System.out.println("Account locked");
//            }
//        } else {
//            System.out.println("Invalid credentials");
//        }

        // Exercise IE-8: Salary Tax Calculator
        System.out.print("Input your salary: ");
        float salary = input.nextInt();
        float tax = 0;

        if (salary > 5000){
            tax = 20;
        } else if (salary > 3000 ) {
            tax = 15;
        } else if (salary > 1000) {
            tax = 10;
        } else if (salary < 1000 && salary > 0) {
            tax = 0;
        }else {
            System.out.println("Invalid salary");
        }
        float totalTax = (tax / 100) * salary;
        float netSalary = salary - totalTax;
        System.out.println("Total Tax: $"+ totalTax);
        System.out.println("Net Salary: $"+ netSalary);

        // Exercise IE-9: Order Processing System
        System.out.print("Input Stock Quantity: ");
        int stockQTY = input.nextInt();
        System.out.print("Input Order Quantity: ");
        int orderQTY = input.nextInt();
        System.out.print("IsPaid Status(T/F): ");
        boolean isPaid = input.nextBoolean();

        if (!isPaid){
            System.out.println("Order rejected");
        } else if (orderQTY > stockQTY) {
            System.out.println("Out of stock");
        } else {
            System.out.println("Order confirmed");
        }

        // Exercise IE-10: Ride Booking System
        System.out.print("Driver Status(T/F): ");
        boolean driver = input.nextBoolean();
        System.out.print("Input Distance(KM): ");
        int distanceRide = input.nextInt();

        if (!driver){
            System.out.println("No ride available");
        } else if (distanceRide > 30) {
            System.out.println("Ride too far");
        }else {
            System.out.println("Ride booked");
        }
    }
}

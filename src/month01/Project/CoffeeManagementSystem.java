package month01.Project;

import java.util.Scanner;

public class CoffeeManagementSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        CoffeeManagementSystem cms = new CoffeeManagementSystem();

        cms.coffeeMenu();

        System.out.print("Enter Customer Name: ");
        String customerName = input.nextLine();
        System.out.print("Enter Coffee Name: ");
        String coffeeName = input.nextLine();
        System.out.print("Enter Coffee Quantity: ");
        double quantity = input.nextInt();
        double coffeePrice = 0;

        if (coffeeName.equals("Latte")){
            coffeePrice = 4;
        }else if (coffeeName.equals("Cappuccino")){
            coffeePrice = 5;
        }else if (coffeeName.equals("Espresso")){
            coffeePrice =3;
        }else {
            System.out.println("Invalid Coffee Name");
        }

        double totalPrice = cms.calculateTotalPrice(quantity, coffeePrice);
        System.out.println("Total Price: $" + totalPrice);
        double discountTotalPrice = cms.discountTotalPrice(totalPrice);
        System.out.println("Discount Total Price: $" + discountTotalPrice);
        double totalPayment = totalPrice - discountTotalPrice;
        System.out.println("Total Payment: $" + totalPayment);

        String freeCookie = cms.freeCookie(quantity);
        cms.printReceipt(customerName,coffeeName,quantity,freeCookie,totalPrice,discountTotalPrice,totalPayment);
    }

    private void coffeeMenu() {
        System.out.println("--------------- Coffee Manu ---------------");
        System.out.println("1. Latte                          Price: $4");
        System.out.println("2. Cappuccino                     Price: $5");
        System.out.println("3. Espresso                       Price: $3");
    }

    private double calculateTotalPrice(double quantity, double price) {
        return quantity * price;
    }

    private double discountTotalPrice(double totalPrice) {
        double discountPrice = 0;
        if (totalPrice >= 20){
            discountPrice = totalPrice * 0.1;
        }else {
            System.out.println("No discount");
            return discountPrice;
        }
        return discountPrice;
    }

    private String freeCookie(double quantity){
        if (quantity > 5){
            return "Free 1 cookie";
        }else {
            return "No cookie";
        }
    }

    private void printReceipt(String customerName, String coffeeName, double quantity,String freeCookie, double totalPrice, double totalDiscount, double totalPayment ){
        System.out.println("-------------- Receipt --------------");
        System.out.println("- Customer Name: " + customerName);
        System.out.println("- Coffee Name: " + coffeeName);
        System.out.println("- Quantity: " + quantity);
        System.out.println("- Cookie: " + freeCookie);
        System.out.println("- Total Price: $" + totalPrice);
        System.out.println("- Discount Price: $" + totalDiscount);
        System.out.println("- Total Payment: $" + totalPayment);
    }

}

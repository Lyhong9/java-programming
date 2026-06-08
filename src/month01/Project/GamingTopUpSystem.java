package month01.Project;

import java.util.Scanner;

public class GamingTopUpSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GamingTopUpSystem game = new GamingTopUpSystem();

        System.out.println("------------------------------------------------------");
        System.out.println("--------------------- User Input ---------------------");
        System.out.print("Enter Player Name: ");
        String playerName = input.nextLine();
        System.out.print("Enter Game Name: ");
        String gameName = input.nextLine();
        System.out.print("Enter Top Up Amount: ");
        int topUpAmount = input.nextInt();

        int diamondGame = game.diamondGame(gameName,topUpAmount);
        double discountTotalPrice = game.discountTotalPrice(topUpAmount);
        double paymentTotalPrice = topUpAmount - discountTotalPrice;
        String bonusRewad = game.extraReward(topUpAmount);
        game.printReceipt(playerName,gameName,topUpAmount,bonusRewad,diamondGame,discountTotalPrice,paymentTotalPrice);
    }

    private int diamondGame (String gameName, int topUpAmount) {
      int diamond = 0;
        if (gameName.equals("Mobile Legends")){
             diamond = 50 * topUpAmount;
             if (topUpAmount >= 10){
                 diamond += 100;
             }
        }else if (gameName.equals("PUBG")){
             diamond = 60  * topUpAmount;
            if (topUpAmount >= 15){
                diamond += 200;
            }
        }else if (gameName.equals("Free Fire")){
             diamond = 100 * topUpAmount;
            if (topUpAmount >= 8){
                diamond += 50;
            }
        }else {
            System.out.println("Invalid Game Name");
        }
        return diamond;
    }

    private double discountTotalPrice(double topUpAmount ) {
        double discountPrice = 0;
        if (topUpAmount >= 30){
            discountPrice = topUpAmount * 0.05;
        }else {
            System.out.println("No discount");
        }
        return discountPrice;
    }

    private String extraReward (int topUpAmount){
        if (topUpAmount >= 50){
            return "VIP Gamer Reward Unlocked";
        }else {
            return "No reward";
        }
    }

    private void printReceipt (String playerName, String gameName, int topUpAmount, String extraReward,int diamondGame, double discountTotalPrice, double paymentTotalPrice){
        System.out.println("------------------------------------------------------");
        System.out.println("------------------ Printing Receipt ------------------");
        System.out.println("- Player Name:                             " + playerName);
        System.out.println("- Game Name:..............................." + gameName);
        System.out.println("- Top Up Amount:...........................$" + topUpAmount);
        System.out.println("- Bonus Reward: "+ extraReward);
        System.out.println("- Diamond Game:............................" + diamondGame);
        System.out.println("- Discount Price:..........................$" + discountTotalPrice);
        System.out.println("- Total Payment:...........................$" + paymentTotalPrice);
    }
}

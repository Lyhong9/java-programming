package month01.Week3;

public class GetVariable {
    public static void main(String[] args) {
        double getTotalPrice = GlobleVariables.totalPrice = 10;
        int getTotalNum = GlobleVariables.totalNum = 20;

        GlobleVariables globleVariables = new GlobleVariables();
        int numOne = globleVariables.numOne = 19;

        System.out.println("Total price is: " + getTotalPrice);
        System.out.println("Total number is: " + getTotalNum);

        System.out.println("Number One is: " + numOne);
    }
}

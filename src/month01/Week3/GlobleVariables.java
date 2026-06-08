package month01.Week3;

public class GlobleVariables {
    static int totalNum;
    static double totalPrice;
    int numOne;
    int numTwo;
    int numThree;
    int numFour;

    public static void main(String[] args) {
        String str = "Hello Lyhong";

        GlobleVariables globleVariables = new GlobleVariables();

        int numOne = globleVariables.numOne = 82;

        totalPrice = 199;
        totalNum = 10;

        System.out.println(numOne);
        System.out.println(totalPrice);
        System.out.println(totalNum);

        globleVariables.testMethod();
    }

    private int testMethod(){
        totalNum = totalNum + 1;
        System.out.println("Total number is " + totalNum);
        totalPrice = totalPrice + totalNum;
        System.out.println("Total price is " + totalPrice);
        return totalNum;
    }
}

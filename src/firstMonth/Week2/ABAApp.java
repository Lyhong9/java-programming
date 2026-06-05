package firstMonth.Week2;

public class ABAApp {
    public static void main(String[] args) {
        ABAApp abaapp = new ABAApp();
        float checkAccountBalance = abaapp.checkAccountBalance("Lyhong",9999);
        System.out.println("Checking Account Balance: " + checkAccountBalance);
        String checkCardNumber = abaapp.checkCardNumber(01);
        System.out.println("Checking Card Number: " + checkCardNumber);
    }

    private float checkAccountBalance(String accountName, int accountId) {
        return 10.0f;
    }

    private String checkCardNumber(int accountId) {
        return "1111 2222 3333 4444";
    }
}

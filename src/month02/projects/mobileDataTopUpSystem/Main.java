package month02.projects.mobileDataTopUpSystem;

public class Main {
    public static void main(String[] args) {
        MobilePackage mobilePackageOne = new MobilePackage();
//        MobilePackage mobilePackageTwo = new MobilePackage();

        mobilePackageOne.setCustomerName("");
        mobilePackageOne.setPhoneNumber("0968986669");
        mobilePackageOne.setPackageName("Smart 20GB");
        mobilePackageOne.setPackagePrice(9.9);
        mobilePackageOne.setActive(true);

        System.out.println();
        mobilePackageOne.display();
    }
}

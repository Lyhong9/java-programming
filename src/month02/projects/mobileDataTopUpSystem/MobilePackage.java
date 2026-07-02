package month02.projects.mobileDataTopUpSystem;

public class MobilePackage {
    private String customerName;
    private String phoneNumber;
    private String packageName;
    private String packagePrice;
    private boolean active;

    public MobilePackage(String customerName, String phoneNumber, String packageName, String packagePrice, boolean active) {
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.packageName = packageName;
        this.packagePrice = packagePrice;
        this.active = active;
    }

    public MobilePackage() {}

//    public MobilePackage() {
//        this.customerName = "Unknown";
//        this.phoneNumber = "Unknown";
//        this.packageName = "Unknown";
//        this.active = false;
//    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        if (customerName == null || customerName.trim().isEmpty()) {
            this.customerName = "Customer name cannot be empty or null";
        } else {
            this.customerName = customerName;
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.trim().isEmpty() || phoneNumber.length() != 10) {
            this.phoneNumber = "cannot be empty and must contain exactly 10 digits";
        } else {
            this.phoneNumber = phoneNumber;
        }
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        if (packageName == null || packageName.trim().isEmpty()) {
            this.packageName = "Package name cannot be empty or null";
        } else {
            this.packageName = packageName;
        }
    }

    public String getPackagePrice() {
        return packagePrice;
    }

    public void setPackagePrice(double packagePrice) {
        if (packagePrice <= 0) {
            this.packagePrice = "Package price must be greater than 0";
        } else {
            this.packagePrice = String.valueOf(packagePrice);
        }
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void display() {
        System.out.println("===== PACKAGE INFORMATION =====");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Phone Number : " + phoneNumber);
        System.out.println("Package Name : " + packageName);
        System.out.println("Package Price : " + packagePrice);
        System.out.println("Active : " + active);
    }
}

package firstMonth.Project;

import java.util.Scanner;

public class SmartCinemaBookingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        SmartCinemaBookingSystem scm = new SmartCinemaBookingSystem();
        System.out.print("Enter Customer Name: ");
        String customerName = input.nextLine();

        scm.movieType();
        System.out.print("Movie Type: ");
        int movieType = input.nextInt();
        String selectMovieType = scm.selectMovieType(movieType);

        scm.bookingDayList();
        System.out.print("Booking Day: ");
        int bookingDay = input.nextInt();
        String selectBookingDay = scm.selectBookingDay(bookingDay);

        scm.movieTicketPriceList();
        System.out.print("Select Ticket Price: ");
        int ticketPrice = input.nextInt();
        String movieTicketPrice = scm.movieTicketPrice(ticketPrice);

        System.out.print("Ticket Quantity: ");
        int ticketQuantity = input.nextInt();
        String quantity = scm.quantity(ticketQuantity);

        int extraCharge = scm.extraCharge(ticketPrice,ticketQuantity);
        int totalPrice = scm.totalPrice(ticketPrice,ticketQuantity,extraCharge);
        int dayDiscountPrice = scm.dayDiscountPrice(bookingDay,ticketPrice);
        int totalDayDiscountPrice =  scm.totalDayDiscountPrice(dayDiscountPrice,ticketQuantity);
        String freePoPcorn = scm.freePoPcorn(ticketQuantity);
        int totalPayment = scm.totalPayment(totalPrice,totalDayDiscountPrice);
        String specialExtra = scm.specialExtra(totalPayment);

        if (movieType > 0 && movieType <= 6){
            scm.printReceipt(customerName,
                    selectMovieType,
                    selectBookingDay,
                    movieTicketPrice,
                    quantity,
                    extraCharge,
                    totalPrice,
                    dayDiscountPrice,
                    totalDayDiscountPrice,
                    freePoPcorn,
                    specialExtra,
                    totalPayment
            );
        }else {
            System.out.println("Invalid Movie Type");
        }
    }

    private void printReceipt(String customerName,
                              String movieType,
                              String bookingDay,
                              String ticketPrice,
                              String ticketQuantity,
                              int extraCharge,
                              int totalPrice,
                              int dayDiscountPrice,
                              int totalDayDiscountPrice,
                              String freePoPcorn,
                              String specialExtra,
                              int totalPayment){
        System.out.println("----------------------------------------------------------------");
        System.out.println("---------------------- Printing Receipt ------------------------");
        System.out.println("- Customer Name: " + customerName);
        System.out.println("- Movie Type: " + movieType);
        System.out.println("- Booking Day: " + bookingDay);
        System.out.println("- Ticket Price: " + ticketPrice);
        System.out.println("- Ticket Quantity: " + ticketQuantity);
        System.out.println("- Extra Charge: $" + extraCharge);
        System.out.println("- Total Price: $" + totalPrice);
        System.out.println("- Day Discount Price: $" + dayDiscountPrice + " Per ticket");
        System.out.println("- Total Day Discount Price: $" + totalDayDiscountPrice);
        System.out.println("- PoPcorn: " + freePoPcorn);
        System.out.println("- Special Extra: " + specialExtra);
        System.out.println("- Total Payment Price: $" + totalPayment);
    }

    private String specialExtra(int totalPayment){
        if (totalPayment >= 50){
            return "Free Coca-Cola";
        }else {
            return "Coca-Cola muy haa tix Sday Kroy";
        }
    }

    private int totalPayment(int totalPrice, int totalDayDiscountPrice) {
        int totalPayment = totalPrice - totalDayDiscountPrice;
        return totalPayment;
    }

    private int extraCharge(int ticketPrice, int quantity){
        int totalExtraCharge = 0;
        if (ticketPrice == 3){
            totalExtraCharge = quantity * 3;
        }
        return totalExtraCharge;
    }

    private void movieTicketPriceList() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("---------------------- Movie Ticket Price ----------------------");
        System.out.println("1. Regular Ticket Price:--------------------------------------$5");
        System.out.println("2. VIP Ticket Price:-----------------------------------------$10");
        System.out.println("3. 4DX Ticket Price:-----------------------------------------$15");
    }

    private String movieTicketPrice(int number) {
        if (number == 1) {
            return "Regular $5 per ticket";
        }
        else if (number == 2) {
            return "VIP $10 per ticket";
        }
        else if (number == 3) {
            return "4DX $15 per ticket";
        }
        else {
            return "Invalid Ticket Price";
        }
    }

    private void movieType(){
        System.out.println("----------------------------------------------------------------");
        System.out.println("------------------------- Movie Genres -------------------------");
        System.out.println("1. Action");
        System.out.println("2. Comedy");
        System.out.println("3. Horror");
        System.out.println("4. Sci-Fi");
        System.out.println("5. Romance");
        System.out.println("6. Animation");
    }

    private String selectMovieType(int number) {
        if (number == 1) {
            return "Action Movie";
        }
        else if (number == 2) {
            return "Comedy Movie";
        }
        else if (number == 3) {
            return "Horror Movie";
        }
        else if (number == 4) {
            return "Sci-Fi Movie";
        }
        else if (number == 5) {
            return "Romance Movie";
        }
        else if (number == 6) {
            return "Animation Movie";
        }
        else  {
            return "Invalid Movie Type";
        }
    }

    private void bookingDayList(){
        System.out.println("----------------------------------------------------------------");
        System.out.println("---------------------- Booking Day List ------------------------");
        System.out.println("1. Monday");
        System.out.println("2. Tuesday");
        System.out.println("3. Wednesday");
        System.out.println("4. Thursday");
        System.out.println("5. Friday");
        System.out.println("6. Saturday");
        System.out.println("7. Sunday");
    }

    private String selectBookingDay(int number){
        if (number == 1) {
            return "Monday";
        }
        else if (number == 2) {
            return "Tuesday";
        }
        else if (number == 3) {
            return "Wednesday";
        }
        else if (number == 4) {
            return "Thursday";
        }
        else if (number == 5) {
            return "Friday";
        }
        else if (number == 6) {
            return "Saturday";
        }
        else if (number == 7) {
            return "Sunday";
        }
        else {
            return "Invalid Day";
        }
    }

    private String quantity(int number){
        if (number < 1) {
            return "Invalid Quantity";
        }
        else {
            return number + "";
        }
    }

    private int dayDiscountPrice(int bookingDay, int ticketPrice){
        if (bookingDay == 1 || bookingDay == 2) {
            if (ticketPrice == 1){
                ticketPrice = 1;
            }
            else if (ticketPrice == 2){
                ticketPrice = 2;
            }
            else if (ticketPrice == 3){
                ticketPrice = 3;
            }
        }else {
            ticketPrice = 0;
        }
        return ticketPrice;
    }

    private int totalDayDiscountPrice(int dayDiscountPrice, int ticketQuantity){
        int totalDayDiscountPrice = 0;
        totalDayDiscountPrice = dayDiscountPrice *  ticketQuantity;
        return totalDayDiscountPrice;
    }

    private int totalPrice(int ticketPrice, int quantity, int extraCharge) {
        int totalPrice = 0;
        if (ticketPrice == 1){
            totalPrice = quantity * 5 + extraCharge;
        }else if (ticketPrice == 2){
            totalPrice = quantity * 10 + extraCharge;
        }else if (ticketPrice == 3) {
            totalPrice = quantity * 15  + extraCharge;
        }
        return totalPrice;
    }

    private String freePoPcorn (int quantity){
        if (quantity >= 5){
            return "Free PoPcorn";
        }
        else {
            return "Not Free PoPcorn";
        }
    }
}

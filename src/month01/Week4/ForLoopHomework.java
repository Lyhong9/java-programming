package month01.Week4;

public class ForLoopHomework {
    public static void main(String[] args) {

        System.out.println("==================== PATTERN 1: Right-Angled Triangle ====================");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("==================== PATTERN 2: Inverted Right-Angled Triangle ====================");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("==================== PATTERN 3: Pyramid (Centered Triangle) ====================");

        for (int i = 5; i >= 1; i--) {
            for (int k = 5; k >= i; k--) {
                for (int j = 4; j <= k; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

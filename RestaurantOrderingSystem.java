import java.util.Scanner;

public class RestaurantOrderingSystem {

    // Item quantities
    public static int burgerQty = 0;
    public static int pizzaQty = 0;
    public static int friedChickenQty = 0;
    public static int softDrinkQty = 0;

    // Prices
    public static final double BURGER_PRICE = 5.0;
    public static final double PIZZA_PRICE = 8.0;
    public static final double FRIED_CHICKEN_PRICE = 6.0;
    public static final double SOFT_DRINK_PRICE = 2.0;

    // Display menu
    public static void displayMenu() {
        System.out.println("\n====== FOOD MENU ======");
        System.out.println("1. Burger - $5");
        System.out.println("2. Pizza - $8");
        System.out.println("3. Fried Chicken - $6");
        System.out.println("4. Soft Drink - $2");
        System.out.println("5. Finish Ordering");
    }

    // Select items
    public static double selectItem(Scanner input) {

        double subtotal = 0;
        int choice;

        do {
            System.out.print("\nChoose an Item (1-5): ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter quantity: ");
                    burgerQty = input.nextInt();
                    subtotal += calculateItemTotal(BURGER_PRICE, burgerQty);
                    break;

                case 2:
                    System.out.print("Enter quantity: ");
                    pizzaQty = input.nextInt();
                    subtotal += calculateItemTotal(PIZZA_PRICE, pizzaQty);
                    break;

                case 3:
                    System.out.print("Enter quantity: ");
                    friedChickenQty = input.nextInt();
                    subtotal += calculateItemTotal(FRIED_CHICKEN_PRICE, friedChickenQty);
                    break;

                case 4:
                    System.out.print("Enter quantity: ");
                    softDrinkQty = input.nextInt();
                    subtotal += calculateItemTotal(SOFT_DRINK_PRICE, softDrinkQty);
                    break;

                case 5:
                    System.out.println("Ordering Finished.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        return subtotal;
    }

    // Calculate total of one item
    public static double calculateItemTotal(double price, int quantity) {
        return price * quantity;
    }

    // Calculate VAT
    public static double calculateVAT(double subtotal) {
        return subtotal * 0.10;
    }

    // Print receipt
    public static void printReceipt(double subtotal) {

        double vat = calculateVAT(subtotal);
        double grandTotal = subtotal + vat;

        System.out.println("\n========== RECEIPT ==========");

        System.out.printf("Burger         x%-3d $%.2f%n",
                burgerQty,
                calculateItemTotal(BURGER_PRICE, burgerQty));

        System.out.printf("Pizza          x%-3d $%.2f%n",
                pizzaQty,
                calculateItemTotal(PIZZA_PRICE, pizzaQty));

        System.out.printf("Fried Chicken  x%-3d $%.2f%n",
                friedChickenQty,
                calculateItemTotal(FRIED_CHICKEN_PRICE, friedChickenQty));

        System.out.printf("Soft Drink     x%-3d $%.2f%n",
                softDrinkQty,
                calculateItemTotal(SOFT_DRINK_PRICE, softDrinkQty));

        System.out.println("--------------------------------");

        System.out.printf("Subtotal:      $%.2f%n", subtotal);
        System.out.printf("VAT (10%%):     $%.2f%n", vat);
        System.out.printf("Grand Total:   $%.2f%n", grandTotal);

        System.out.println("================================");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double subtotal = 0;
        char choice;

        do {

            System.out.println("\n========== MENU ==========");
            System.out.println("a. Display Food Menu / Order");
            System.out.println("b. Calculate Total");
            System.out.println("c. Calculate VAT");
            System.out.println("d. Print Receipt");
            System.out.println("e. Exit");
            System.out.print("Choose your choice: ");

            choice = input.next().charAt(0);

            switch (choice) {

                case 'a':
                case 'A':
                    displayMenu();
                    subtotal = selectItem(input);

                    System.out.println("\n=== Your Order ===");
                    System.out.println("Burger x" + burgerQty);
                    System.out.println("Pizza x" + pizzaQty);
                    System.out.println("Fried Chicken x" + friedChickenQty);
                    System.out.println("Soft Drink x" + softDrinkQty);
                    break;

                case 'b':
                case 'B':
                    System.out.printf("Total Price: $%.2f%n", subtotal);
                    break;

                case 'c':
                case 'C':
                    System.out.printf("VAT (10%%): $%.2f%n", calculateVAT(subtotal));
                    break;

                case 'd':
                case 'D':
                    printReceipt(subtotal);
                    break;

                case 'e':
                case 'E':
                    System.out.println("Good Bye. See You Later.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 'e' && choice != 'E');

        input.close();
    }
}
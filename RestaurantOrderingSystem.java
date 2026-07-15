import java.util.Scanner;
public class RestaurantOrderingSystem {
public static int Burger;
public static int Pizza;
public static int friedChicken;
public static int softDrink;

//Menu
public static void displayMenu(){
    System.out.println("1. Burger - $5");
    System.out.println("2. Pizza - $8");
    System.out.println("3. Fried Chicken - $6");
    System.out.println("4. Soft Drink - $2");
    System.out.println("5. To Exit");
}

//User order
public static double SelectItem(Scanner input) {
    int subtotal = 0;
    int quantity;
    int choice;
    do {
    System.out.print("Choose an Item (1-5) : ");
    choice = input.nextInt();
    switch (choice){
        case 1: 
                System.out.print("Enter quantity: ");
                quantity = input.nextInt();
                Burger = quantity;
                subtotal += calculateItemTotal( 5 , quantity);
                break;
        case 2: 
                System.out.print("Enter quantity: ");
                quantity = input.nextInt();
                Pizza = quantity;
                subtotal += calculateItemTotal( 8 , quantity);
                break;
        case 3: 
                System.out.print("Enter quantity: ");
                quantity = input.nextInt();
                friedChicken = quantity;
                subtotal += calculateItemTotal(6 , quantity);
                break;
        case 4:
                System.out.print("Enter quantity: ");
                quantity = input.nextInt();
                softDrink = quantity;
                subtotal += calculateItemTotal( 2 , quantity);
                break;
        case 5:
                System.out.println("Ordering Finished.");
                break;

            default:
                System.out.println("Invalid choice. Please try again.");
        }
    } while(choice != 5);

    return subtotal;
}

//Calculate totals 
public static double calculateItemTotal(double price , double quantity) {
    return price * quantity;
}

// calculate Value Added Tax 10%
public static double calculateVAT(double subtotal) {
    return subtotal * 0.10;
}

//calulate price each items
public static double calculateItemPrice(int item, double priceItem) {
    return item * priceItem;
}

//Print Receipt
public static void printReceipt(double subtotal, double vat, double finalTotal) {
    double subtotalLast = subtotal;
    vat = calculateVAT(subtotalLast);
    finalTotal = subtotalLast + vat;
    double price1 = calculateItemPrice(Burger,5);
    double price2 = calculateItemPrice(Pizza,8);
    double price3 = calculateItemPrice(friedChicken,6);
    double price4 = calculateItemPrice(softDrink,2);

    System.out.println("\n========== RECEIPT ==========");
    System.out.printf("Burger        x%d $%.2f%n", Burger, price1);
    System.out.printf("Pizza         x%d $%.2f%n", Pizza, price2);
    System.out.printf("Fried Chicken x%d $%.2f%n", friedChicken, price3);
    System.out.printf("Soft Drink    x%d $%.2f%n", softDrink, price4);
    System.out.println("");
    System.out.println("==============================");
    System.out.println("");
    System.out.printf("Subtotal:         $%.2f\n", subtotalLast);
    System.out.printf("VAT (10%%):        $%.2f\n", vat);
    System.out.printf("Grand Total:      $%.2f\n", finalTotal);
    System.out.println("");
    System.out.println("==============================");
}

public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    double subtotal = 0;
    double vat = 0;
    double finalTotal = 0;
    char choice;  

do {

    //user input
    System.out.println("");
    System.out.println("========== MENU ==========");
    System.out.println("");
    System.out.println("a. Display Food Menu.");
    System.out.println("b. Calculat Total.");
    System.out.println("c. Calculate VAT.");
    System.out.println("d. Display Food Menu.");
    System.out.println("e. Exit Ordering.");
    System.out.print("Choose your choice: ");
    choice = input.next().charAt(0); 
    System.out.println("");
    switch (choice) {
        case 'a':
            displayMenu();
            subtotal = SelectItem(input);
            System.out.println("=== Your Order ===");
            System.out.println("Burger x" + Burger);
            System.out.println("Pizza x" + Pizza);
            System.out.println("Fried Chicken x" + friedChicken);
            System.out.println("Soft Drink x" + softDrink);

            break;
        case 'b':
            // subtotal = SelectItem(input);
            System.out.println("Total price : $" + subtotal);
            break;
        case 'c':
            System.out.println("Calculate VAT $: " + calculateVAT(subtotal));
            break;
        case 'd':

            printReceipt( subtotal, vat, finalTotal);
            break;
        case 'e':
            System.out.println("Good Bye See You Later.");
            break;
        } 
    } while (choice != 'e');
    input.close();
}
}
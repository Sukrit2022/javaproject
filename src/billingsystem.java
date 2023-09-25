import java.util.Scanner;
public class billingsystem {
    public static void main(String[] args) {
        System.out.println("WELCOME! PLEASE PLACE YOUR ORDER");
        int coke = 60, dumplings = 150, margheritaPizza = 300, cheeseBurger = 250, friedChicken = 150, vegetableRice = 200;
        int selectedItem, totalItems = 0;
        int orderPrice = 0;
        int quantity = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("How many items do you want to order: ");
        int numItemsToOrder = sc.nextInt();

        int discount = 0;
        int tax = 0;

        for (int i = 1; i <= numItemsToOrder; i++) {
            System.out.println("Here's the menu:");
            System.out.println("1. Coke");
            System.out.println("2. Dumplings");
            System.out.println("3. Margherita Pizza");
            System.out.println("4. Cheeseburger");
            System.out.println("5. Vegetable Rice");
            System.out.println("6. Fried Chicken");
            System.out.print("Please enter the item number: ");
            selectedItem = sc.nextInt();

            switch (selectedItem) {
                case 1:
                    System.out.println("Thanks for placing the order");
                    orderPrice = coke;
                    break;
                case 2:
                    System.out.println("Thanks for placing the order");
                    orderPrice = dumplings;
                    break;
                case 3:
                    System.out.println("Thanks for placing the order");
                    orderPrice = margheritaPizza;
                    break;
                case 4:
                    System.out.println("Thanks for placing the order");
                    orderPrice = cheeseBurger;
                    break;
                case 5:
                    System.out.println("Thanks for placing the order");
                    orderPrice = vegetableRice;
                    break;
                case 6:
                    System.out.println("Thanks for placing the order");
                    orderPrice = friedChicken;
                    break;
                default:
                    System.out.println("Item not found");
                    break;
            }

            System.out.print("Enter the quantity: ");
            quantity = sc.nextInt();

            totalItems += (orderPrice * quantity);
        }

        discount = (10 * totalItems) / 100;
        tax = (13 * totalItems) / 100;

        int finalTotal = totalItems - discount + tax;

        System.out.println("Total cost: " + totalItems);
        System.out.println("Discount: " + discount);
        System.out.println("Tax: " + tax);
        System.out.println("Final Total: " + finalTotal);

        sc.close();
    }
}

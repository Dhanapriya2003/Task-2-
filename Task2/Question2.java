package Task2;

import java.util.Scanner;

public class Question2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Product[] products = new Product[5]; // Array to store 5 products

            // Step 1: Input details for 5 products
            for (int i = 0; i < 5; i++) {
                System.out.println("\nEnter details for product " + (i + 1) + ":");
                System.out.print("Enter Product ID: ");
                String pid = scanner.nextLine(); // Read product ID
                System.out.print("Enter Product Price: ");
                double price = scanner.nextDouble(); // Read product price
                System.out.print("Enter Product Quantity: ");
                int quantity = scanner.nextInt(); // Read product quantity
                scanner.nextLine(); // Consume the newline character

                // Create a Product object and store it in the array
                products[i] = new Product(pid, price, quantity);
            }

            // Step 2: Find the Product ID with the highest price
            double maxPrice = products[0].price; // Assume first product has the highest price
            String maxPricePid = products[0].pid; // Store the ID of the first product

            for (int i = 1; i < 5; i++) { // Check the rest of the products
                if (products[i].price > maxPrice) {
                    maxPrice = products[i].price; // Update max price
                    maxPricePid = products[i].pid; // Update product ID with highest price
                }
            }
            System.out.println("\nProduct with the highest price:");
            System.out.println("Product ID: " + maxPricePid + ", Price: " + maxPrice);

            // Step 3: Calculate the total amount spent on all products
            double totalAmount = 0;
            for (int i = 0; i < 5; i++) {
                totalAmount += products[i].price * products[i].quantity; // Add (price * quantity)
            }
            System.out.println("\nTotal amount spent on all products: " + totalAmount);

        }
    }


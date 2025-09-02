package date27_08_2025;

import java.util.Scanner;

public class FitnessCenterMembership {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean keepRunning = true;

        do {
            System.out.println(" Welcome to Fitness Center Membership System");

            System.out.print("Enter number of members to register: ");
            int n = sc.nextInt();


            for (int i = 1; i <= n; i++) {
                System.out.println("\n--- Registering Member " + i + " ---");

                System.out.println("Select Membership Type:");
                System.out.println("1. Monthly (₹1000)");
                System.out.println("2. Quarterly (₹2500)");
                System.out.println("3. Yearly (₹9000)");
                int type = sc.nextInt();

                int fee = 0;


                switch (type) {
                    case 1:
                        fee = 1000;
                        break;
                    case 2:
                        fee = 2500;
                        break;
                    case 3:
                        fee = 9000;
                        break;
                    default:
                        System.out.println("Invalid choice. Defaulting to Monthly.");
                        fee = 1000;
                }

                System.out.print("Are you a Student or Senior Citizen? (yes/no): ");
                String eligible = sc.next();

                if (eligible.equalsIgnoreCase("yes")) {
                    System.out.println("Discount of 20% applied!");
                    fee = (int)(fee * 0.8);
                } else {
                    System.out.println("No discount applied.");
                }

                System.out.println("Final Fee for Member " + i + ": ₹" + fee);
            }


            System.out.print("\nDo you want to register more members? (yes/no): ");
            String choice = sc.next();
            if (choice.equalsIgnoreCase("no")) {
                keepRunning = false;
                System.out.println("Registration closed by admin.");
            }

        } while (keepRunning);

        sc.close();
    }
}


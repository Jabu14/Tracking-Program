package _client;

import java.util.Random;
import java.util.Scanner;

public class UserManager {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    //    Declare the variables
    String name;
    String lastname;

    int userInput;
    int packageAmount;

    int addPackage;
    int removePackage;

    int total;

    boolean isRunning = true;
    boolean isValid = true;

    public void userMainMenu() {
        while(isRunning) {
            System.out.print(
                    """
                            1) Show Amount of Packages
                            2) Show all packages
                            3) Add a package
                            4) Cancel a package
                            5) Press q to EXIT
                            """
            );
            System.out.print("Enter a number to choose: ");
            userInput = scanner.nextInt();


            //  User Input
            switch (userInput) {
                case 1 -> showPackage();
                case 2 -> listPackages();
                case 3 -> addPackage();
                case 4 -> cancelPackage();
                case 5 -> exit();
                default -> System.out.println("Invalid #! Please enter a valid #");
            }
        }
        scanner.close();
    }

    public void createAccount() {
        System.out.print("Please enter you first name: ");
        name = scanner.nextLine();

        System.out.print("Please enter you last name: ");
        lastname = scanner.nextLine();


        accountValidation();
        scanner.close();
    }

    public void accountValidation() {
        if(isValid) {
            userMainMenu();
        } else {
            System.out.println("Please try again!");
        }
    }

    //    Method that show the showPackage()
    public int showPackage() {
        packageAmount = total;

        System.out.println("---------------------------");
        System.out.printf("You currently have %d package(s)\n", packageAmount);
        System.out.println("---------------------------");

        return packageAmount;
    }

    //    add a package()
    public int addPackage() {
        System.out.print("How many package do you want to add?: ");
        addPackage = scanner.nextInt();

        for(int i =0; i < addPackage; i++) {
            total = addPackage ;
        }

        System.out.println("-------------------------------------");
        System.out.printf("You have added %d package(s)\n", total);
        System.out.println("-------------------------------------");

        return total;
    }

    //    listPackages()
    public int listPackages() {

        if(total > 0) {
            for(int i = 0; i < packageAmount; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("--------------------");
            System.out.println("No package(s) found!");
            System.out.println("--------------------");
        }

        return packageAmount;
    }

    //    cancelPackage()
    public int cancelPackage() {
        System.out.print("How many package(s) do you want to remove?: ");
        removePackage = scanner.nextInt();

        if(removePackage < total) {
            total-=removePackage;
            System.out.println("------------------------------------------------");
            System.out.printf("You have removed %d packages.\n", removePackage);
            System.out.printf("You now have %d package(s)\n", total);
            System.out.println("------------------------------------------------");
        }
        else {
            System.out.println("------------------------------------------------");
            System.out.println("You can't remove this amount, you don't have enough ");
            System.out.println("------------------------------------------------");
        }

        return total;
    }

    //    random package ID generator
    public String idGenerator() {
        StringBuilder id = new StringBuilder();
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        int maxNumLength = 15;

        for (int i = 0; i < maxNumLength; i++) {
            id.append(chars.charAt(random.nextInt(chars.length())));
        }

        return id.toString();
    }

    //    exit()
    public void exit() {
        int exitNumber;

        isRunning = false;
    }

}

import _client.UserManager;
import _worker.WorkerManager;

import java.util.Scanner;

public class TrackingProgram {
    Scanner scanner = new Scanner(System.in);

    WorkerManager workerManager = new WorkerManager();
    UserManager userManager = new UserManager();

    boolean isRunning = true;
    int userType;

    //    Method that shows the Main Menu
    public void mainMenu() {

        while (isRunning) {
            System.out.println("=== Welcome to Tracking Package Program ===");
            System.out.println("===========================================");
            System.out.println("Are you a WORKER or a CUSTOMER?: ");
            System.out.println("""
                    1) WORKER
                    2) CUSTOMER
                    """);

            userType = scanner.nextInt();
            if (userType == 1) {
                workerManager.createAccount();
                break;
            } else if(userType == 2) {
                userManager.createAccount();
                break;
            }else {
                System.out.println("Please enter a valid input!");
            }
//

            scanner.close();
        }
    }
}
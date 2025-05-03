package Console_Implementation;

import GUI_Implementation.FrontPage;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        SkinConsultationManager manager = new WestminsterSkinConsultationManager();

        Scanner scanner = new Scanner(System.in);

        label:
        while (true) {
            System.out.println("==== Westminster Skin Consultation Manager ====");
            System.out.println("\t1: Add a new doctor");
            System.out.println("\t2: Delete a doctor");
            System.out.println("\t3: Print list of doctors");
            System.out.println("\t4: Save information to file");
            System.out.println("\t5: Start a graphical user interface (GUI)");
            System.out.println("\t6: Quit the programme");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    manager.addDoctor();
                    break;
                case 2:
                    manager.deleteDoctor();
                    break;
                case 3:
                    manager.printDoctors();
                    break;
                case 4:
                    manager.saveFile();
                    break;
                case 5:
                    new FrontPage();
                    break;
                case 6:
                    break label;
                default:
                    System.out.println("Invalid action. Please try again.\n");
                    break;
            }
        }
    }
}

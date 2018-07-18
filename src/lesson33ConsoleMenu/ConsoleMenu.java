package lesson33ConsoleMenu;

import java.util.Scanner;

public class ConsoleMenu {
    private static UserHub userhub = new UserHub();


    public static void main(String[] args) {
        do {
            userhub.loadData();
            showMenu();
            int number = userChoise();
            callMenu(number);
        } while (true);
    }

    private static int userChoise() {
        Scanner input = new Scanner(System.in);
        int menuNumber;
        System.out.print("\nEnter menu number: ");
        menuNumber = input.nextInt();
        return menuNumber;
    }


    private static void showMenu() {
        System.out.println("\n1 - Create user");
        System.out.println("2 - Show all users");
        System.out.println("3 - Find user");
        System.out.println("4 - Delete user");
        System.out.println("0 - Exit");
    }

    private static void callMenu(int number) {

        switch (number) {
            case 1:
                System.out.println("\n Creating user");
                userhub.createUser();
                userhub.saveData();
                break;
            case 2:
                System.out.println("\n Show users");
                userhub.showUsers();
                break;
            case 3:
                System.out.println("\n Find users");break;
            case 4:
                System.out.println("Deleting user");
                userhub.deleteUser();
                userhub.saveData();
                break;
            case 0:
                System.exit(0);
        }
    }
}

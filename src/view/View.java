package library;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class View {

    private Map<Integer, String> menu = new HashMap<>();

    private void prepareMenu() {
    
        menu.put(1, "Add new book.");
        menu.put(2, "Edit book.");
        menu.put(3, "Delete book.");
        menu.put(4, "Search for a book.");
        menu.put(5, "See all books.");
        menu.put(6, "See all books of given author.");
        menu.put(0, "Exit.");
    
    }
    
    private void displayMenu() {
        for (Integer option : menu.keySet()) {
            System.out.println(option + ". " + menu.get(option));
        }
    }
    
    public void handleMenu() {
        prepareMenu();
        displayMenu();
    }
    
    String getStringInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    
    public void displayPressAnyKeyToContinueMessage() {
        System.out.print("\nPress any key to continue.");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
    
    public int askForOption() {
        int option = 0;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("\nEnter option: ");
            option = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You type wrong sign!");
        }
        return option;
    }
    
    public void displayWrongSignError() {
        System.out.println("There is no such option!");
        displayPressAnyKeyToContinueMessage();
    }

}

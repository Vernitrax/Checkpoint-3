package library;

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

}

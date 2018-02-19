package library;

import dao.DAO;
import view.View;

public class Controller {

    private DAO dao;
    private View view;

    public Controller() {
    
        this.dao = new DAO();
        this.view = new View();
    
    }
    
    public void start() {
        boolean isAppRunning = true;
        view.handleMenu();
        while (isAppRunning) {
            view.displayMenu();
            String userInput = view.getStringInput();
            switch (userInput) {
                case "1":
                    addNew();
                    break;
                case "2":
                    Edit();
                    break;
                case "3":
                    Delete();
                    break;
                case "4":
                    Search();
                    break;
                case "5":
                    SeeAll();
                    break;
                case "6":
                    SeeByAuthor();
                    break;
                case "0":
                    isAppRunning = false;
                    break;
                default:
                    view.displayWrongInputMessage();
            }
        }
    }
    
    private void addNew() {}
    private void Edit() {}
    private void Delete() {}
    private void Search() {}
    private void SeeAll() {}
    private void SeeByAuthor() {}

}

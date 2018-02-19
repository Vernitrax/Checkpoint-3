package library;

//import dao.DAO;
//import view.View;

public class Controller {

    private DAO dao;
    private View view;

    public Controller() {
    
        this.dao = new DAO();
        this.view = new View();
    
    }
    
    public void start() {
        boolean isAppRunning = true;
        while (isAppRunning) {
            view.handleMenu();
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
    
    private void addNew() {
    
        //AskForISBN();
        //AskForAuthor();
        //AskForTitle();
        //AskForPublisher();
        //AskForPublicationYear();
        //AskForPrice();
        //AskForType();
        //AddNewBook();
    
    }
    
    private void Edit() {
    
        //AskForISBN();
        //AskWhatToEdit();
        //Edit();
    
    }
    
    private void Delete() {
    
        //AskForISBN();
        //Delete();
    
    }
    
    private void Search() {
    
        //AskForISBN();
        //Search();
    
    }
    
    private void SeeAll() {
    
        //DisplayALl();
    
    }
    
    private void SeeByAuthor() {
    
        //AskFOrAuthor();
        //DisplayByAuthor();
    
    }

}

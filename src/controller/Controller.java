package library;

import dao.DAO;
import view.View;

public class Controller {

    private DAO dao;
    private View view;

    public Controller{
    
        this.dao = new DAO();
        this.view = new View();
    
    }
    
    public void start() {
        boolean isAppRunning = true;
    }

}

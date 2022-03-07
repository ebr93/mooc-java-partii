package mooc.logic;

import mooc.ui.UserInterface;

public class ApplicationLogic {
    private UserInterface userI;

    public ApplicationLogic(UserInterface ui) {
        this.userI = ui;
    }

    public void execute(int times) {
        
        int i = 0;
        while (i < times) {
            System.out.println("Application logic is working");
            userI.update();
            i++;
        }
    }
}

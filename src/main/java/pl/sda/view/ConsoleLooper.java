package pl.sda.view;

public class ConsoleLooper {
    private final ConsoleView view;

    public ConsoleLooper(ConsoleView view) {
        this.view = view;
    }

    public void runLoop(){
        while(true){
            if (!view.printAndSelectMenuOption()){
                view.printMessage("NO OPTIONS LIKE THIS!");
            }
        }
    }
}

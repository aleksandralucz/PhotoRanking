package pl.sda.view.core;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<MenuItem> menuItems = new ArrayList<>();
    public static Runnable DEFAULT_QUIT = () -> System.exit(0);//zamyka JVM

    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }
    public void print() {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println((i + 1) + ". " + menuItems.get(i).label);
        }
    }

    private void runMenuItemAction(int option) {
        menuItems.get(option - 1).action.run();//wykonuje pozycje nr 1 z menu
    }

    private boolean isItemAt(int position) {
        int index = position - 1;
        return index >= 0 && index < menuItems.size();
    }


    public boolean process(int option) {
        if (isItemAt(option)) {
            runMenuItemAction(option);
            return true;
        } else {
            return false;
        }
    }
}

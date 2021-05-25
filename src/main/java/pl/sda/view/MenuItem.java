package pl.sda.view;

public final class MenuItem {
    public final String label;
    public final Runnable action;


    public MenuItem(String label, Runnable action) {
        this.label = label;
        this.action = action;
    }
}

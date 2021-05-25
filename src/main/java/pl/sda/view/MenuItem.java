package pl.sda.view;

public final class MenuItem {
    public final Runnable action;
    public final String label;

    public MenuItem(Runnable action, String label) {
        this.action = action;
        this.label = label;
    }
}

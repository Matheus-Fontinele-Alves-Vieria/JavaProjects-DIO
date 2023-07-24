package core;

import java.util.List;

public class GenericType<T> {
    private List<T> menu;

    public GenericType(List<T> menu) {
        this.menu = menu;
    }

    public List<T> getMenu() {
        return this.menu;
    }

    public void setMenu(T item) {
        this.menu.add(item);
    }
}

package lesson4Composite;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Component {
    protected Collection<Component> list = new ArrayList<>();
    protected String title;
    protected Component(String title) {
        this.title = title;
    }
    public abstract void print();
    public void add(Component item){
        list.add(item);
    }
}

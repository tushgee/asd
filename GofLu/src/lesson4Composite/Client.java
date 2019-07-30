package lesson4Composite;

public class Client {
    public static void main(String[] args) {
        Component root = new Composite("root");
        Component leaf1 = new Leaf("1", "leaf1");
        Component comp = new Composite("composite");
        Component leaf2 = new Leaf("2", "leaf2");
        comp.add(leaf2);
        root.add(leaf1);
        root.add(comp);

        root.print();
    }
}

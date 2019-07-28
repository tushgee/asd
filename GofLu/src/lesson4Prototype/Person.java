package lesson4Prototype;

public class Person implements Prototype {
    String name;
    public Person(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Prototype doClone() {
        return new Person(name);
    }

    public String toString(){
        return "This person is named " + name;
    }
}

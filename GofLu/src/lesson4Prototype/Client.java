package lesson4Prototype;
public class Client {
    public static void main(String[] args) {
        Person person1 = new Person("Fred"); // this can come from somewhere else
        // so there is no dependency
        System.out.println("person 1: " + person1);
        Prototype person2 = person1.doClone();
        System.out.println("person 2: " + person2);
        ((Person)person2).setName("Tushig");
        System.out.println("person 1: " + person1);
        System.out.println("person 2: " + person2);
    }
}

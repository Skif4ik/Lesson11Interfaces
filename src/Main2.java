import model.Person;

public class Main2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person("Goga", "Belarus",1980);
        Person person2 = (Person) person1.clone();
        System.out.println(person2);
    }
}

import model.Person;
import model.PersonBirthYearComparator;
import model.PersonCountryComparator;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    // Интерфейсы - конструкция языка JAVA которая предназначена
    // для объеденения логически связаных между собой абстрактных методов

    // Интерфейсы нужны для определения общего поведения для объектов
    // класса разных локальных иерархий

    //Объекты классов реализующих интерфейсы преобритают типы этих интерфейсов

    public static void main(String[] args) {
        Integer[] arr1 = {3, -5, 0, 10, 4};
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        String[] arr2 = {"Gosha", "Artem", "Ignat", "Zhora", "Mitya"};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        Person[] people = {
                new Person("Gosha", "Russia", 1970),
                new Person("Zhora", "Belarus", 1965),
                new Person("Gosha", "Belarus", 1960),
                new Person("Artem", "Russia", 1990),
                new Person("Gosha", "Russia", 1967)
        };
        // Метод sort может сортировать объеуты классов реализующих интерфейс Comparable.
        // Это означает что для сравнения объектов sort использует метод compareTo
        // compareTo - метод естественного порядка сортировки
        Arrays.sort(people);

        System.out.println("Сортировка в порядке реализации compareTo");

        for (Person person : people) {
            System.out.println(person);
        }

        System.out.println("========================================================");
        System.out.println("== Сортировка в порядке обратном реализации compareTo ==");
        //Сортировка в порядке обратном реализации compareTo
        Arrays.sort(people, Comparator.reverseOrder());
        for (Person person : people) {
            System.out.println(person);
        }


        System.out.println("========================================================");
        System.out.println("============= Сортировка только по Странам =============");
        PersonCountryComparator pcc = new PersonCountryComparator();
        Arrays.sort(people, pcc);
        for (Person person : people) {
            System.out.println(person);
        }

        System.out.println("========================================================");
        System.out.println("============== Сортировка только по годам ==============");
        PersonBirthYearComparator pbc = new PersonBirthYearComparator();
        Arrays.sort(people, pbc);
        for (Person person : people) {
            System.out.println(person);
        }
        System.out.println("========================================================");
        System.out.println("===== Сортировка только по годам в обратном порядке ====");
        Arrays.sort(people, pbc.reversed());
        for (Person person : people) {
            System.out.println(person);
        }

//        System.out.println("========================================================");
//        System.out.println("===== Сортировка сначала по странам потом по годам ====");
//        PersonCountryComparator pcbc = (PersonCountryComparator) new PersonCountryComparator().thenComparing(new PersonBirthYearComparator());
//        Arrays.sort(people, pcbc);
//        for (Person person : people) {
//            System.out.println(person);
//        }

        System.out.println("========================================================");
        System.out.println("================= Сортировка по именам =================");
        Arrays.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                return person1.getName().compareToIgnoreCase(person2.getName());
            }
        });
        for (Person person : people) {
            System.out.println(person);
        }




    }
}
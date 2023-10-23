package model;

import java.util.Comparator;

public class PersonBirthYearComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        return person1.getBirthYear() - person2.getBirthYear();
    }
}

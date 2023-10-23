package model;

import java.util.Comparator;

public class PersonCountryComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        return person1.getCountry().compareToIgnoreCase(person2.getCountry());
    }
}

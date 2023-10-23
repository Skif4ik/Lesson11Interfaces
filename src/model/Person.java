package model;

public class Person implements Comparable<Person>,Cloneable{
    private String name;
    private String country;
    private int birthYear;

    public Person() {
    }

    public Person(String name, String country, int birthYear) {
        this.name = name;
        this.country = country;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("model.Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", country='").append(country).append('\'');
        sb.append(", birthYear=").append(birthYear);
        sb.append('}');
        return sb.toString();
    }

    @Override//естественный порядок сортировки с учетом каждого поля
    public int compareTo(Person person) {
        if(name.compareTo(person.name)!=0)
            return name.compareTo(person.name);
        if(country.compareToIgnoreCase(person.country)!=0)//сравнение без учета регистра
            return country.compareToIgnoreCase(person.country);
        return birthYear - person.birthYear;
    }

    //clone предназначен для создания точной копии объекта, на котором
    //вызывается этот метод
    //при клонировании объектов этим методом не вызываются конструкторы
    // и блоки кода из класса
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
//принцип работы метода compareTo
    //нужно сравнить this с приходяшим в параметрах обьектом person
    //если считаем что this > person то возвращаем положительное значение
    //если считаем что this < person то возвращаем отрицательное значение
    //если считаем что объекты равны, то возвращаем 0

//    @Override//пример сравнения двух людей по критерию года рождения
//    public int compareTo(Person person) {
//        if(birthYear > person.birthYear){
//            return 1;
//        }else{
//            if(birthYear < person.birthYear){
//                return -1;
//            }
//            return 0;
//        }
        //return Integer.compare(birthYear, person.birthYear);
//        return birthYear - person.birthYear;
//
//        }



    }


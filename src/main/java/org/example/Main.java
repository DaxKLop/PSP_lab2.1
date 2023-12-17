package org.example;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        people[0] = new Person("Гена", "Мужчина", 12);
        people[1] = new Person("Гена", "Мужчина", 15);
        people[2] = new Person("Маша", "Женщина", 11);
        people[3] = new Person("Гена", "Мужчина", 35);
        people[4] = new Person("Света", "Женщина", 9);
        System.out.println();
        float averageAge = 0;
        int maleCount = 0;
        for (int i = 0; i < people.length; i++) {
            if(people[i].getGender().equals("Мужчина")) {
                maleCount++;
            }
            averageAge += people[i].getAge();
            WriteInfo obj = new WriteInfo();
            obj.write_info(people[i]);
            System.out.println();
        }
        System.out.println("Средний возраст :" + averageAge/people.length);
        System.out.println("Количество мужчин :" + maleCount);
    }
}
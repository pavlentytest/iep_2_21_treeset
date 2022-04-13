package ru.samsung.itschool.mdev;

import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Ivan");
        names.add("Ivan");
        names.add("Max");
        names.add("Olga");
        names.add("Olga");
        names.add("Maria");


        TreeSet<String> treeSet = new TreeSet<>(names);
        for(String s: treeSet) {
            System.out.println(s);
        }

        class Person implements Comparable<Person>{
            private String name;
            private Integer mark;

            public Person(String name, Integer mark) {
                this.name = name;
                this.mark = mark;
            }

            @Override
            public int compareTo(Person o) {
                return this.mark - o.mark;
            }
        }

        TreeSet<Person> personTreeSet = new TreeSet<>();
        personTreeSet.add(new Person("Ivan",40));
        personTreeSet.add(new Person("Alexey",40));
        personTreeSet.add(new Person("Ivan",30));
        personTreeSet.add(new Person("Max",32));
        personTreeSet.add(new Person("Olga",50));
        personTreeSet.add(new Person("Natalia",44));
        personTreeSet.add(new Person("Petr",54));

        for(Person p: personTreeSet) {
            System.out.println(p.mark + ", "+p.name);
        }

        SortedSet<Person> result =
                personTreeSet.tailSet(new Person("",40));
        System.out.println("--------------------------------");
        for(Person p: result) {
            System.out.println(p.mark + ", "+p.name);
        }

        
    }
}

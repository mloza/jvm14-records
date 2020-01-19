package pl.mloza;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Java", "Developer", 29);
        System.out.println(p.firstName());
        System.out.println(p.lastName());
        System.out.println(p.age());
        System.out.println(p);

        localRecord();
    }

    public static void localRecord() {
        String persons = """
                Java,Developer,29
                Python,Developer,25
                John,Doe,65
                """;

        record LocalPerson(String firstName, String lastName, int age) {
            LocalPerson(String[] data) {
                this(data[0], data[1], Integer.parseInt(data[2]));
            }
        }

        Arrays.stream(persons.split("\n"))
                .map(i -> i.split(","))
                .map(LocalPerson::new)
                .forEach(System.out::println);
    }
}

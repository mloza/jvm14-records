package pl.mloza;

public record Person (
        String firstName,
        String lastName,
        int age) {

    public static int x;

    public static int inc() {
        return x++;
    }

    public Person {
        if (age < 20) {
            new IllegalArgumentException("You are too young!");
        }
    }

    public Person() {
        this("Java", "Developer", 21);

        System.out.println("Default object has been created");
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}

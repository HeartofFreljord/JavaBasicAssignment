import java.security.spec.RSAOtherPrimeInfo;

public class Zoo {
    public static int calculatePrice(Person person) {
        if (person.getAge() <= 5) {
            return 0;
        } else if (person.getAge() <= 12) {
            return 5;
        } else {
            return 15;
        }
    }

    public static void main(String[] args) {
        Person per1 = new Person("Bob", 3);
        Person per2 = new Person("Dave", 7);
        Person per3 = new Person("Tom", 22);

        System.out.println("Price for " + per1.getName() + " is: " + calculatePrice(per1));
        System.out.println("Price for " + per2.getName() + " is: " + calculatePrice(per2));
        System.out.println("Price for " + per3.getName() + " is: " + calculatePrice(per3));
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
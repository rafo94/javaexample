import model.User;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("John", 28),
                new User("Jane", 35),
                new User("Alex", 21)
        );

        System.out.println("Before sort: ");
        for (User user : users) {
            System.out.println(user);
        }

        users.sort(Comparator.comparingInt(User::getEge));
        System.out.println("\nAfter sort:");
        for (User user : users) {
            System.out.println(user);
        }
    }
}

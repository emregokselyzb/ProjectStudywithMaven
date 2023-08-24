package functionalinterfaces;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UserTest {

    public static void main(String[] args) {

        List<User> users= new ArrayList<>();
        users.add(User.builder().firstName("Mike").lastName("Smith").build());
        users.add(User.builder().firstName("Tom").lastName("Hanks").build());
        users.add(User.builder().firstName("Ammy").lastName("Evan").age(55).build());
        users.add(User.builder().firstName("Emma").lastName("Pellard").build());

        printName(users,user->user.getLastName().startsWith("E"));
    }

    private static void printName(@NotNull List<User> users, Predicate<User> p){
        for (User user : users) {
            if (p.test(user)){
                System.out.println(user.toString());
            }

        }
    }
}

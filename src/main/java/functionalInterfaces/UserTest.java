package functionalInterfaces;

import java.util.ArrayList;
import java.util.*;
import java.util.function.Predicate;

public class UserTest {

    public static void main(String[] args) {

        List<User> users=new ArrayList<>();
        users.add(User.builder().firstName("Mike").lastName("Smith").age(35).build());
        users.add(User.builder().firstName("Evan").lastName("Novak").age(47).build());
        users.add(User.builder().firstName("Tom ").lastName("Hanks").age(25).build());
        users.add(User.builder().firstName("Emre Goksel").lastName("Yuzbasioglu").age(38).build());

   printName(users,user -> user.getFirstName().startsWith("E"));


    }



    private static void printName(List<User> users, Predicate<User> T){
        for (User user : users) {
            if(T.test(user))
            System.out.println(user.toString());
            System.out.println(user.toString());

        }
    }
}

import java.util.Arrays;
import java.util.List;

public class TaskCharacter {

    public static void main(String[] args) {

        List<String> words= Arrays.asList("Java","Apple","Honda","Developer");

        DishData.getAll().stream()
                .map(Dish::getName)
                .map(dish->dish.length())
                .forEach(System.out::println);

    }
}

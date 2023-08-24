package functionalinterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class predicate {

    public static void main(String[] args) {

        Predicate<Integer> result = n -> n > 50;
        boolean n1 = result.test(45);
        System.out.println(n1);

        System.out.println("*******************************************");

        List<Integer> mylist = new ArrayList<>();
        mylist.addAll(Arrays.asList(2, 3, 5, 9, 19, 22, 23, 33, 33));

        mylist.removeIf(n -> n % 2 == 0);
        System.out.println(mylist);

        Consumer<int[]> printeach = list -> {
            for (int i : list) {
                if (i==45) {


                    System.out.println(i);
                }
            }

        };
        int [] numbers= {1,2,3,45};
        printeach.accept(numbers);
    }
}





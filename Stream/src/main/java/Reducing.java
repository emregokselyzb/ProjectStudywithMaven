import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {
    public static void main(String[] args) {

        List<Integer> numbers= Arrays.asList(34,34,41,24,58);
        int result=numbers.stream().reduce(0,(a,b)->a+b);
        System.out.println(result);

        //No initial value
        Optional<Integer> result2=numbers.stream().reduce((a, b)->a+b);
        System.out.println(result2);

        //Max and Min
        Optional<Integer> min=numbers.stream().reduce(Integer::min);
        Optional<Integer> max=numbers.stream().reduce(Integer::max);
        Optional<Integer> compare=numbers.stream().reduce(Integer::compare);
        Optional<Integer> sum=numbers.stream().reduce(Integer::sum);

        System.out.println("sum = " + sum);

        //Task
        DishData.getAll().stream().map(d->1).reduce(0,(a,b)->a+b);


        long dcount=DishData.getAll().stream().count();
        System.out.println("dcount = " + dcount);


    }
}

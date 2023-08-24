package functionalinterfaces;

import java.sql.SQLOutput;
import java.util.function.*;

public class Examples {

    public static void main(String[] args) {

        Predicate<Integer> lesserThan=b-> b<18;
        Boolean result =lesserThan.test(50);
        System.out.println(result);

        Consumer<Integer> display= i-> System.out.println(i);
        display.accept(50);

        BiConsumer<Integer,Integer> addTwo=(x,y) -> System.out.println(x+y);
        addTwo.accept(100,200);

        Function<String,String> fun=s->"Hello" + s;
        String str=fun.apply("Ozzy");
        System.out.println(str);

        System.out.println("Apple");

        Supplier<Double> randomValue=()->Math.random();
        System.out.println(randomValue.get());


    }
}

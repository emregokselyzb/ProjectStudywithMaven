package functionalInterfaces;

import java.util.function.Predicate;

public class Example {

    public static void main(String[] args) {

        Predicate<Integer> lesserThan=new Predicate<Integer>(){

            @Override
            public boolean test(Integer integer) {
                return integer<18;

            }
        };

        lesserThan.test(50);
    }
}

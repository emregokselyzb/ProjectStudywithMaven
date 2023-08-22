package doublecolonoperator;

import java.util.function.BiFunction;

public class Demo {

    public static void main(String[] args) {

        Calculate s1= (x,y) -> Calculator.findSum(x,y);
        s1.calculate(10,20);

        Calculate s2 = Calculator::findSum;
        s2.calculate(100,35);

        //Reference to instance method
        Calculate m1=(x,y) -> new Calculator().multiply(x,y);
        m1.calculate(5,6);

        Calculator obj=new Calculator();

        Calculate m2=obj::multiply;
        m2.calculate(8,9);

        Calculate m3=new Calculator()::multiply;
        m3.calculate(6,6);

        BiFunction<String,Integer,String> fn=(str,i) ->str.substring(i);
        System.out.println(fn.apply("Developer", 1));

        BiFunction<String, Integer,String> fn2=String::substring;
        System.out.println(fn2.apply("Developer",6));


    }
}

package comparatorinterface;

import java.util.*;

import static java.util.Comparator.comparing;

public class ComparatorDemo {
    public static void main(String[] args) {

   /*     List<Integer> list =Arrays.asList(10,0,15,5,20);
        System.out.println(list);


        //Ascending sort
        Collections.sort(list);
        System.out.println(list);

        //Descending sort
        Collections.sort(list,new MyComparator());

        System.out.println(list);

        Collections.sort(list,((o1,o2) -> (o1>o2) ? -1 : (o2<o1)? 1:0));

        System.out.println(list);

        list.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println(list);

        list.sort((o1, o2) -> o2.compareTo(o1));
        System.out.println(list);

        List<Apple> myInventory= Arrays.asList(
                new Apple(80,Color.GREEN),
                new Apple(155,Color.RED),
                new Apple(120,Color.GREEN));


        Comparator<Apple> sortApple=Comparator.comparing((apple) ->apple.getWeight());
        myInventory.sort(sortApple);
        System.out.println(myInventory);

        myInventory.sort(comparing((apple )-> apple.getWeight()));

        myInventory.sort(comparing(Apple::getWeight));

        myInventory.sort(comparing(Apple::getWeight).reversed());
        System.out.println(myInventory);
*/




        List<Apple> myInventory= Arrays.asList(
                new Apple(80,Color.GREEN),
                new Apple(155,Color.RED),
                new Apple(230,Color.RED),
                new Apple(120,Color.GREEN));


        myInventory.sort(comparing(Apple::getColor).reversed().thenComparing(Apple::getColor));

        System.out.println(myInventory);


        myInventory.sort(comparing(Apple::getWeight).reversed().thenComparing(Apple::getColor));

        System.out.println(myInventory);


    }
}

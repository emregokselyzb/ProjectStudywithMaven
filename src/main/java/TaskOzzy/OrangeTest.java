package TaskOzzy;

import functionalInterfaces.User;

import java.util.*;
import java.util.function.Predicate;

public class OrangeTest {
    public static void main(String[] args) {

        List<Orange> inventory=new ArrayList<>();
      //  inventory.add(new Orange(300,Color.GREEN));
        //    inventory.add(new Orange(200,Color.RED));
        //    inventory.add(new Orange(100,Color.WHITE));

        inventory.add(Orange.builder().weight(300).color(Color.GREEN).build());
        inventory.add(Orange.builder().weight(200).color(Color.RED).build());
        inventory.add(Orange.builder().weight(100).color(Color.WHITE).build());
        inventory.add(Orange.builder().weight(500).color(Color.RED).build());
        inventory.add(Orange.builder().weight(30).color(Color.WHITE).build());




       prettyPrintApple(inventory,oranges -> oranges.getWeight()>100 && oranges.getColor().equals(Color.GREEN));
      //  prettyPrintApple(inventory, oranges -> oranges.getColor().equals(Color.GREEN));

    }


    public static void prettyPrintApple(List<Orange> inventory, Predicate<Orange> orangeFormatter){
        for (Orange oranges : inventory) {

            if(orangeFormatter.test(oranges))

            System.out.println(oranges);}

    }

    }



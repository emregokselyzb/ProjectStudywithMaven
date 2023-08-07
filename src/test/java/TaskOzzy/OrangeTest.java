package TaskOzzy;

import java.util.*;

public class OrangeTest {
    public static void main(String[] args) {

        List<Orange> inventory=new ArrayList<>();
        inventory.add(new Orange(300,Color.GREEN));
        inventory.add(new Orange(200,Color.RED));
        inventory.add(new Orange(100,Color.WHITE));

        OrangeFormatter simpleFormatter=orange-> "An orange of"+ orange.getWeight()+"gr";
        prettyPrintApple(inventory,orange ->"An orange of  " + orange.getWeight()+"gr");


        System.out.println("**************************************");

        OrangeFormatter fancyFormatter=orange ->{

            String characteristic=orange.getWeight()>150? "Heavy" :"Light";
            return "A  " + characteristic +" " + orange.getColor() +"  ";
        };

       prettyPrintApple(inventory,fancyFormatter);

    }


    public static void prettyPrintApple(List<Orange> inventory, OrangeFormatter orangeFormatter){
        for (Orange orange : inventory) {

            String output=orangeFormatter.accept(orange);

            System.out.println(output);
        }
    }

    }



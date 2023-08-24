package org.example;

public class DishTask {

    public static void main(String[] args) {
        //Print all dish's name that has less than 400 calories
        System.out.println("****************************");

        DishData.getAll().stream()
                .map(Dish.name)
    }
}

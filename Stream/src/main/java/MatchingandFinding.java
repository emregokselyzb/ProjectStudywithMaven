import java.util.Optional;

public class MatchingandFinding {

    public static void main(String[] args) {
        //ALL MATCH
        System.out.println("*****************************");

        boolean isHealty=DishData.getAll().stream().allMatch(dish->dish.getCalories()<1000);
        System.out.println(isHealty);

        //ANY MATCH
        System.out.println("**********************************");
        if(DishData.getAll().stream().anyMatch(Dish::isVegeterian))
            System.out.println("The menu is friendly");

        //NONE MATCH
        System.out.println("**********************************");
        if(DishData.getAll().stream().noneMatch(dish -> dish.getCalories()>=1000))
        System.out.println("The dishes not healty");

        //FIND ANY
        System.out.println("*************************************");
        Optional<Dish> dish=(DishData.getAll().stream()
                .filter(Dish::isVegeterian)
                        .findAny());

        System.out.println(dish.get());




        //FIND FIRST
        System.out.println("**********************************");
        Optional<Dish> dish2=DishData.getAll().stream()
                .filter(Dish::isVegeterian)
                .findFirst();

        System.out.println("dish2 = " + dish2);












    }



}

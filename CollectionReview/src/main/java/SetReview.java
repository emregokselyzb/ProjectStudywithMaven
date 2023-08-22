import java.util.HashSet;
import java.util.Set;

public class SetReview {

    public static void main(String[] args) {

        Set<Student> mySet=new HashSet<>();

        mySet.add(new Student(7, "Ibadet"));
        mySet.add(new Student(8, "Ahmet"));
        mySet.add(new Student(9, "Muhabbet"));
        mySet.add(new Student(9, "Muhabbet"));

    /*    mySet.add(new Student(7,"Curry"));
        mySet.add(new Student(19,"Lebron"));
        mySet.add(new Student(25,"Shaq"));
        mySet.add(new Student(41,"Jordan"));

     */
     //   mySet.add(new Student(41,"Jordan")); not duplicate allowed

        System.out.println(mySet);

        Set<Integer> numSet=new HashSet<>();

        numSet.add(1);
        numSet.add(2);

      //  System.out.println(numSet);



    }

    public static Character firstRepeatingChar(String str){
        Set<Character> chars=new HashSet<>();

        for (Character ch :str.toCharArray()) if (!chars.add(ch))  return ch;

        return null;


        }
    }


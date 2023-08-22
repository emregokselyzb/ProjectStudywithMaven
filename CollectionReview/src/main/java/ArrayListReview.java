import java.util.*;

public class ArrayListReview {

    public static void main (String[] args){

        List<Student> students=new ArrayList<>();

        students.add(new Student(1,"Jose"));
        students.add(new Student(2,"Sayed"));
        students.add(new Student(3,"Nick"));
        students.add(new Student(4,"Ronnie"));

        System.out.println(students);

        for(int i=0; i<students.size(); i++) System.out.println(students.get(i));

        System.out.println("Printing with iterator Forward.........");

        Iterator iter=students.listIterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }





    }
}

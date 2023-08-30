import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStream {

    public static void main(String[] args) {
        //Creating Stream from Array
        
        String[] courses={"Java","JS","TS"};
        Stream<String> courseStream= Arrays.stream(courses);
        courseStream.forEach(System.out::println);

        //Creating Stream from Collection

        List<String> courseList=Arrays.asList("Java","DS","Spring");
        Stream<String> courseStream2=courseList.stream();

        List<Course> myCourses=Arrays.asList(
                new Course("JAVA",100),
                new Course("DS",101),
                new Course("Spring",102),
                new Course("MS",103)
        );

        Stream<Course> myCourseStream=myCourses.stream();

        //Creating Stream from Values
        Stream<Integer> stream99= Stream.of(
                1,2,4,45,56


        );




    }
}

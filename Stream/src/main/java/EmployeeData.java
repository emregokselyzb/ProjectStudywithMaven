import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {


    public static Stream<Employee> readAll(){
        return Stream.of(
                new Employee(100,"Mike","mike@cydeo.com", Arrays.asList("23456789","12345678")),
                new Employee(101,"Emre","emre@cydeo.com", Arrays.asList("567890123","543216789")),
                new Employee(100,"Goksel","goksel@cydeo.com", Arrays.asList())

        );
    }
}

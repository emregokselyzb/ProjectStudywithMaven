public class EmployeeTest {

    public static void main(String[] args) {

       // PrintAll emails. One employee has one email One to one

        EmployeeData.readAll()
                .map(Employee::getEmpEmail).
                forEach(System.out::println);
    }

}

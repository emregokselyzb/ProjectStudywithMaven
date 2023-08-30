import java.util.Comparator;

import static java.util.Comparator.comparing;

public class TransactionTest {
    public static void main(String[] args) {

        //1-FindAll transactions in 2011 and sort by value
        TransactionData.getAll().stream()
                .filter(transaction -> transaction.getYear()==2011)
                .sorted(comparing(Transaction::getValue))
                .forEach(System.out::println);


        //2-What are all the unique cities where the traders work.
        TransactionData.getAll().stream().map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);

        //3-Find All traders from Cambridge and sort them by name

        System.out.println("***********************************");

        TransactionData.getAll().stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .distinct()
                .sorted(comparing(Trader::getName))
                .forEach(System.out::println);

        //4- Return a string of all traders name sorted alphabetically
        System.out.println("*******************************************");
        String result=TransactionData.getAll().stream().map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .reduce(" ",(name1,name2)->name1+name2 +" ");

        System.out.println(result);

        //5-Are any traders based in Milan?
        System.out.println("------------------------------");

       Boolean Milantraders= TransactionData.getAll().stream().anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));

        System.out.println(Milantraders);

    }
}

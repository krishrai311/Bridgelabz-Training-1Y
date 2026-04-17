package src.com.gla.Streamapi;
import java.time.LocalDateTime;
import java.util.*;

public class Transaction{
    public static void main(String[] args) {

        List<Integer> transactionIds = Arrays.asList(101, 102, 103);

        transactionIds.forEach(id ->
                System.out.println(LocalDateTime.now() +
                        " - Transaction: " + id));
    }
}

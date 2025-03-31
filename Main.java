import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static List<Integer> filterOddNumbers(List<Integer> numbers) {
        return numbers.stream().filter(x -> x % 2 == 1).collect(Collectors.toList());
    }


    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> oddNumbers = filterOddNumbers(numbers);
        System.out.println("Непарні числа: " + oddNumbers);


    }
}

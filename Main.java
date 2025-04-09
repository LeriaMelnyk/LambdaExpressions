import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static List<Integer> filterOddNumbers(List<Integer> numbers) {
        return numbers.stream().filter(x -> x % 2 == 1).collect(Collectors.toList());
    }

    public static double calculateAverage(List<Double> numbers) {
        return numbers.stream().mapToDouble(x -> x).average().getAsDouble();
    }

    public static List<String> sortAlphabet(List<String> words){
        return words.stream().sorted().collect(Collectors.toList());

    }

    public static int calculateSumEvenNumbers(List<Integer> numbers) {
        return numbers.stream().filter(x -> x % 2 == 0).reduce(0, Integer::sum);
    }

    public static int factorial(int n) {
        return IntStream.rangeClosed(1,n)
                .reduce(1, (a,b)-> {
                    return a * b;
                });
    }

    public static Integer suma(List<Integer> numbers) {
        return numbers.stream().reduce(0,(a,b)-> a+b);
    }

    public static Integer product(List<Integer> numbers) {
        return numbers.stream().reduce(1, (a,b)-> a*b);
    }

    public static List<Integer> squareNumbers(List<Integer> numbers) {
        return numbers.stream()
                .map(n->n*n)
                .collect(Collectors.toList());
    }








    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> oddNumbers = filterOddNumbers(numbers);
        System.out.println("Непарні числа: " + oddNumbers);

        List<Double> realNumbers = List.of(1.2, 3.4, 5.6, 7.8, 9.0);
        double average = calculateAverage(realNumbers);
        System.out.println("Середнє значення: " + average);

        List<String> words = List.of("яблуко", "банан", "вишня", "абрикос");
        List<String> sortedWords = sortAlphabet(words);
        System.out.println("Сортовані слова: " + sortedWords);

        List<Integer> numbers1= List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = calculateSumEvenNumbers(numbers1);
        System.out.println("Сума парних чисел: " + sum);

        int number = 6;
        int factorial = factorial(number);
        System.out.println("Факторіал числа: " +number + " це " + factorial);

        int suma= suma(numbers1);
        System.out.println("Сума чисел масиву: " + suma);

        int product = product(numbers1);
        System.out.println("Добуток чисел масиву: " +product);

    }
}

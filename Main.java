import java.util.*;
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
        return numbers.stream().reduce(0, Integer::sum);
    }

    public static Integer product(List<Integer> numbers) {
        return numbers.stream().reduce(1, (a,b)-> a*b);
    }

    public static List<Integer> squareNumbers(List<Integer> numbers) {
        return numbers.stream()
                .map(n->n*n)
                .collect(Collectors.toList());
    }

    public static List<String> sortWordsByLength(List<String> words) {
        return words.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());

    }

    public static long countWordsInSentence(String sentence) {
        return   Arrays.stream(sentence.split(" "))
                .filter(word-> !word.isEmpty())
                .count();
    }

    public static String findFirstNotEmptyWord(List<String> words) {
        return words.stream().filter(word -> !word.isEmpty()).findFirst().get();
    }

    public static boolean allStartWithUpperCase(List<String> list) {
        return list.stream()
                .allMatch(s -> !s.isEmpty() && Character.isUpperCase(s.charAt(0)));
    }

    public static Optional<Integer> secondLargest(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
    }

    public static Optional<Integer> maxEvenNumber(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .max(Integer::compareTo);
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

        List<Integer> squareNumbers = squareNumbers(numbers1);
        System.out.println("Квадрати чисел масиву: " + squareNumbers);

        List<String> sortWordsByLength = sortWordsByLength(words);
        System.out.println("Сортування слів за довжиною: " + sortWordsByLength);

        String sentense="Перевірка одного з методів";
        long contWordsInSentense=countWordsInSentence(sentense);
        System.out.println("Кількість слів "+contWordsInSentense);

        List<String> lines= List.of("","1","");
        String line1=findFirstNotEmptyWord(lines);
        System.out.println("Знаходження першого не пустого рядка:"+ line1);

        List<String> wordsWithDifferentCase=List.of("Pupupu","apple","Windows");
        boolean wordsWithUpperCase=allStartWithUpperCase(wordsWithDifferentCase);
        System.out.println("Всі слова з великої: " + wordsWithUpperCase);

        List<Integer> numbers2= List.of(67,85,110,21,150,220);
        Optional<Integer> secondLargest=secondLargest(numbers2);
        System.out.println("Друге найбільше: " + secondLargest.get());

        Optional<Integer> maxEven=maxEvenNumber(numbers2);
        System.out.println("Максимальне парне: " + maxEven.get());



    }
}

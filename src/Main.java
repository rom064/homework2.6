import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums1 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        task1(nums1);
        List<Integer> nums2 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        task2(nums2);
        List<String> words = new ArrayList<>(List.of("текст1", "текст1", "текст2", "текст2", "текст3"));
        task3(words);
        List<String> strings = new ArrayList<>(List.of("один", "один", "два","два", "два", "три", "три", "три"));
        task4(strings);
    }

    public static void task1(List<Integer> numbers) {
        System.out.println("Задача 1: ");
        for (Integer number : numbers) {
            if (number % 2 == 1) {
                System.out.print(number);
            }
        }
        System.out.println();
    }

    public static void task2(List<Integer> numbers) {
        System.out.println("Задача 2: ");
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);
        numbers = new ArrayList<>(uniqueNumbers);
        Collections.sort(numbers);
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number);
            }
        }
        System.out.println();
    }

    public static void task3(List<String> words) {
        System.out.println("Задача 3: ");
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);
        System.out.println();
    }

    public static void task4(List<String> words) {
        System.out.println("Задача 4: ");
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (map.containsKey(word)) {
                Integer count = map.get(word);
                map.put(word, count + 1);
            } else {
                map.put(word, 1);
            }
        }
        System.out.println(map);
    }
}
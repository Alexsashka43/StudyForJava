import java.sql.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
//    public static void fizzBuzz() {
//        IntStream.rangeClosed(1, 100)
//                .mapToObj(i -> i % 5 == 0 ? (i % 7 == 0 ? "FizzBuzz" : "Fizz") : (i % 7 == 0 ? "Buzz" : i))
//                .forEach(System.out::println);
//    }


    public static void main(String[] args) {
//        for (int i = 0; i < 101; i++) {
//            if ((i % 5 == 0) && (i % 3 == 0)) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//            System.out.println(i);
//            }
//        }
        int[] arr = new int[]{3, 7, 1, 2, 8, 9};

        Arrays.sort(arr);
//        for (int i = arr.length - 1; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int tmp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = tmp;
//                }
//            }
//        }
        System.out.println(Arrays.toString(arr));
    }
}





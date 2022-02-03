


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Фильтр пузырьком
//        int [] arr = {3, 100, 4, 14, 7, 27, 1, 5, 2, 6, 29, 28};
//
//        for (int i:arr) {
//            for(int j = 0; j < arr.length - 1; j++){
//                if (arr[j] > arr[j + 1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//        for (int s: arr){
//            System.out.println(s);
//        }


//        Простые числа
//        IntStream stream = IntStream.rangeClosed(2, 100);
//        stream.filter(num -> num % 2 != 0 || num == 2).
//                filter(num -> num % 3 != 0 || num == 3).
//                forEach(System.out::println);
//
//
//        int [] arr = new int[]{2, 6, 7, 7, 4, 7, 8};
//        RemoteNum rem = new RemoteNum();
//        for (int s:rem.remoteNum(arr, 7)){
//            System.out.println(s);
//        }

//        Vector vector = new Vector();
//        System.out.println(vector.length(12, 1.4,3));
//        }
//        }



        RemoteNum showGet = new RemoteNum();
        String path = "https://yandex.ru/";
        showGet.getSomeElements(path);
    }
}







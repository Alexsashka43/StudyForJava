import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
        public static void main(String args[]) {
            GenericBox<Integer, String> twoGenObj = new GenericBox<Integer, String>(555, "Hello");
            int intValue = twoGenObj.getObj1();
            String strValue = twoGenObj.getObj2();
            System.out.println(intValue);
            System.out.println(strValue);
        }
    }



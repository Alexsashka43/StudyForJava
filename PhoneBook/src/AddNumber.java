import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class AddNumber {
    Map<String, List<String>> numberAndNames = new HashMap<>();
    Scanner scIn = new Scanner(System.in);
    List listNumber = new ArrayList();
    public static void main(String[] args) {
    }


    public void add(Map<String, List <String>> numberAndNames) {

        Scanner scIn = new Scanner(System.in);
        System.out.println("Введите фамилию: ");
        String surname = scIn.nextLine();
        System.out.println("Введите номер: ");
        String number = scIn.nextLine();
        listNumber.add(number);
        numberAndNames.put(surname, listNumber);
        if (surname.equals(numberAndNames.get(surname))) {
            listNumber.add(number);
        }
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("phoneNumber.txt", true))) {
                writer.write(numberAndNames.toString());
            }
            catch(IOException e){
            e.printStackTrace();
        }



        System.out.println(numberAndNames);

//        numberAndNames.put("Васильев", Arrays.asList("89246557657", "89157387564"));
//        numberAndNames.put("Иванов", Arrays.asList("89156789483", "89561546794", "89874567423"));
    }


}


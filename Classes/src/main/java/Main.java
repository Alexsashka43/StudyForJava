import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        Car car = new Car("BMW", "red");

        String output = objectMapper.writeValueAsString(car);
        System.out.println("Output string - " + output);

        Car carFromFile = objectMapper.readValue(new File("car.json"), Car.class);
        System.out.println(carFromFile.toString());

        List<Car> carsList =
                objectMapper.readValue(new File("carList.json"), new TypeReference<List<Car>>() {});
        System.out.println(carsList);

        Student student = new Student(
                "Ivan",
                new Education(
                        "Scool 52",
                        new University(
                                "master",
                                "SPBgU")));
    }
}

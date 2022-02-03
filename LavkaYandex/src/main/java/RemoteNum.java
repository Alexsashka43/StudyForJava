//import lombok.Data;
//
//import java.util.Arrays;
//
//
//@Data
//public class RemoteNum {
//    private int num;
//    private int [] arr;
//    public int [] remoteNum(int[] arr, int num) {
//        int [] array = Arrays.stream(arr).filter(i -> i != num).toArray();
//        return array;
//        }
//    }

import com.insidecoding.sos.webdriver.WebDriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoteNum {
    public List<WebElement> getSomeElements(String path) {

        if (path == null) {
            throw new IllegalArgumentException("getElements: illegal path (NULL)");//добавить new
        }
//        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new OperaDriver();
        WebDriverHelper wd = new WebDriverHelper(driver);//передать driver в качестве параметра
        List<WebElement> result = new ArrayList<>();//тип данных WebElements
        result.addAll(driver.findElements(By.xpath(path)));//addAll т.к. нужно добавить несколько элементов, get заменить на find

        //не забыть удалить
        result.forEach(System.out::println);


        if (result.isEmpty()) {//Проверка на пустоту
            System.out.println("There aren't any elements by this path");
            //return;//не нужен, так как ничего не возвращает
        } else if (wd.isElementPresent(By.xpath("//*[@id='Hello']"))) {//убрать s
            for (WebElement element : result) {
                if (element.getText().equals("remove"))//equals
                    result.remove(element);
//        } else {
//            return result.get(0);//метод getSomeElements возвращает list
            }
        }
        return result;
    }
}
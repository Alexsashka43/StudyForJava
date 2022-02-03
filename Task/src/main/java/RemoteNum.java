import com.insidecoding.sos.webdriver.WebDriverHelper;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.util.ArrayList;
import java.util.List;

public class RemoteNum {
    public List<WebElement> getSomeElements(String path) {

        if (path == null) {
            throw new IllegalArgumentException("getElements: illegal path (NULL)");//добавить new
        }
        ChromeDriverManager.getInstance().setup();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\qwert\\Videos\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
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




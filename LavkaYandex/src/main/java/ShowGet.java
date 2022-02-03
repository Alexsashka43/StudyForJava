//import com.insidecoding.sos.webdriver.WebDriverHelper;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import java.util.ArrayList;
//import java.util.List;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//
//public class ShowGet{
//
//    public List<WebElement> getSomeElements(String path) {
//
//        if (path == null) {
//            throw new IllegalArgumentException("getElements: illegal path (NULL)");//добавить new
////            path = "//*[@id='Hello']"; // если path != null блок не сработает,
////            если path == null - выведется сообщение "getElements: illegal path (NULL)"
//        }
//        WebDriverHelper wd = new WebDriverHelper(webDriver);//передать драйвер в качестве параметра
//        List<WebElement> result = new ArrayList<>();
//        result.add(webDriver.findElement(By.xpath("//*[@id='news_panel_news']")));//поменять название метода на getSelectedValue,
//        // неправильно передан путь
//
//        if (result.isEmpty()) {
//            System.out.println("There aren't any elements by this path");
//        } else if (wd.isElementPresent(By.xpath())) {
//            for (WebElement element : result) {
//                if(element.getText().equals("remove"))
//                    result.remove(element);
////        } else {
////            return result.get(0); //в методе указан тип возвращаемых данных List
////        }
//            }
//        }
//        return result;
//    }
//}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\qwert\\Downloads\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.get("https://www.avito.ru/moskva/transport");
//
////        WebElement smth = driver.findElement(By.xpath("//input[@aria-label='Найти']"));
////        smth.click();
////
////        WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(10))
////                .until(ExpectedConditions.presenceOfElementLocated(By.id(""))));
//        WebElement element = driver.findElement(By
//                .xpath("(//a[text()='Личные вещи'])[1]"));
//        String par = element.getAttribute("offsetWidth");
//
//        System.out.println(par);
//        driver.close();
//    }
//}
//        Scanner scan = new Scanner(System.in);
//        String a = scan.nextLine();
//        scan.close();
//        Solution sol = new Solution();
//        sol.splStr(a);

//        JFrame myFrame = new JFrame();
//        String myTitle = "Пустое окно";
//        myFrame.setTitle(myTitle);
//        myFrame.setSize(300, 300);
//        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        myFrame.setVisible(true);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("In: ");
//        int a = sc.nextInt();
//        int b = new Random().nextInt(10) + 1;
//        if (a==b) {
//            System.out.println("Win");
//        } else {
//            System.out.println("Lose" + " " + b);
//        }

        String data = "Test data";
        Files.write(Paths.get("c://temp//testFile3.txt"));
        data.getBytes();


        }
    }

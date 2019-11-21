package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Homepage;

import java.util.List;

public class Basetest {

    private WebDriver driver;
    protected HomePage  homepage;

    public  void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        homepage = new Homepage(driver);

        driver.manage().window().maximize();
        Thread.sleep(3000);

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        WebElement inputslink = driver.findElement(By.linkText("Shifting Content"));
        inputslink.click();

        WebElement menuelement = driver.findElement(By.xpath("//*[@id=\"content\"]/div/a[1]"));
        menuelement.click();

        List<WebElement> Tab = driver.findElements(By.tagName("li"));
        System.out.println(Tab.size());






        System.out.println(driver.getTitle());

        Thread.sleep(3000);

        driver.quit();


    }

    public static void main (String args[]) throws InterruptedException {
        Basetest test = new Basetest();
        test.setup();
    }
}

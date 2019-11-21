package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Securearea {
    private WebDriver driver;
    private By statusalert = By.id("flash");

    public Securearea(WebDriver driver){
        this.driver = driver;
    }

    public String getAlertText(){
        driver.findElement(statusalert).getText();
    }


}

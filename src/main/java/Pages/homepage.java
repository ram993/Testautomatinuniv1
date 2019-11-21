package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homepage {
    public WebDriver driver;

    private By formauthlink = By.linkText("Form Authentication");

    public homepage(WebDriver driver){
        this.driver = driver;
    }


    public Loginpage clickformauth(){
        driver.findElement(formauthlink).click();
        return new Loginpage(driver);

    }

}

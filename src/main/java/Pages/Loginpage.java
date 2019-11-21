package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
    private WebDriver driver;
    private By usernameField = By.id("username");
    private By password = By.id("password");
    private By loginButton = By.cssSelector("#login button")

    public Loginpage(WebDriver driver){
        this.driver = driver;
    }

    public void setUsername(String username){
        driver.findElement(usernameField).sendKeys();
    }

    public void setPassword(String password){
        driver.findElement(password).sendKeys(password);
    }

    public Securearea clickLoginButton(){
        driver.findElement(loginButton).click();
        return new Securearea(driver);
    }

}

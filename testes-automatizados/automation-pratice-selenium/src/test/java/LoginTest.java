import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    private WebDriver driver;
    @BeforeEach
    public void setUp() throws  Exception{

        driver.get("https://automationexercise.com/login");

    }

    @AfterEach
    public void tearDown(){
        //driver.quit();
    }

    @Test
    void Login(){
        WebElement inputEmail =  driver.findElement(By.name("email"));
        inputEmail.sendKeys("mari@teste.com");

        WebElement password =  driver.findElement(By.name("password"));
        password.sendKeys("abc123");

        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button"));
        loginButton.click();

        WebElement carrosel = driver.findElement(By.id("slider-carousel"));

        Assertions.assertTrue(carrosel.isDisplayed());

    }


}

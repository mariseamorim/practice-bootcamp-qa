package testes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.LoginPage;

public class LoginPageTest {
    private LoginPage loginPage;
    private final String URL = "https://automationexercise.com/login";

    @BeforeEach
    void setUp() throws Exception{
        loginPage = new LoginPage();
        loginPage.visit(URL);
    }

    @AfterEach
    void tearDown() throws  Exception{
       loginPage.quitWebDriver();
    }

    @Test
    void ShouldSignin(){
        //when
        loginPage.signin();

        //then
        Assertions.assertFalse(loginPage.getCurrentUrl().equals(this.URL));
    }


}

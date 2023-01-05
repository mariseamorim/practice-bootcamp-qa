package testes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.RegisterPage;

public class RegisterPageTest {
    private RegisterPage registerPage;
    private final String URL = "https://automationexercise.com/login";

    @BeforeEach
    void setUp() throws Exception{
        registerPage = new RegisterPage();
        registerPage.visit(this.URL);

    }

    @AfterEach
    void tearDown(){
          registerPage.quitWebDriver();
    }

    @Test
    void ShouldInsertNameAndEmailToRegister(){
        //when
        registerPage.insertNameAndEmailToRegister();

        //then
        String actual = this.registerPage.getEmailNewAccount();
        Assertions.assertTrue(actual.contains(".com"));

    }

    @Test
    void ShouldfillOutForm(){
        //when
        registerPage.fillOutForm();

        //then

        String expected = "ACCOUNT CREATED!";
        String actual = this.registerPage.getWelcomeMessage();
        Assertions.assertEquals(expected, actual);

        String actualUrl = this.registerPage.getCurrentUrl();
        Assertions.assertFalse(this.URL.equals(actualUrl));

    }
}

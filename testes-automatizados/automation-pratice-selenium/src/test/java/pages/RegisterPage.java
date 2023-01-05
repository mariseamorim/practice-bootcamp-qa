package pages;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import org.openqa.selenium.By;

import java.util.Locale;

public class RegisterPage extends BasePage{
    public static Faker faker;
    //locators
    private By nameLocattors = By.name("name");
    private By emailAddressLocator = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]");
    private By submitBtnSignup = By.cssSelector("#form > div > div > div:nth-child(3) > div > form > button");
    private By labelMobile = By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/p[10]/label");
    //ENTER ACCOUNT INFORMATION
    private By genderFemaleLocator = By.id("id_gender2");
    private By nameLocator = By.id("name");
    private By emailLocator = By.id("email");
    private By passwordLocator = By.id("password");

    private By daysLocator = By.id("days");
    private By monthsLocator = By.id("months");
    private By yearsLocator = By.id("years");
    private By newsletterLocator = By.id("newsletter");
    private By receiveOffersLocator = By.id("uniform-optin");

    //ADDRESS INFORMATION
    private By firstNameLocator = By.id("first_name");
    private By lastNameLocator = By.id("last_name");
    private By companyLocator = By.id("company");
    private By addressLocator = By.id("address1");
    private By addressTwoLocator = By.id("address2");
    private By countryLocator = By.id("country");
    private By stateLocator = By.id("state");
    private By cityLocator = By.id("city");

    private By zipCodeLocator = By.id("zipcode");
    private By mobileNumberLocator = By.id("mobile_number");
    private By createAccountBtnLocator = By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button");
    private By welcomeMessageLocator = By.cssSelector("#form > div > div > div > h2");
    public void insertNameAndEmailToRegister(){
        if(super.isDisplayed(nameLocattors)){

           faker =new Faker();

            super.type(faker.name().fullName(),nameLocattors);
            super.type(faker.internet().safeEmailAddress(), emailAddressLocator);
            super.click(submitBtnSignup);

        }else{
            System.out.println("name textbox was not present");
        }

    }
    public String getEmailNewAccount(){
        super.waitVisibilityOfElementLocated(labelMobile);
        return  super.getTextByAttribute(this.emailLocator, "value");
    }

    public void fillOutForm(){
        this.insertNameAndEmailToRegister();
        super.waitVisibilityOfElementLocated(labelMobile);
        if(isDisplayed(genderFemaleLocator)){
            click(genderFemaleLocator);
            super.clear(nameLocator);
            super.type("Maria", nameLocator);
            super.type("abc123", passwordLocator);
            super.selectByValue(daysLocator, "24");
            super.selectByValue(monthsLocator, "1");
            super.selectByValue(yearsLocator, "1991");
            super.click(newsletterLocator);
            super.type("Maria", firstNameLocator);
            super.type("Silva", lastNameLocator);
            super.type("Testes SA", companyLocator);
            super.type(("Rua Teste"), addressLocator);
            super.type(("Rua Teste 2"), addressTwoLocator);
            super.selectByValue(countryLocator, "Canada");
            super.type("Santa Catarina", stateLocator);
            super.type("Disney",cityLocator );
            super.type("12345678", zipCodeLocator);
            super.type("9999999999", mobileNumberLocator);
            super.click(createAccountBtnLocator);
        }else{
            System.out.println("message was not found.");
        }
    }

    public String getWelcomeMessage() {
        super.waitVisibilityOfElementLocated(welcomeMessageLocator);
        return super.getText(welcomeMessageLocator);
    }
}

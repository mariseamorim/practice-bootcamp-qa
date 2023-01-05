package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
    //locators
    private By emailAddressLocator = By.name("email");
    private By passwordLocator = By.name("password");
    private By submitBtnLocator = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button");
    public void signin(){

        if(super.isDisplayed((emailAddressLocator))){
            super.type("mari@teste.com", emailAddressLocator);
            super.type("abc123", passwordLocator);
            super.click(submitBtnLocator);
        }else{
            System.out.println("email textbox was not present");
        }

    }


}

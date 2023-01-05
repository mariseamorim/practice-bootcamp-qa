package pages;

import org.openqa.selenium.By;

public class ProductsPages extends BasePage {

    //Locators
    private By titleAllPtocuctsPageLocator = By.className("features_items");
    private By productBlueTopLocator = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[2]");
    private By addProductBtnLocator = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div/a");
    private By modal = By.xpath("//*[@id=\"cartModal\"]");

    private By msgAddProductCardPageLocator = By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[1]");
    private By continueShoppingBtnLocator = By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button");

    public String msg;
    public void addToCartProductBlueTopLocator() {
        if(super.isDisplayed(titleAllPtocuctsPageLocator)) {
            super.actionMoveToElementPerform(productBlueTopLocator);
            super.click(addProductBtnLocator);
            super.swicthToModal(modal);
            msg = this.getMessageAddProductCardPage();
            super.click(continueShoppingBtnLocator);
        } else {
            System.out.println("product not found");
        }
    }

    public String getMessageAddProductCardPage() {
        return super.getText(msgAddProductCardPageLocator);
    }


}

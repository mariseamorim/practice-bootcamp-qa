package testes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.ProductsPages;

public class ProductsPageTest {
    private ProductsPages productsPage;

    private final String URL = "https://automationexercise.com/products";

    @BeforeEach
    void setUp() throws Exception{
        productsPage = new ProductsPages();
        productsPage.visit(URL);
    }

    @AfterEach
    void tearDown() throws  Exception{
        productsPage.quitWebDriver();
    }

    @Test
    void shouldAddProduct(){
        //when
        productsPage.addToCartProductBlueTopLocator();

        //then

        String expected = "Your product has been added to cart.";
        String actual = this.productsPage.msg;
        Assertions.assertEquals(expected, actual);
    }
}

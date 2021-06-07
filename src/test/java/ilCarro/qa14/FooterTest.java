package ilCarro.qa14;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FooterTest extends TestBase {

    @Test
    public void footerLinksTest() {
        jumpToFooter();
        click(By.xpath("//*[@class=\"footer__links\"]/ul/li[1]"));
        Assert.assertTrue(isElementPresent(By.xpath("//*[@class=\"main-search__sidebar\"]")));
        getMainPage();

        click(By.xpath("//*[@class=\"footer__links\"]/ul/li[2]"));
        Assert.assertTrue(isElementPresent(By.cssSelector(".let-carwork-style_let_car__description__1xuO3")));
        getMainPage();

        click(By.xpath("//*[@class=\"footer__links\"]/ul/li[3]"));
        Assert.assertTrue(isElementPresent(By.xpath("//*[@class=\"container-full\"]")));
        getMainPage();

    }

    @Test
    public void footerTest() {
        jumpToFooter();
        click(By.cssSelector("[href=\'/\']"));
        clickedElement("//*[@class=\"footer__links\"]/ul/li[2]");
        System.out.println(clickedElement("//*[@class=\"footer__links\"]/ul/li[2]")
                ? "link to top of page doesn't work"
                : "link to top of page works");
    }

    public boolean clickedElement(String xpathExpression) {
        try {
            wd.findElement(By.xpath(xpathExpression)).click();
            return true;
        } catch (ElementNotInteractableException e) {
            return false;
        }
    }
}


package ilCarro.qa14;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
public class HeaderTest extends TestBase {


    @Test
    public void headerTests(){
        wd.findElement(By.xpath("//*[@class=\"header__nav desktop\"]/li[1]")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//*[@class=\"main-search__sidebar\"]")));
        wd.findElement(By.cssSelector("[href=\'/\']")).click();

        wd.findElement(By.xpath("//*[@class=\"header__nav desktop\"]/li[2]")).click();
        Assert.assertTrue(isElementPresent(By.cssSelector(".let-carwork-style_let_car__description__1xuO3")));
        wd.findElement(By.cssSelector("[href=\'/\']")).click();

        wd.findElement(By.xpath("//*[@class=\"header__nav desktop\"]/li[3]")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//*[@class=\"container-full\"]")));
        wd.get("https://ilcarro-dev-v1.firebaseapp.com/");

        wd.findElement(By.xpath("//*[@class=\"header__nav desktop\"]/li[5]")).click();
        Assert.assertTrue(isElementPresent(By.cssSelector(".signup__registration_title")));
        wd.findElement(By.cssSelector("[href=\'/\']")).click();

    }

}

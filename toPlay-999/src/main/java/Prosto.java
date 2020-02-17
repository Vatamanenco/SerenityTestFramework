import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Prosto {

    @Test
    public void openWebSite() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        Actor sam = Actor.named("Sam");
        sam.can();
        TestDriver.createDriver();

        Thread.sleep(500);
        WebElement webElement = TestDriver.getDriver().findElement(By.xpath("//div[contains(@class,'g-wrap cf')]//li[1]//a[1]"));
        webElement.click();
        TestDriver.closeDriver();
    }

    // driver.findElements(By.cssSelector("body.page.page-index:nth-child(2) div.wrapper:nth-child(6) div.g-wrap.cf:nth-child(2) div.g-wrap section.categoryPage:nth-child(3) div.categoryContent.cf div.category__subCategories ul.column:nth-child(1) li.category__subCategories-group:nth-child(1) > header:nth-child(1)"));
    // webElement.findElement(By.cssSelector("body.page.page-index:nth-child(2) div.wrapper:nth-child(6) div.g-wrap.cf:nth-child(2) div.g-wrap section.categoryPage:nth-child(3) div.categoryContent.cf div.category__subCategories ul.column:nth-child(1) li.category__subCategories-group:nth-child(1) > header:nth-child(1)"));
}

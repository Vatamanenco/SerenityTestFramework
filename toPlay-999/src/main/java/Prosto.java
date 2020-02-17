import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prosto {
    @Test
    public void openWebSite(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://999.md/ru/");
        driver.manage().window().maximize();

     WebElement webElement ;
    // driver.findElements(By.cssSelector("body.page.page-index:nth-child(2) div.wrapper:nth-child(6) div.g-wrap.cf:nth-child(2) div.g-wrap section.categoryPage:nth-child(3) div.categoryContent.cf div.category__subCategories ul.column:nth-child(1) li.category__subCategories-group:nth-child(1) > header:nth-child(1)"));
   // webElement.findElement(By.cssSelector("body.page.page-index:nth-child(2) div.wrapper:nth-child(6) div.g-wrap.cf:nth-child(2) div.g-wrap section.categoryPage:nth-child(3) div.categoryContent.cf div.category__subCategories ul.column:nth-child(1) li.category__subCategories-group:nth-child(1) > header:nth-child(1)"));

    }
}

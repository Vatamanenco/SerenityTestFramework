import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDriver {
    @Managed
WebDriver driver = new ChromeDriver();

Actor sam = Actor.named("Sam");
//sam.can(BrowesTheWeb.with(driver));4
}

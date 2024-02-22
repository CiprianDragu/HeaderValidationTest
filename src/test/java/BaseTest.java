import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import utils.Constants;

public class BaseTest {
    @Test
    public void validateWebsiteColor() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Constants.URL);
        HomePage homePage = new HomePage(driver);
        homePage.validateWebsiteColor();
        String actualColor = driver.findElement(By.xpath("//a[contains(text(),'Qafox.com')]"
        )).getCssValue("color");
        String expectedColor = "rgba(35, 161, 209, 1)";
        Assertions.assertEquals(actualColor, expectedColor);
        homePage.waitInSeconds(3);
        driver.quit();
    }
}

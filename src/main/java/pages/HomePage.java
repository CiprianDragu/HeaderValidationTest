package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'Qafox.com')]")

    WebElement colorText;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void validateWebsiteColor() {
        colorText.click();
    }

}


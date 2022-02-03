package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeGoogle extends BasePage {

    public HomeGoogle(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@name='q' and @title='Поиск']")
    WebElement searchField;

    @FindBy(xpath = "//div[@class='FPdoLc lJ9FBc']//input[@type='submit' and @class='gNO89b']")
    WebElement searchButton;

    public void findAndPressEnter(String keyFind){
        searchField.click();
        searchField.sendKeys(keyFind, Keys.ENTER);
    }
    public void findAndPressButton(String keyFind){
        searchField.click();
        searchField.sendKeys(keyFind);
        searchButton.click();
    }
}

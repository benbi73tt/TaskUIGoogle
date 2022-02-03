package ru.bellintegrator.tests;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;
import pages.HomeGoogle;
import ru.bellintegrator.base.BaseTest;

import static constant.ConstantURL.GOOGLE_PAGE;

public class SearchForGladioli extends BaseTest {
    protected HomeGoogle homeGoogle = PageFactory.initElements(driver, HomeGoogle.class);



    @Feature("Проверка поиска")
    @Test
    public void searchForGladioli(){
        homeGoogle.open("https://www.google.ru/");
        homeGoogle.findAndPressEnter("Гладиолус");
        driver.findElement(By.xpath("//a[contains(@href,'https://ru.wikipedia.org/')]"));


    }
}

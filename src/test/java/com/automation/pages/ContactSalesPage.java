package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ContactSalesPage extends BaseWebPageEntity {

    @FindBy(css = "h1.vs-h1")
    private WebElement pageHeading;

    public ContactSalesPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    protected ExpectedCondition<?> readyCondition() {
        return ExpectedConditions.titleContains("Contact Visa’s Sales Team");
    }

    public String getHeadingText() {
        return getText(pageHeading);
    }

}

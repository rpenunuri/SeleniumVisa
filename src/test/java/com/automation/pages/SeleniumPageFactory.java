package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class SeleniumPageFactory extends PageFactory {
    private final WebDriver webDriver;


    public SeleniumPageFactory(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public HomePage visaHome() {
        return initElements(webDriver, HomePage.class);
    }

    public ContactSalesPage contactSales() {
        return initElements(webDriver, ContactSalesPage.class);
    }
}

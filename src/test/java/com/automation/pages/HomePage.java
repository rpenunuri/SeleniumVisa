package com.automation.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BaseWebPageEntity {

    @FindBy(css = "[data-container-type=tilecontainer] div[data-gtm-card-title=expandableContentTile]")
    private List<WebElement> whatsNewAtVisaTiles;

    @FindBy(css = "div#CookieReportsBanner")
    private WebElement cookiesReportsBanner;

    @FindBy(css = "div.vs-header-util-buttons button[href*='contact-sales']")
    private WebElement contactSalesButton;

    @Override
    protected ExpectedCondition<Boolean> readyCondition() {
        return ExpectedConditions.titleContains("Visa Corporate");
    }

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public HomePage acceptCookies() {
        click(cookiesReportsBanner.findElement(By.linkText("Accept")));
        return this;
    }

    public ContactSalesPage clickContactSalesButton() {
        click(contactSalesButton);
        switchToNewTabWithUrl("contact-sales");
        return page().contactSales();
    }

    public boolean areTileLinksVisibleOnHoverAtTile(int tileIndex) {
        WebElement whatsNewAtVisaTile = whatsNewAtVisaTiles.get(tileIndex);
        mouseOver(whatsNewAtVisaTile);
        return getNumberOfElements(whatsNewAtVisaTile.findElements(By.cssSelector("a"))) > 0;
    }

    public int getAmountOfWhatsNewAtVisaTiles() {
        return getNumberOfElements(whatsNewAtVisaTiles);
    }
}

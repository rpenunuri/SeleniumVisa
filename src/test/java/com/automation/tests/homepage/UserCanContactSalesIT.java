package com.automation.tests.homepage;
import com.automation.pages.ContactSalesPage;
import com.automation.tests.BaseSystemCase;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class UserCanContactSalesIT extends BaseSystemCase {

    @Test
    public void testCase() {
        ContactSalesPage contactSalesPage = goToVisaSite()
                                            .acceptCookies()
                                            .clickContactSalesButton();
        
        assertThat(contactSalesPage.getHeadingText()).isEqualTo("Contact Visa Sales");

    }
}
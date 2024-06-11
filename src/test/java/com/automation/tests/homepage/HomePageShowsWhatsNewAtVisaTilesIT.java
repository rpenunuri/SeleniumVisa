package com.automation.tests.homepage;
import com.automation.pages.HomePage;
import com.automation.tests.BaseSystemCase;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class HomePageShowsWhatsNewAtVisaTilesIT extends BaseSystemCase {

    @Test
    public void testCase() {
        HomePage homePage = goToVisaSite().acceptCookies();

        assertThat(homePage.getAmountOfWhatsNewAtVisaTiles()).isEqualTo(3);
        assertThat(homePage.areTileLinksVisibleOnHoverAtTile(0)).isTrue();
        assertThat(homePage.areTileLinksVisibleOnHoverAtTile(1)).isTrue();
        assertThat(homePage.areTileLinksVisibleOnHoverAtTile(2)).isTrue();
    }
}

package asicsoutlet.tests;

import asicsoutlet.pages.RunnersShoeFindPage;
import org.testng.annotations.Test;

public class RunnerShoesFindTest extends BaseTest {
    @Test
    public void findRunnerShoes() {
        RunnersShoeFindPage runnersShoeFindPage = new RunnersShoeFindPage(driver);
        String homePage = "https://outlet.asics.com/";
        driver.get(homePage);
        runnersShoeFindPage.setAcceptCookiesButton();
        runnersShoeFindPage.pointMezczyzniCategory();
        runnersShoeFindPage.clickBieganieCategory();
        runnersShoeFindPage.clickRozmiarEUCategory();
        runnersShoeFindPage.clicksize();
        runnersShoeFindPage.getShoesCount();
    }
}

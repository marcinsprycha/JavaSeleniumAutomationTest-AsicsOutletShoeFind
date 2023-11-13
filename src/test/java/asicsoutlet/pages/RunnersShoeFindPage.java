package asicsoutlet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;

public class RunnersShoeFindPage {
    @FindBy(css = ".banner-actions-container #onetrust-reject-all-handler")
    private WebElement acceptCookiesButton;

    @FindBy(css = "a[data-cgid='AO10000000']")
    private WebElement mezczyzniLink;

    @FindBy(css= "a[data-cgid='AO10201000']")
    private WebElement bieganieLink;

    @FindBy(css = "div#secondary div.refinements__title.refinement.sizeEU")
    private WebElement rozmiarEuButton;

    @FindBy(css="ul.refinements__list--expanded a[data-wa-event-label='49']")
    private WebElement rozmiarcheck;

    @FindBy (css = "div.search-result-content")
    private WebElement resultDiv;

    @FindBy(css = "ul#search-result-items")
    private WebElement shoeList;

    @FindBy(css = "ul.search-result-items.tiles-container.clearfix.hide-compare.ajax")
    private WebElement resultUlList;

    @FindBy (css = "li[data-index-tile]")
    private List<WebElement> shoeLiElements;

    @FindBy(css = "div.pagination a.small-reg")

    private List<WebElement> shoePagesNumber;

    private WebDriver driver;

    SoftAssert softAssert = new SoftAssert();

    public RunnersShoeFindPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }



    public void setAcceptCookiesButton(){
        acceptCookiesButton.click();
    }

    public void pointMezczyzniCategory(){
        Actions actions = new Actions(driver);
        actions.moveToElement(mezczyzniLink).perform();
    }

    public void clickBieganieCategory(){
        softAssert.assertTrue(bieganieLink.isDisplayed());
        bieganieLink.click();
    }

    public void clickRozmiarEUCategory(){
        softAssert.assertTrue(rozmiarEuButton.isDisplayed());
        rozmiarEuButton.click();
    }

    public void clicksize(){
        Assert.assertTrue(rozmiarcheck.isDisplayed());
        rozmiarcheck.click();
    }
    public void getShoesCount(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20) );
        wait.until(ExpectedConditions.visibilityOf(resultUlList));

        System.out.println("Na tej stronie butów jest:  " + shoeLiElements.size());
        System.out.println("I jest jeszcze "+ (shoePagesNumber.size()) + " stron z wynikami wyszukiwania");

    }

}

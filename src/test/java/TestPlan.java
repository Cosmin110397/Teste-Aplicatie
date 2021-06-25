import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestPlan {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }
    @Test(testName = "1Search email")
    public static void searchEmail() {
        driver.get(Utils.BASE_URL);
        HomePage webForm = new HomePage(driver);
        webForm.populateEmailBar();
        webForm.searchItemUsingButton();
    }
    @Test(testName = "2Search read more learning")
    public static void searchReadMoreLearning() {
        driver.get(Utils.BASE_URL);
        HomePage webForm = new HomePage(driver);
        webForm.searchReadMoreLearning();
    }
    @Test(testName = "3Search twitter 1st instructor")
    public static void searchTwitter() {
        driver.get(Utils.BASE_URL);
        HomePage webForm = new HomePage(driver);
        webForm.searchTwitterInstructor();
    }

    @Test(testName = "4Open first response to question")
    public static void setOpenFirstQuestion() {
        driver.get(Utils.BASE_URL);
        HomePage webForm = new HomePage(driver);
        webForm.setOpenFirstQuestion();

    }

    @Test(testName = "5Arrow to send me up")
    public static void sendMeUpNow() {
        driver.get(Utils.BASE_URL);
        HomePage webForm = new HomePage(driver);
        webForm.setSendMeUp();
    }

    @Test(testName = "6Populate 1stPageData")
    public static void writeMy1Data() {
        driver.get(Utils.BASE_URL);
        HomePage homePage = new HomePage(driver);
        AccountPage webForm = new AccountPage(driver);
        homePage.enterEnrollmentPage();
        webForm.populateUserName();
        webForm.populateFirstName();
        webForm.populateLastName();
        webForm.populatePasswordBar();
        webForm.populatePasswordBar2();
        webForm.nextPageQuestions();
    }

   @Test(testName = "7Previous Page")
    public static void previousPageNavigate() {
        driver.get(Utils.BASE_URL);
        HomePage homePage = new HomePage(driver);
        AccountPage webForm = new AccountPage(driver);
        homePage.enterEnrollmentPage();
        webForm.populateUserName();
        webForm.populateFirstName();
        webForm.populateLastName();
        webForm.populatePasswordBar();
        webForm.populatePasswordBar2();
        webForm.nextPageQuestions();
        Utils.waitForElementToLoad(3);
        webForm.goToPreviousPage();
        Utils.waitForElementToLoad(3);
        Assert.assertEquals(webForm.getAccountInfo(), "Personal information");
    }

    @Test(testName = "8Press learn after scrolling down")
    public static void learnAfterScroll() {
        driver.get(Utils.BASE_URL);
        HomePage webForm = new HomePage(driver);
        Utils.waitForElementToLoad(1);
        webForm.clickOnInstructor();
        Assert.assertEquals(webForm.getInstructorsText(), "Our Instructors");
    }

    @Test(testName = "9Card info settings")
    public static void cardInfoPage() {
        driver.get(Utils.BASE_URL);
        HomePage homePage = new HomePage(driver);
        AccountPage webForm = new AccountPage(driver);
        homePage.enterEnrollmentPage();
        Utils.waitForElementToLoad(2);
        webForm.populateUserName();
        webForm.populateFirstName();
        webForm.populateLastName();
        webForm.populatePasswordBar();
        webForm.populatePasswordBar2();
        webForm.nextPageQuestions();
        Utils.waitForElementToLoad(2);
        webForm.populateMailBar();
        webForm.populatePhone();
        webForm.populateCountry();
        webForm.populateCity();
        webForm.populatePostCode();
        webForm.clickNextAccountInfo();
        Utils.waitForElementToLoad(2);
        webForm.clickNextEnrollmentButton();//spre validare card
        Utils.waitForElementToLoad(2);
        webForm.populateNameCard();
        webForm.populateCardNumber();
        webForm.populateCVCCode();
        webForm.clickMonthButton();
        webForm.clickMarch();
        webForm.clickYearButton();
        webForm.click2024Year();
        webForm.populateCVCCode();
        webForm.scrollingToNext();
        Utils.waitForElementToLoad(2);
        webForm.scrollingHomePage();
        Assert.assertEquals(homePage.getText(), "Certified Software Tester");

    }

    @Test(testName = "10Completare fara PostCode")
    public static void completingWithoutPC() {
        driver.get(Utils.BASE_URL);
        HomePage homePage = new HomePage(driver);
        AccountPage webForm = new AccountPage(driver);
        homePage.enterEnrollmentPage();
        Utils.waitForElementToLoad(2);
        webForm.populateUserName();
        webForm.populateFirstName();
        webForm.populateLastName();
        webForm.populatePasswordBar();
        webForm.populatePasswordBar2();
        webForm.nextPageQuestions();
        Utils.waitForElementToLoad(2);
        webForm.populateMailBar();
        webForm.populatePhone();
        webForm.populateCountry();
        webForm.populateCity();
        webForm.clickNextAccountInfo();
        Assert.assertEquals(webForm.getErrorText(), "Postcode required");
    }

    @Test(testName = "11Verificare careu rosu cu email valid")//must fail
    public static void checkingRedMarginsValid() {
        driver.get(Utils.BASE_URL);
        HomePage homePage = new HomePage(driver);
        homePage.findTextSus();
        homePage.populateEmailBar();
        //homePage.populateEmailBarFail();
        homePage.clickOnSubmit();
        Assert.assertEquals(homePage.getTextCheckMail(), "Sign Up For Our Newsletter");
    }

    @Test(testName = "12Verificare careu rosu cu email invalid")//must pass
    public static void checkingRedMarginsInvalid() {
        driver.get(Utils.BASE_URL);
        HomePage homePage = new HomePage(driver);
        homePage.findTextSus();
        //homePage.populateEmailBar();
        homePage.populateEmailBarFail();
        homePage.clickOnSubmit();
        Assert.assertEquals(homePage.getTextCheckMail(), "Sign Up For Our Newsletter");
    }

    @AfterSuite
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}

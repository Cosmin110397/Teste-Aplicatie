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
    @Test(testName = "1 Check number phone")
    public static void checkNumberPhone() {
        driver.get(Utils.BASE_URL);
        HomePage webForm = new HomePage(driver);
        webForm.scrollToContact();
        Assert.assertEquals(webForm.scrollToContact(),"Student Email: student@test-software-student.com");
    }
    @Test(testName = "2 Search read more Selenium")
    public static void searchReadMoreSelenium() {
        driver.get(Utils.BASE_URL);
        HomePage webForm = new HomePage(driver);
        FundamentalsPage webPage = new FundamentalsPage(driver);
        webForm.searchReadMoreSelenium();
        Utils.waitForElementToLoad(2);
        Assert.assertEquals(webPage.getFundamentalsText(), "Fundamentals page");
        webPage.clickReturnFromFundamentals();
        Assert.assertEquals(webForm.verifyIfIAmOnHomePage(),"Certified Software Tester");
    }
    @Test(testName = "3 Search twitter 1st instructor")
    public static void searchTwitter() {
        driver.get(Utils.BASE_URL);
        HomePage webForm = new HomePage(driver);
        webForm.searchTwitterInstructor();
    }
    @Test(testName = "4 Open first response to question")
    public static void setOpenFirstQuestion() {
        driver.get(Utils.BASE_URL);
        HomePage webForm = new HomePage(driver);
        webForm.setOpenFirstQuestion();
    }
    @Test(testName = "5 Arrow to send me up")
    public static void sendMeUpNow() {
        driver.get(Utils.BASE_URL);
        HomePage webForm = new HomePage(driver);
        webForm.setSendMeUp();
    }
    @Test(testName = "6 Populate Personal Information")
    public static void writeMy1Data() {
        driver.get(Utils.BASE_URL);
        PageNavigation pageNavigation = new PageNavigation(driver);
        pageNavigation.navigateToStep(PageNavigation.NavigationStep.StepOne);
    }
   @Test(testName = "7 Previous Page Second Page")
    public static void previousPageNavigate() {
        driver.get(Utils.BASE_URL);
        AccountPage webForm = new AccountPage(driver);
        PageNavigation pageNavigation = new PageNavigation(driver);
        pageNavigation.navigateToStep(PageNavigation.NavigationStep.StepOne);
        Utils.waitForElementToLoad(3);
        webForm.goToPreviousPage();
        Utils.waitForElementToLoad(3);
        Assert.assertEquals(webForm.getContactInfo(), "Personal information");
    }
    @Test(testName = "8 Instructors button gets me to instructors")
    public static void instructorsButton() {
        driver.get(Utils.BASE_URL);
        HomePage webForm = new HomePage(driver);
        Utils.waitForElementToLoad(1);
        webForm.clickOnInstructor();
        Assert.assertEquals(webForm.getInstructorsText(), "Our Instructors");
    }
    @Test(testName = "9 Completing all data")
    public static void completingAllData() {
        driver.get(Utils.BASE_URL);
        HomePage homePage = new HomePage(driver);
        PageNavigation pageNavigation = new PageNavigation(driver);
        pageNavigation.navigateToStep(PageNavigation.NavigationStep.StepFive);
        Assert.assertEquals(homePage.getText(), "Certified Software Tester");
    }
    @Test(testName = "10 Completare fara PostCode")
    public static void completingWithoutPC() {
        driver.get(Utils.BASE_URL);
        HomePage homePage = new HomePage(driver);
        AccountPage webForm = new AccountPage(driver);
        PageNavigation pageNavigation = new PageNavigation(driver);
        pageNavigation.navigateToStep(PageNavigation.NavigationStep.StepOne);
        Utils.waitForElementToLoad(2);
        webForm.populateMailBar();
        webForm.populatePhone();
        webForm.populateCountry();
        webForm.populateCity();
        webForm.clickNextAccountInfo();
        Assert.assertEquals(webForm.getErrorText(), "Postcode required");
    }
    @Test(testName = "11 Verificare Newsletter cu email valid")//must fail
    public static void checkingNewsletterValid() {
        driver.get(Utils.BASE_URL);
        HomePage homePage = new HomePage(driver);
        homePage.findTextSus();
        homePage.populateEmailBar();
        homePage.clickOnSubmit();
        Assert.assertEquals(homePage.getTextCheckMail(), "Sign Up For Our Newsletter");
    }
    @Test(testName = "12 Verificare Newsletter cu email invalid")//must pass
    public static void checkingNewsletterInvalid() {
        driver.get(Utils.BASE_URL);
        HomePage homePage = new HomePage(driver);
        homePage.findTextSus();
        homePage.populateEmailBarFail();
        homePage.clickOnSubmit();
        Assert.assertEquals(homePage.getTextCheckMail(), "Sign Up For Our Newsletter");
    }
    @Test(testName = "13 Completing all data without CVC code")
    public static void completingAllDataWithoutCVC() {
        driver.get(Utils.BASE_URL);
        AccountPage webForm = new AccountPage(driver);
        PageNavigation pageNavigation = new PageNavigation(driver);
        pageNavigation.navigateToStep(PageNavigation.NavigationStep.StepThree);
        Utils.waitForElementToLoad(2);
        webForm.populateNameCard();
        webForm.populateCardNumber();
        webForm.clickMonthButton();
        webForm.clickMarch();
        webForm.clickYearButton();
        webForm.click2024Year();
        webForm.scrollingToNext();
        Assert.assertEquals(webForm.requireCVCCode(), "CVC required");
        }
    @Test(testName = "14 Virtual learn")
    public static void searchVirtualLearn() {
        driver.get(Utils.BASE_URL);
        HomePage webForm = new HomePage(driver);
        VirtualPage webVirtual = new VirtualPage(driver);
        webForm.virtualPage();
        Utils.waitForElementToLoad(2);
        Assert.assertEquals(webVirtual.getVirtualText(), "Virtual");
        webVirtual.clickReturnFromVirtual();
        Assert.assertEquals(webForm.verifyIfIAmOnHomePage(), "Certified Software Tester");
    }
    @AfterSuite
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}

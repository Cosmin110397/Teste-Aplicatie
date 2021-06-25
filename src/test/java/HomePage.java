import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObject{

    private final String OBJECT_NAME = "cosmin_popica_97@yahoo.com";
    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement objectName;

    private final String OBJECT_NAME_2 = "cosmin_popica_97";
    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement objectNameFail;

    @FindBy(xpath = "//*[@id=\"learn-selenium\"]/div/div/div[1]/a")
    private WebElement readMoreLearning;

    @FindBy(xpath = "//*[@id=\"learn-selenium\"]/div/div/div[1]/h2")
    private WebElement learnSeleniumText;

    @FindBy(xpath = "/html/body/section[1]/div/div/div/p")
    private WebElement textSus;

    @FindBy(xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement startEnrollment;

    @FindBy(xpath = "//*[@id=\"instructors\"]/div/div/div[1]/div/div/h3")
    private WebElement screenIconTweet;
    @FindBy(xpath = "//*[@id=\"instructors\"]/div/div/div[1]/div/div/a[1]/i")
    private WebElement twitterIcon1stInstructor;

    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement emailButton;

    @FindBy(xpath = "/html/body/section[2]/div/div/div/button")
    private WebElement submitButton;

    @FindBy(xpath = "//*[@id=\"questions\"]/div[1]/h3/button")
    private WebElement openFirstQuestion;

    @FindBy(xpath = "/html/body/footer/div/a/i")
    private WebElement sendMeUp;

    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[3]/a")
    private WebElement instructorButton;

    @FindBy(xpath = "//*[@id=\"instructors\"]/div/h2")
    private WebElement textInstructor;

    @FindBy(xpath = "//*[@id=\"questions\"]/div/h2")
    private WebElement questionsText;

    @FindBy(xpath = "/html/body/section[1]/div/div/div/h1/span")
    private WebElement textHomePage;

    @FindBy(xpath = "/html/body/section[2]/div/div/h3")
    private WebElement textCheckValidEmail;

    public String getText() { return this.textHomePage.getText(); }

    public String getTextCheckMail() {return this.textCheckValidEmail.getText(); }


    public void populateEmailBar() {
        this.objectName.sendKeys(OBJECT_NAME);
    }
    public void populateEmailBarFail() {this.objectNameFail.sendKeys(OBJECT_NAME_2);}

    public void searchItemUsingButton() {
        this.emailButton.click();
    }
    public void enterEnrollmentPage() {Utils.scrollToElement(driver, textSus);
        this.startEnrollment.click();}
    public void searchReadMoreLearning() {Utils.scrollToElement(driver, learnSeleniumText);
        this.readMoreLearning.click(); }
    public void searchTwitterInstructor() { Utils.scrollToElement(driver, screenIconTweet);
        twitterIcon1stInstructor.click();}
    public void findTextSus() {Utils.scrollToElement(driver, textSus);
        this.emailButton.click();}

    public void clickOnSubmit() {this.submitButton.click();}
    public void clickOnInstructor() {this.instructorButton.click(); }

    public String getInstructorsText() { return this.textInstructor.getText(); }

    public void setOpenFirstQuestion() { Utils.scrollToElement(driver, questionsText);
        this.openFirstQuestion.click();}

    public void setSendMeUp() { Utils.scrollToElement(driver, this.sendMeUp);
        this.sendMeUp.click();}

    public HomePage(WebDriver driver) { super(driver); }
}

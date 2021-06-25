import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;

    public class AccountPage extends PageObject {

        private final String FIRSTNAME = "Cosmin";
        @FindBy(xpath = "//*[@id=\"firstName\"]")
        private WebElement firstName;

        private final String PHONE = "0761337954";
        @FindBy(xpath = "//*[@id=\"phone\"]")
        private WebElement phoneNr;

        @FindBy(xpath = "//*[@id=\"phone\"]")
        private WebElement ePhoneNr;

        private final String COUNTRY = "Romania";
        @FindBy(xpath = "//*[@id=\"country\"]")
        private WebElement country;

        @FindBy(xpath = "//*[@id=\"country\"]")
        private WebElement eCountry;

        private final String CITY = "Brasov";
        @FindBy(xpath = "//*[@id=\"city\"]")
        private WebElement city;

        @FindBy(xpath = "//*[@id=\"city\"]")
        private WebElement eCity;

        private final String POSTCODE = "500052";
        @FindBy(xpath = "//*[@id=\"postCode\"]")
        private WebElement postCode;

        @FindBy(xpath = "//*[@id=\"postCode\"]")
        private WebElement ePostCode;

        private final String LASTNAME = "Popica";
        @FindBy(xpath = "//*[@id=\"lastName\"]")
        private WebElement lastName;

        private final String ADRESA_MAIL = "cosmin_popica_97@yahoo.com";
        @FindBy(xpath = "//*[@id=\"email\"]")
        private WebElement adresaMail;

        private final String PASSWORD2 = "987654321";
        @FindBy(xpath = "//*[@id=\"password\"]")
        private WebElement passWord;

        private final String PASSWORD = "123456789";
        @FindBy(xpath = "//*[@id=\"cpassword\"]")
        private WebElement passWord2;

        private final String USERNAME = "cosmin123456";
        @FindBy(xpath = "//*[@id=\"username\"]")
        private WebElement userName;

        @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/h3")
        private WebElement accountInfo;

        @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/button[1]")
        private WebElement previousPage;

        @FindBy(xpath = "//*[@id=\"password\"]")
        private WebElement pasWord;

        @FindBy(xpath = "//*[@id=\"cpassword\"]")
        private WebElement rePassWord;

        @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
        private WebElement butonNext;

        @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/button[2]")
        private WebElement nextButtonAccount;

        @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/button[2]")
        private WebElement nextEnrollmentButton;

        @FindBy(xpath = "//*[@id=\"month\"]")
        private WebElement monthButton;

        @FindBy(xpath = "//*[@id=\"month\"]/option[4]")
        private WebElement marchSelect;

        @FindBy(xpath = "//*[@id=\"year\"]")
        private WebElement yearButton;

        @FindBy(xpath = "//*[@id=\"year\"]/option[5]")
        private WebElement yearSelect;

        @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[1]/input")
        private WebElement cardNumberField;

        private final String CARDNUMBER = "123456781234567812345678";
        @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[1]/input")
        private WebElement cardNr;

        @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[2]/input")
        private WebElement CVCField;

        private final String CVCCODE = "456";
        @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[2]/input")
        private WebElement cvcCode;

        @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[2]/input")
        private WebElement nameCardField;

        private final String NAMECARD = "POPICA COSMIN FLORIN";
        @FindBy(xpath = "//*[@id=\"step4\"]/div/input")
        private WebElement nameCardProp;

        @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[4]/button[2]")
        private WebElement validateCard;

        //@FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[4]/button[2]")
        //private WebElement backToHome;

        @FindBy(xpath = "/html/body/div/div/section/div/form/div[5]/a")
        private WebElement backToHomePage;

        @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/div[5]/div")
        private WebElement errorCompletion;

        public void populateCardNumber() { this.cardNumberField.sendKeys(CARDNUMBER); }

        public void populateLastName() {this.lastName.sendKeys(LASTNAME);}

        public void populateFirstName() {this.firstName.sendKeys(FIRSTNAME);}

        public void click2024Year() {this.yearSelect.click();}

        public void populatePhone() {this.ePhoneNr.sendKeys(PHONE);}

        public void populateCountry() {this.eCountry.sendKeys(COUNTRY);}

        public void populateCity() {this.eCity.sendKeys(CITY);}

        public void populatePostCode() {this.ePostCode.sendKeys(POSTCODE);}

        public void populateUserName() { this.userName.sendKeys(USERNAME); }

        public void populateCVCCode() { this.CVCField.sendKeys(CVCCODE); }

        public void populateMailBar() { this.adresaMail.sendKeys(ADRESA_MAIL); }

        public void populatePasswordBar() { this.pasWord.sendKeys(PASSWORD); }

        public void clickYearButton() {this.yearButton.click();}

        public void populatePasswordBar2() { this.rePassWord.sendKeys(PASSWORD2); }

        public void clickNextAccountInfo() {this.nextButtonAccount.click();}

        public void clickNextEnrollmentButton() {this.nextEnrollmentButton.click();}

        public String getAccountInfo() { return this.accountInfo.getText(); }

        public String getErrorText() {return this.errorCompletion.getText(); }

        public void populateNameCard() { this.nameCardField.sendKeys(NAMECARD); }

        public void clickMarch() {this.marchSelect.click();}

        public void goToPreviousPage() { Utils.scrollToElement(driver, previousPage);
            this.previousPage.click(); }

        public void scrolling() { Utils.scrollToElement(driver,validateCard);
        this.validateCard.click();}

        public void scrollingHomePage() { Utils.scrollToElement(driver,backToHomePage);
            this.backToHomePage.click();}

        public void clickMonthButton() {this.monthButton.click();}

        public void scrollingToNext() {Utils.scrollToElement(driver, validateCard);
        this.validateCard.click();}

        public void nextPageQuestions() { Utils.scrollToElement(driver, butonNext);
            this.butonNext.click(); }

        public AccountPage(WebDriver driver) { super(driver); }

    }

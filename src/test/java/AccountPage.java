import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;

    public class AccountPage extends PageObject {

        private final String FIRSTNAME = "Cosmin";
        @FindBy(xpath = "//*[@id=\"firstName\"]")
        private WebElement firstName;

        private final String LASTNAME = "Popica";
        @FindBy(xpath = "//*[@id=\"lastName\"]")
        private WebElement lastName;

        private final String USERNAME = "cosmin123456";
        @FindBy(xpath = "//*[@id=\"username\"]")
        private WebElement userName;

        private final String PASSWORD = "987654321";
        @FindBy(xpath = "//*[@id=\"password\"]")
        private WebElement password;

        private final String CONFIRMPASSWORD = "123456789";
        @FindBy(xpath = "//*[@id=\"cpassword\"]")
        private WebElement confirmPassword;

        @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
        private WebElement butonFirstNext;

        private final String ADRESA_MAIL = "cosmin_popica_97@yahoo.com";
        @FindBy(xpath = "//*[@id=\"email\"]")
        private WebElement adresaMail;

        private final String PHONE = "0761337954";
        @FindBy(xpath = "//*[@id=\"phone\"]")
        private WebElement phoneNr;

        private final String COUNTRY = "Romania";
        @FindBy(xpath = "//*[@id=\"country\"]")
        private WebElement country;

        private final String CITY = "Brasov";
        @FindBy(xpath = "//*[@id=\"city\"]")
        private WebElement city;

        private final String POSTCODE = "500052";
        @FindBy(xpath = "//*[@id=\"postCode\"]")
        private WebElement postCode;

        @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/button[2]")
        private WebElement nextToChooseClassesButton;

        @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/h3")
        private WebElement contactInfo;

        @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/button[1]")
        private WebElement previousPageToPersonalInformation;

        @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/button[2]")
        private WebElement nextToCardButton;

        @FindBy(xpath = "//*[@id=\"month\"]")
        private WebElement monthButton;

        @FindBy(xpath = "//*[@id=\"month\"]/option[4]")
        private WebElement marchSelect;

        @FindBy(xpath = "//*[@id=\"year\"]")
        private WebElement yearButton;

        @FindBy(xpath = "//*[@id=\"year\"]/option[5]")
        private WebElement yearSelect;

        private final String CARDNUMBER = "123456781234567812345678";
        @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[1]/input")
        private WebElement cardNr;

        private final String CVCCODE = "456";
        @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[2]/input")
        private WebElement cvcCode;

        private final String NAMECARD = "POPICA COSMIN FLORIN";
        @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[2]/input")
        private WebElement nameCardPerson;

        @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[4]/button[2]")
        private WebElement validateCard;

        @FindBy(xpath = "/html/body/div/div/section/div/form/div[5]/a")
        private WebElement backToHomePage;

        @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/div[5]/div")
        private WebElement errorCompletion;

        @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[2]/div")
        private WebElement CVCRequired;

        public void populateCardNumber() { this.cardNr.sendKeys(CARDNUMBER); }

        public void populateLastName() {this.lastName.sendKeys(LASTNAME);}

        public void populateFirstName() {this.firstName.sendKeys(FIRSTNAME);}

        public void click2024Year() {this.yearSelect.click();}

        public void populatePhone() {this.phoneNr.sendKeys(PHONE);}

        public void populateCountry() {this.country.sendKeys(COUNTRY);}

        public void populateCity() {this.city.sendKeys(CITY);}

        public void populatePostCode() {this.postCode.sendKeys(POSTCODE);}

        public void populateUserName() { this.userName.sendKeys(USERNAME); }

        public void populateCVCCode() { this.cvcCode.sendKeys(CVCCODE); }

        public void populateMailBar() { this.adresaMail.sendKeys(ADRESA_MAIL); }

        public void populatePasswordBar() { this.password.sendKeys(PASSWORD); }

        public void clickYearButton() {this.yearButton.click();}

        public void populateConfirmPasswordBar() { this.confirmPassword.sendKeys(CONFIRMPASSWORD); }

        public void clickNextAccountInfo() {this.nextToChooseClassesButton.click();}

        public void clickNextEnrollmentButton() {this.nextToCardButton.click();}

        public String getContactInfo() { return this.contactInfo.getText(); }

        public String getErrorText() {return this.errorCompletion.getText(); }

        public String requireCVCCode() {return this.CVCRequired.getText();}

        public void populateNameCard() { this.nameCardPerson.sendKeys(NAMECARD); }

        public void clickMarch() {this.marchSelect.click();}

        public void goToPreviousPage() { Utils.scrollToElement(driver, previousPageToPersonalInformation);
            this.previousPageToPersonalInformation.click(); }

        public void scrollingHomePage() { Utils.scrollToElement(driver,backToHomePage);
            this.backToHomePage.click();}

        public void clickMonthButton() {this.monthButton.click();}

        public void scrollingToNext() {Utils.scrollToElement(driver, validateCard);
        this.validateCard.click();}

        public void nextPageQuestions() { Utils.scrollToElement(driver, butonFirstNext);
            this.butonFirstNext.click(); }

        public AccountPage(WebDriver driver) { super(driver); }

    }

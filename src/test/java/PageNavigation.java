import org.openqa.selenium.WebDriver;

public class PageNavigation {
    private static  WebDriver driver;

    public PageNavigation(WebDriver driver) {
        this.driver = driver;
    }

    enum NavigationStep {
        StepOne,
        StepTwo,
        StepThree,
        StepFour,
        StepFive
    }

    public void navigateToStep(NavigationStep step) {
        switch(step){
            case StepOne:
                navigateToPersonalInformation();
                break;
            case StepTwo:
                navigateToPersonalInformation();
                navigateToContactInformation();
                break;
            case StepThree:
                navigateToPersonalInformation();
                navigateToContactInformation();
                navigateToSelectionClasses();
                break;
            case StepFour:
                navigateToPersonalInformation();
                navigateToContactInformation();
                navigateToSelectionClasses();
                navigateToCardInfo();
                break;
            case StepFive:
                navigateToPersonalInformation();
                navigateToContactInformation();
                navigateToSelectionClasses();
                navigateToCardInfo();
                navigateToReturnHomeButton();
                break;
        }
    }

    private void navigateToPersonalInformation() {
        HomePage form = new HomePage(driver);
        form.enterEnrollmentPage();
        AccountPage formulary = new AccountPage(driver);
        formulary.populateFirstName();
        formulary.populateLastName();
        formulary.populateUserName();
        formulary.populatePasswordBar();
        formulary.populateConfirmPasswordBar();
        formulary.nextPageQuestions();
    }
    private void navigateToContactInformation() {
        AccountPage form = new AccountPage(driver);
        form.populateMailBar();
        form.populatePhone();
        form.populateCountry();
        form.populateCity();
        form.populatePostCode();
        form.clickNextAccountInfo();
    }
    private void navigateToSelectionClasses() {
        AccountPage form = new AccountPage(driver);
        form.clickNextEnrollmentButton();
    }
    private void navigateToCardInfo() {
        AccountPage form = new AccountPage(driver);
        form.populateNameCard();
        form.populateCardNumber();
        form.populateCVCCode();
        form.click2024Year();
        form.clickMarch();
        form.scrollingToNext();
    }
    private void navigateToReturnHomeButton() {
        AccountPage form = new AccountPage(driver);
        form.scrollingHomePage();
    }
}

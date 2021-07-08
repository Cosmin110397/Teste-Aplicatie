import org.openqa.selenium.WebDriver;

public class PageNavigation {
    enum NavigationStep {
        StepOne,
        StepTwo, StepThree, StepFour, StepFive}
WebDriver driver;
    public void NavigateToStep(NavigationStep step) {
        switch(step){
            case NavigationStep.StepOne:
                navigateToPersonalInformation();
                break;
            case NavigationStep.StepTwo:
                navigateToPersonalInformation();
                navigateToContactInformation();
                break;
            case NavigationStep.StepThree:
                navigateToContactInformation();
                navigateToSelectionClasses();
                break;
            case NavigationStep.StepFour:
                navigateToSelectionClasses();
                navigateToCardInfo();
                break;
            case NavigationStep.StepFive:
                navigateToCardInfo();
                navigateToReturnHomeButton();
                break;
        }
    }

    public void navigateToPersonalInformation() {
        HomePage form = new HomePage(driver);
        form.enterEnrollmentPage();
        AccountPage form = new AccountPage(driver);
        form.populateFirstName();
        form.populateLastName();
        form.populateUserName();
        form.populatePasswordBar();
        form.populateConfirmPasswordBar();
        form.nextPageQuestions();
    }
    public void navigateToContactInformation() {
        AccountPage form = new AccountPage(driver);
        form.populateMailBar();
        form.populatePhone();
        form.populateCountry();
        form.populateCity();
        form.populatePostCode();
        form.clickNextAccountInfo();
    }
    public void navigateToSelectionClasses() {
        AccountPage form = new AccountPage(driver);
        form.clickNextEnrollmentButton();
    }
    public void navigateToCardInfo() {
        AccountPage form = new AccountPage(driver);
        form.populateNameCard();
        form.populateCardNumber();
        form.populateCVCCode();
        form.click2024Year();
        form.clickMarch();
        form.scrollingToNext();
    }
    public void navigateToReturnHomeButton() {
        AccountPage form = new AccountPage(driver);
        form.scrollingHomePage();
    }
}

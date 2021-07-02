import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;

public class FundamentalsPage extends PageObject {

    @FindBy(xpath = "/html/body/h1")
    private WebElement fundamentalsPageText;

    @FindBy(xpath = "/html/body/a")
    private WebElement returnFromFundamentals;

    public String getFundamentalsText() { return this.fundamentalsPageText.getText(); }

    public void clickReturnFromFundamentals() {this.returnFromFundamentals.click();}

    public FundamentalsPage(WebDriver driver) { super(driver); }

}
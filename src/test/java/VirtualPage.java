import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;

public class VirtualPage extends PageObject {


    @FindBy(xpath = "/html/body/h1")
    private WebElement virtualPageText;

    @FindBy(xpath = "/html/body/a")
    private WebElement virtualReturn;

    public String getVirtualText() { return this.virtualPageText.getText(); }

    public void clickReturnFromVirtual() {this.virtualReturn.click();}

    public VirtualPage(WebDriver driver) { super(driver); }

}
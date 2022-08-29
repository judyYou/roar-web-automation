package pageobject;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class Login_PO   {


    @FindBy(id = "username")
    public WebElement username;
}

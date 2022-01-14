package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath = "//img[@alt=\"Kite\"]") private WebElement logo;
	@FindBy(xpath = "//*[@id=\"container\"]/div/div/div/form/div[1]/h2") private WebElement text;
	@FindBy(xpath = "//input[@type=\"text\"]") private WebElement userID;
	@FindBy(xpath = "//input[@id=\"password\"]") private WebElement password;
	@FindBy(xpath = "//button[@type=\"submit\"]") private WebElement summit;
	@FindBy(xpath = "//a[text()=\"Forgot password?\"]") private WebElement forgot;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String userName) {
		userID.sendKeys(userName);
	}
	
	public void enterPassword(String Pass) {
		password.sendKeys(Pass);
	}
	
	public void clickOnLogin() {
		summit.click();
	}
}

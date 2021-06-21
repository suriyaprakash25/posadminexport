package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpageobjects  {
	
	@FindBy(xpath = "//*[@id=\'js_login-form\']/div[2]/input")
	public static WebElement username;
	@FindBy(xpath = "//*[@id=\'js_login-form\']/div[3]/div/input")
	public static WebElement password;
	@FindBy(xpath = "//*[@id=\'js_login\']")
	public static WebElement loginbutton;
	

}

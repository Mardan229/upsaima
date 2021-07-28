package Ups.pageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.service.DriverService;
import org.openqa.selenium.support.PageFactory;

import Ups.LoginPageElements.UpsLoginPageElements;
import Ups.Utilities.browser;

public class UpsLoginPageAction {
	
UpsLoginPageElements LoginElements;

public	UpsLoginPageAction() {
	this.LoginElements = new UpsLoginPageElements();
PageFactory.initElements(browser.chromeDriver, LoginElements);
}
	
public void getUpsLoginPage() {
	browser.chromeDriver.get("https://www.ups.com/lasso/login?");
	browser.chromeDriver.manage().window().maximize();
	browser.chromeDriver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
	
}
	

}

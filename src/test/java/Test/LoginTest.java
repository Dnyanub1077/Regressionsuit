package Test;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.LoginPage;
import Pojo.LaunchBrowser;
import Utilities.Parametrization;
import Utilities.ScreenShot;
@Listeners(AutomationTest.Listeners.class)

public class LoginTest {

	WebDriver driver;
	static Logger log = Logger.getLogger(LoginTest.class.getName());
	
	public WebDriver baseTest() {
		return driver;
	}
	
	@BeforeMethod
	public void OpenBrowser() {
		 driver = LaunchBrowser.launchBrowser();
		
	}
	
	@Test
	public void loginToZerodhaWithVaildCredetials() throws EncryptedDocumentException, IOException, InterruptedException {
		LoginPage pom = new LoginPage(driver);		
//		log.info("Jay Hanuman Test Started");

		String userName = Parametrization.getData("Findit1", 0, 0);
		pom.enterUserName(userName);
//		log.info("Test is pass");
		String passWord = Parametrization.getData("Findit1", 0, 1);
		pom.enterPassword(passWord);
//		log.info("password test is pass");
		pom.clickOnLogin();
//		log.info("Test is pass");
//		int a = 100;
//		if(a<190) {
//			log.info("a is smaller then 190");
//		}else {
//			log.info("a is bigger then 190");
//		}
	}
	@Test(timeOut = 1000)
	public void loginToZerodhaWithCredetials() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("hello hi");
//		log.info("secound test is pass");
	}
	
	@Test(dependsOnMethods = "loginToZerodhaWithCredetials" )
	public void login() {
		System.out.println("test is login");
	}
//	@AfterMethod
//	public void resultFiled() throws IOException {
//		ScreenShot.takeScreenShot(driver);
////		log.info("screenshot is click");
//		driver.close();
////		log.info("it is complited");
//	}
	
	
	@AfterMethod
	public void screenshot (ITestResult Result) {
		try {
			if(Result.getStatus() == ITestResult.FAILURE){
				ScreenShot.takeScreenShot(driver);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}

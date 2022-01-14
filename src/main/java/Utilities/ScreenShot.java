package Utilities;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	
	public static void takeScreenShot(WebDriver driver) throws IOException {
		Random rdm = new Random();
		int name = rdm.nextInt(100);
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File Destination = new File("C:\\ddd\\Retestingsuite\\ScreenShots"+name+".png");
		File Destination = new File("C:\\ddd\\RegressionSuite"+name+".png");
		FileHandler.copy(source, Destination);
	}

}

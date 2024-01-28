import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GoogleSearchMethods {
	
	public void takeSnapShot(WebDriver driver) throws Exception {
		Date currentDate = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String currentDateTime = dateFormat.format(currentDate);
		TakesScreenshot scrsht = ((TakesScreenshot)driver);
		File ScrFile = scrsht.getScreenshotAs(OutputType.FILE);
		File DesFile = new File("E:\\Aditya\\Sample_Maven_Project\\test-output\\testScreenShots\\test"+currentDateTime+".png");
		FileUtils.copyFile(ScrFile,DesFile);
		
	}
	
}

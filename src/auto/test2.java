package auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {

	public static void main(String[] args) throws InterruptedException {
		
		String chromepath="C:\\Users\\Dell\\eclipse-workspace\\day1automation\\drivers1\\chromedriver_win32\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", chromepath);
		
		
		WebDriver  driver=new ChromeDriver();
		
		driver.get("https://accounts.snapchat.com/accounts/login?client_id=geo");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		
		//navigate on diff url
		
		
		driver.navigate().to("https://www.sevenmentor.com/software-testing-course-in-pune.php");
		
		driver.manage().window().maximize();
	
		Thread.sleep(3000);
		driver.navigate().back();
		
		Thread.sleep(3000);
		driver.navigate().forward();


	}

}

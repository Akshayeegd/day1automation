package auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
		
		//implimantation
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\day1automation\\drivers1\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.snapchat.com/accounts/login?client_id=geo");  //open browser
		driver.manage().window().maximize();     //maximize browser
		
		System.out.println(driver.getTitle());    //give title of page
		System.out.println(driver.getCurrentUrl()); //get url
		
		Thread.sleep(3000);   //static waits 3sec pause
		driver.close();       //current  close broswer

	}

}

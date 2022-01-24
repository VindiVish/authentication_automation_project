package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class Loginpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Firefox.driver","mv firefoxdriver /usr/local/bin");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://hotel.testplanisphere.dev/ja/login.html");

		//Find Email Address
		WebElement txtbx_email = driver.findElement(By.id("email"));
		txtbx_email.sendKeys("yoshiki@example.com");
		
		//Find Password
		driver.findElement(By.id("password")).sendKeys("pass-pass");
	
		//Submit Button
		//driver.findElement(By.id("login-button")).click();
		driver.findElement(By.xpath("//*[@id ='login-button'and @type= 'submit']")).click();
		
		String expected_title = "マイページ | HOTEL PLANISPHERE - テスト自動化練習サイト";
		String actual_title = driver.getTitle();
		
		//Check Point
		if (expected_title.equals(actual_title)) {
			System.out.println("Login Successfull");
		}else {
			System.out.println("Login Failed");
		}
		
	}

}


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	
	public static void main(String[] args) {
		//Launch Chrome Browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load url
		driver.get("https://www.facebook.com/");
		//Enter the username
		driver.findElement(By.id("email")).sendKeys("manishkumar@facebook.com");
	    //Enter the password
		driver.findElement(By.id("pass")).sendKeys("sample password");
		//Click Login button
		driver.findElement(By.name("login")).click();
		//Close the browser  
		
	}
}
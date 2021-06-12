import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class GoogleTest {

	public static void main(String[] args) throws FindFailed {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		
		Screen sc = new Screen();
		
		
		//SignIn button
		Pattern sign = new Pattern("C:\\Users\\HP\\eclipse-workspace\\SikuliConceptTest\\target\\signIn.png");
		sc.wait(sign,5000);
		sc.click();

	}

}

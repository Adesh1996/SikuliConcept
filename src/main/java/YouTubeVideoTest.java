import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class YouTubeVideoTest {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.youtube.com/watch?v=YPohR_9v6HA");
		
		//Create object of Screen class 
		Screen sc = new Screen();
		
		
		//Play button
		Pattern playb = new Pattern("C:\\Users\\HP\\eclipse-workspace\\SikuliConceptTest\\target\\play.png");
		sc.wait(playb,5000);
		sc.click();
		sc.click();
		System.out.println("Click play");
		
		//Pause button
		Pattern pauseb = new Pattern("C:\\Users\\HP\\eclipse-workspace\\SikuliConceptTest\\target\\pause.png");
		sc.wait(pauseb,2000);
		sc.click();
		sc.click();
		System.out.println("Click pause");
		
		
		//mute button
		Pattern setb = new Pattern("C:\\Users\\HP\\eclipse-workspace\\SikuliConceptTest\\target\\mute.png");
		sc.wait(setb,5000);
		sc.click();
	}

}

package jenkinsbuild;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// Open the URL
		driver.get("http://leaftaps.com/opentaps/control/logout");
		Thread.sleep(2000);

		driver.close();

	}

}

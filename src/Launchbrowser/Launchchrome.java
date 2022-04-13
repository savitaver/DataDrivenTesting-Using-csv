package Launchbrowser;

public class Launchchrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Savita\\Desktop\\selenium aotomation\\LaunchChromeBrowser\\SeleniumBrowserJars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.quit();
	}

}

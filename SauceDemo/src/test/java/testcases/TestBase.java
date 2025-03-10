package testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {


	protected WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	Properties prop ;
	FileInputStream fis ;
	String propertiesPath;

	@BeforeClass
	public void setup() throws IOException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		propertiesPath = projectPath + "\\src\\test\\java\\Config\\config.properties";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		prop = new Properties();
		fis = new FileInputStream (propertiesPath);
		prop.load(fis);
		String url = prop.getProperty("URL");
		driver.get(url);



	}

	@AfterTest
	public void teardown() {

		driver.quit();
	}

}

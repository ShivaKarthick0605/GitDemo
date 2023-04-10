import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shiva\\OneDrive\\Documents\\Eclipse Files\\ChromeDriver\\chromedriver_win32(3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.techlistic.com/p/demo-selenium-practice.html");
		
	    //handling tables 
		
		List<WebElement> row = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr[*]"));
		int rowCount = row.size();
		System.out.println("No of rows are :"+rowCount);
		
		
		List<WebElement> column = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[1]/td[3]"));
		int columnCount = column.size();
		System.out.println("No of colums :"+columnCount);
		driver.quit();
		
		//String value = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[4]/td[*]")).
		
		
		

	}

}

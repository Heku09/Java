package Basic_Java_Programs;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver(); //upcasting webdriver is parent to chromedriver
		//WebDriver driver=new EdgeDriver();
		
		
		//driver.get("https://www.amazon.com/");
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("nav-bb-searchbar")).sendKeys("iphone16");
	
		driver.findElement(By.id("small-searchterms")).sendKeys("apple");
		
	    /*String actualtitle=driver.getTitle();	
		if(actualtitle.equals("Amazon.com. Spend less. Smile more.")){
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
		*/
		driver.quit();

	}

}

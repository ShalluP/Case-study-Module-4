package module4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/* A person wants to check for the one-way flights from Bengaluru to Lucknow for 5
passengers (3 Adults and 2 children) on Indigo portal for the current date. Automate
the same using (https://www.goindigo.in/?linkNav=home_header ) portal. The steps
are as belo
Select “One way” in the option
3. Fill all the details specified above
4. Click on search button
5. Wait for the page to load and list all the flights available*/

public class CaseStudyModule4 {

	public static void main(String[] args) {
		
		// Set the path for driver executables
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saanvi\\Desktop\\Selenium Training\\Installation Stuff\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS); 
		// Open the AUT
		driver.get("https://www.goindigo.in/?linkNav=home_header");
		
		// selecting the one way option 
		driver.findElement(By.xpath("//label[@for= 'oneWayTrip']")).click();
		
		// selecting source and target destination
		driver.findElement(By.name("or-src")).sendKeys("Bengaluru");
		driver.findElement(By.name("or-dest")).sendKeys("Lucknow");
		
		// selecting the current date
		
		driver.findElement(By.xpath("//[input(@name = 'or-depart' and @placeholder = 'Departure Date')]")).click();
		
		// selecting 3 adults and 2 children
		
		driver.findElement(By.name("passenger")).click();
		
		WebElement adult = driver.findElement(By.xpath("(//button[@title='Up'])[1]"));
		
		adult.click();
		adult.click();
		adult.click();
		
		WebElement Child = driver.findElement(By.xpath("(//button[@class = 'pax-plus btn btn-info'])[2]"));
		
		Child.click();
		Child.click();
		
		// click on the search button
		driver.findElement(By.xpath("(//*[text() = 'Search Flight'])[1]")).click();
		
		// wait for the webpage to load
		
		
		
		

	}

}

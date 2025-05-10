package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HOMEPAGE {
	
	WebDriver driver;
	
	
	public void HOMEPAGE1(WebDriver driver1)
	{
		this.driver= driver1;
	}
	
	
	public void Navigate_to_Skillspage() {
		
		driver.findElement(By.xpath("//span[normalize-space()='Admin']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Qualifications']")).click();
		driver.findElement(By.xpath("(//a[@class='oxd-topbar-body-nav-tab-link'])[1]")).click();
		
	}
		
		
	public void Logout() {
			
			System.out.println("LOgged Out");
			
		}
	
	public void Browser_Closure() {
		
		
		driver.close();
		
	}

}

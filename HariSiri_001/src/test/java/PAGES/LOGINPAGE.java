package PAGES;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LOGINPAGE {
	
	
	WebDriver driver;
	
	public void LOGINPAGE1(WebDriver driver2)
	{
		this.driver=driver2;
	}
	
	
	public void Login_Scenario(String UName, String PWD) throws InterruptedException {
		
		driver.findElement(By.name("username")).sendKeys(UName);
		driver.findElement(By.name("password")).sendKeys(PWD);
		Thread.sleep(2000);		
	}
	
	
	public void Click_on_Login() {
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();	
			
	}
	public void Login_DataTable_Without_Heard(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		
		String USERNAME1= dataTable.cell(0, 0);
		String PASSWORD1= dataTable.cell(0, 1);
		
		driver.findElement(By.name("username")).sendKeys(USERNAME1);
		driver.findElement(By.name("password")).sendKeys(PASSWORD1);
		Thread.sleep(2000);
	}
	
	
	public void  Login_DataTable_With_Heard(io.cucumber.datatable.DataTable dataTable) throws Throwable {
		
		List<Map<String, String>> LoginTable= dataTable.asMaps(String.class, String.class);
		for (int i=0; i<LoginTable.size();i++)
		{
			String USERNAME2= LoginTable.get(i).get("UserNAME");
			String PASSWORD2= LoginTable.get(i).get("PassWORD");
			
			driver.findElement(By.name("username")).sendKeys(USERNAME2);
			driver.findElement(By.name("password")).sendKeys(PASSWORD2);
			Thread.sleep(2000);
				
		}
	   
	}

}

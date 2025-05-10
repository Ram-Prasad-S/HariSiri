package PAGES;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SKILLSPAGE {
	
	WebDriver driver;
	
	public void SKILLSPAGE1(WebDriver driver3)
	{
		this.driver=driver3;
	}
	
	
	public void Add_SkillRecords_Scenario(String SNAME, String SDESCR) {
		
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(SNAME);
		driver.findElement(By.xpath("//textarea[@placeholder='Type description here']")).sendKeys(SDESCR);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	}
	
	public void Add_SkillRecords_DataTable_Without_Heard(io.cucumber.datatable.DataTable dataTable) {
		
		List<List<String>> SkillTable = dataTable.cells();
		//List<List<String>> SkillTable = dataTable.cell(0, 1);
		//List<List<String>> SkillTable = dataTable.cell(1, 0);
		
		for(int i=0;i<SkillTable.size();i++)
		{
			
			
			String SkillName= SkillTable.get(i).get(0); //   (get(i).get(0)=------> cell(0,0)   cell(1,0) 
			String SkillDescr= SkillTable.get(i).get(1); // cell(0, 1) cell(1,1)
			
			driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
			driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(SkillName);
			driver.findElement(By.xpath("//textarea[@placeholder='Type description here']")).sendKeys(SkillDescr);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			
		}
	}
	
	
	public void Add_SkillRecords_DataTable_With_Heard(io.cucumber.datatable.DataTable dataTable) {
		
		List<Map<String, String>> SKillRecords= dataTable.asMaps(String.class, String.class);
		
		
		for(int i=0;i<SKillRecords.size();i++)
		{
			
			String SKILLNAME= SKillRecords.get(i).get("SkillNAME");
			String SKILLDESCR= SKillRecords.get(i).get("SKILLdescr");
			
			driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
			driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(SKILLNAME);
			driver.findElement(By.xpath("//textarea[@placeholder='Type description here']")).sendKeys(SKILLDESCR);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
					
			
		}
		
	   
	}

}

package Steps;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PAGES.HOMEPAGE;
import PAGES.LOGINPAGE;
import PAGES.SKILLSPAGE;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	WebDriver driver;
	
	HOMEPAGE hp= new HOMEPAGE();
	LOGINPAGE lp= new LOGINPAGE();
	SKILLSPAGE sp= new SKILLSPAGE();
	
	

	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() {
		
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();

	}

	@When("User opens URL {string}")
	public void user_opens_url(String GivenURL) throws InterruptedException {
		
		driver.get(GivenURL);
		Thread.sleep(2000);	
		
	}

	@When("User Enters Usename as {string} and Password as {string}")
	public void user_enters_usename_as_and_password_as(String UName, String PWD) throws InterruptedException {
		
		lp.LOGINPAGE1(driver);
		lp.Login_Scenario(UName, PWD);
		
	}

	@Then("Click On LoginButton")
	public void click_on_login_button() {
		
		lp.LOGINPAGE1(driver);
		lp.Click_on_Login();
		
		
	}

	@Then("Navigate to Skills Page")
	public void navigate_to_skills_page() {
		
		hp.HOMEPAGE1(driver);
		hp.Navigate_to_Skillspage();		
		
	}
	
	@When("Add Skill Record as {string} and {string}")
	public void add_skill_record_as_and(String SNAME, String SDESCR) {
		
	sp.SKILLSPAGE1(driver);
	sp.Add_SkillRecords_Scenario(SNAME, SDESCR);	
	}

	@When("Click on Logout Button")
	public void click_on_logout_button() {
		
		hp.HOMEPAGE1(driver);
		hp.Logout();	
		
	}

	@Then("Close the Browser")
	public void close_the_browser() {
	
		hp.HOMEPAGE1(driver);
		hp.Browser_Closure();
		
	}
	
	@When("User Enters Login Credentials")
	public void user_enters_login_credentials(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		
		lp.LOGINPAGE1(driver);
		lp.Login_DataTable_Without_Heard(dataTable);
	
	}
	
	@When("Add Skill Record Using Data Table Without Headers")
	public void add_skill_record_using_data_table_without_headers(io.cucumber.datatable.DataTable dataTable) {
		
		sp.SKILLSPAGE1(driver);
		sp.Add_SkillRecords_DataTable_Without_Heard(dataTable);
	}
	
	@When("User Enters Login Credentials Using Data Table With Headers")
	public void user_enters_login_credentials_using_data_table_with_headers(io.cucumber.datatable.DataTable dataTable) throws Throwable {
		
		lp.LOGINPAGE1(driver);
		lp.Login_DataTable_With_Heard(dataTable);		
	}
	
	@When("Add Skill Record Using Data Table With Headers")
	public void add_skill_record_using_data_table_with_headers(io.cucumber.datatable.DataTable dataTable) {
		
	   sp.SKILLSPAGE1(driver);
	   sp.Add_SkillRecords_DataTable_With_Heard(dataTable);
	}

}


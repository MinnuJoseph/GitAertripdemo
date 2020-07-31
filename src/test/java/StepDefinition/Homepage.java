package StepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.Keys;

import SearchHotels.Base;
import SearchHotels.LandingPage;
@RunWith(Cucumber.class)
public class Homepage extends Base {

	@Given("^Initilize driver and navigate to url \"([^\"]*)\"$")
	public void initilize_driver_and_navigate_to_url(String arg1) throws Throwable {
		 driver=initilizedriver() ;
		 driver.get(arg1); 
		 Thread.sleep(4000);
	    }

	@When("^Click the hotel tab$")
	public void click_the_hotel_tab() throws Throwable {
	    	LandingPage lp=new LandingPage(driver);
			lp.ClickHotelTab().click();
	    }

	@When("^Enter CityName (.+) and click enter$")
	public void enter_CityName_and_click_enter(String city) throws Throwable {
	    	LandingPage lp=new LandingPage(driver);
			Thread.sleep(5000);
			lp.CityName().click();
			lp.CityName().clear();
			lp.CityName().sendKeys(city);
			Thread.sleep(10000);
			lp.CityName().sendKeys(Keys.ENTER);
			Thread.sleep(5000);
	    }

	@When("^Select the ToCalendar and click ok$")
	public void select_the_ToCalendar_and_click_ok() throws Throwable {

	    	LandingPage lp=new LandingPage(driver);
	    	lp.ClickToDateTab().click();
			lp.SelectDate().click();
	    }

	@When("^Enter the child and family members and click the search button$")
	public void enter_the_child_and_family_members_and_click_the_search_button() throws Throwable {

	    	LandingPage lp=new LandingPage(driver);
	    	lp.GuestTab().click();
			int count=lp.ClickChildsize().size();
			System.out.println("childcount"+count);
			for (int i=0;i<1;i++)
			{
				lp.ClickChildsize().get(i).click();
			}
			lp.Addchild().click();
			for (int i=4;i<5;i++)
			{
				lp.ClickChildsize().get(i).click();
			}
			lp.Search().click();
			Thread.sleep(1000);
	    }
	    
	@Then("^Move to Hotel page list$")
	public void move_to_Hotel_page_list() throws Throwable {
	    	System.out.println("Move to hotel page list");
	    }

}

package StepDefinition;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import SearchHotels.Base;
import SearchHotels.HotelPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchHotel extends Base {

	@Given("^Check the hotel page is displayed$")
	public void check_the_hotel_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		HotelPage hp=new HotelPage(driver);
		Thread.sleep(10000);
		Assert.assertTrue(hp.ModifySearch().isDisplayed());
		Thread.sleep(10000);
		driver.manage().window().maximize();
	}

	@When("^Click NearBy Tab and click first hotel and click the book button$")
	public void click_nearby_tab_and_click_first_hotel_and_click_the_book_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		HotelPage hp=new HotelPage(driver);
		hp.ClickNearBy().click();
		int Nearbycount=hp.NearByCountsize().size();
		System.out.println("NearBy"+ Nearbycount);
		for(int j=2;j<Nearbycount;j++)
		{
			String st=hp.NearByCountsize().get(j).getText();
			System.out.println("NearBycount"+ Integer.parseInt(st));
		}
		int flag=hp.ClickHotelsize().size();
		System.out.println("NearByHotels"+ flag);
		Thread.sleep(4000);
		for(int a=0;a<flag;a++)
		{
			hp.ClickHotelsize().get(a).click();
			Thread.sleep(8000);
			int booknumber=hp.BookButtonsize().size();
			System.out.println("Book Buttons"+ booknumber);
			for(int k=0;k<booknumber;k++)
			{
				if(booknumber>1)
				{
				Thread.sleep(3000);	
				//Actions act=new Actions(driver);
				//act.moveToElement(driver.findElement(By.xpath("//*[@id=\"index-page\"]/body/view/view/view[2]/div[2]/view/div[1]/div[2]/div[1]/div/div[3]/div[3]/div"))).sendKeys(Keys.PAGE_DOWN).build().perform();
				//hp.BookButton();
				//WebElement element = driver.findElement(By.xpath("//button[@class='button line bookingConfirmation-js']"));
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click();",hp.BookButton());
				Thread.sleep(10000);
				System.out.println("Hotel displayed");
				}
				else
				System.out.println("Only 1 Hotel room is avaliable");	
				break;
			}	
			break;
			
		}
		
	}
		
	

	@Then("^Will move to itenary page$")
	public void will_move_to_itenary_page() throws Throwable {
	    System.out.println("Hotel itenary displayed");
	    
	}
	
	
}

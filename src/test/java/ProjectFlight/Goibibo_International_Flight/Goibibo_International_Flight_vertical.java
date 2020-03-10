package ProjectFlight.Goibibo_International_Flight;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Goibibo_International_Flight_vertical {
String flight_icon = "//li[@class='active']";
	
	String source_station = "//*[@id=\"gosuggest_inputSrc\"]";
	
	String destination_station = "//*[@id=\"gosuggest_inputDest\"]";
	
	String date_picker = "//span[@class='DayPicker-NavButton DayPicker-NavButton--next']";
	
	String date_selection ="//*[@id=\"fare_20200423\"]";
	
	String search_button = "//*[@id=\"gi_search_btn\"]";
	
	String depature_filter = "//span[contains(text(),'DEPARTURE')]";
		
	String airlines_selection = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/div[2]/div[2]";
	
	String book_flight = "//*[@id=\"content\"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/span/span/input";
	
	String insurance_selection = "//input[@name='insuranceRadio']";
	
	String adult_title = "//*[@id=\"Adulttitle1\"]/option[2]";
	
	String first_name = "//input[@id='AdultfirstName1']" , last_name = "//input[@id='AdultlastName1']" , email_add = "//input[@id='email']" , mob_no = "//input[@id='mobile']";
	
	String proceed_button = "//button[@class='button orange col-md-3 fr large']";
	
	String select_nb = "//div[@id='tab_nb']" , select_bank = "//*[@id=\"selectedBank\"]/option[2]" , payment_button = "//*[@id=\"nbPayNow\"]/div/button";
	
	
	
	WebDriver driver;
	
  @Test (priority=0 ,groups = {"Click on Icon"})
  public void Icon() {
	  
		
		driver.findElement(By.xpath(flight_icon)).click();
  }

		
  @Test (priority=1 ,groups = {"Enter the Source Location"})
  
  public void Source() {
	  
		driver.findElement(By.xpath(source_station)).sendKeys("Delhi");
		
		driver.findElement(By.id("react-autosuggest-1-suggestion--0")).click();
		
  }
  
  @Test (priority=2 ,groups = {"Enter the Destination Location"})

	
  public void Destination() {
	  
	  driver.findElement(By.xpath(destination_station)).sendKeys("Singapore");
	  
		driver.findElement(By.id("react-autosuggest-1-suggestion--0")).click();
		
  }
		
  @Test (priority=3 ,groups = {"Check date of journey"})
  
  public void journy_date() {
	  
	  driver.findElement(By.xpath(date_picker)).click();
	  
	  driver.findElement(By.xpath(date_selection)).click();
  }
  
  @Test (priority=4 ,groups = {"Search button"})
  
  public void search_button() {
	  
	  driver.findElement(By.xpath(search_button)).click();
	  
  }

//  @Test (priority=5 ,groups = {"depature_filter"})
//  
//  public void departure_filter() {
//	  
//	  driver.findElement(By.xpath(depature_filter)).click();
//	  
//  }
//  
  

  @Test (priority=6 ,groups = {"Book_Flight"})
  
  public void book_flight() {
	  
	  driver.findElement(By.xpath(book_flight)).click();
  }
  
  
  @Test (priority=7 ,groups = {"Select_Insurance"})

  public void insurance_selection() {
	  
	  driver.findElement(By.xpath(insurance_selection)).click();
  }
  
    @Test (priority=8 ,groups = {"Enter Traveller Details"})

    public void traveller_details() {
    	
    	driver.findElement(By.xpath(adult_title)).click();

    	driver.findElement(By.xpath(first_name)).sendKeys("Test");
    	
    	driver.findElement(By.xpath(last_name)).sendKeys("Flight");
    	
    	driver.findElement(By.xpath(email_add)).sendKeys("testnoc009@gmail.com");
    	
    	driver.findElement(By.xpath(mob_no)).sendKeys("9999999999");
    	
    }
	
    
    @Test (priority=9 ,groups = {"Proceed to payment page"})

    public void Proceed_to_payment() throws InterruptedException {
  
    	driver.findElement(By.xpath(proceed_button)).click();
    	
    	Thread.sleep(4000);
    	
    	driver.findElement(By.xpath("//span[@class='bg-greyLt quicks fb white brdrRd10 ico15 padLR20 padTB8 curPointer']")).click();
    	
    	driver.findElement(By.xpath(select_nb)).click();

    	driver.findElement(By.xpath(select_bank)).click();
    	
    	driver.findElement(By.xpath(payment_button)).click();
    	
    	Thread.sleep(3000);
    }
    


    
    
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Eclips backup\\Jar Files for use in selenium\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().deleteAllCookies();
	  
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	  driver.navigate().to("http://www.goibibo.com");
	  
	  driver.manage().window().maximize();
  
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.quit();
  }

}

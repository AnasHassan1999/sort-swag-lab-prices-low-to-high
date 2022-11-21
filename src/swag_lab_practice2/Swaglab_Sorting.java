package swag_lab_practice2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Swaglab_Sorting {

public WebDriver driver;

  @BeforeTest

public void log_in() {
	
	  WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	
	driver.get("https://www.saucedemo.com/");
	
	
	driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select")).click();
	driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[3]")).click();
	
	
	
	
	
}

  @Test()
  
  public void njkf() {
	  
	  List <WebElement> priceslist=driver.findElements(By.className("inventory_item_price"));
	  
	  List<Double> editedlist=new ArrayList<>();
	  for(int i=0;i<priceslist.size();i++) {
		  
		String prices= priceslist.get(i).getText();
		
		String newprice= prices.replace("$", " ").trim();
		
		System.out.println(newprice);
		double doubleprices=Double.parseDouble(newprice);
		
	System.out.println(doubleprices);	
		
		editedlist.add(doubleprices);
		
	  }
	  for(int i=0;i<editedlist.size();i++) {
		  
		  boolean check=editedlist.get(0)<editedlist.get(editedlist.size()-1);
		  
		  Assert.assertEquals(check, true);
		  
		  
	  }
 
  }
  
  
}

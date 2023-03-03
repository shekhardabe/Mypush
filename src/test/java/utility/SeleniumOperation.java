package utility;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class SeleniumOperation 
{
	
	public static ChromeDriver driver=null;
	public static void Launchbrowser(Object[]inputparameters) 
	{
		String strBrowserKey=(String)inputparameters[0];
		String webDriverExePath=(String)inputparameters[1];
		System.setProperty(strBrowserKey, webDriverExePath);
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
	}
	public static void OpenLink(Object[]inputparameters)
	{
		String strurl=(String)inputparameters[0];
		driver.get(strurl);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
	}
	

	public static void clickOnElement(Object[]inputparameters)
	{
		String strurl=(String)inputparameters[0];
		driver.findElement(By.xpath(strurl)).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
	}
	public static void switchToTab()
	{

	     Set<String> ids=driver.getWindowHandles();
	     Iterator<String> itr= ids.iterator();
	               String one=itr.next();
	               String two=itr.next();
	               driver.switchTo().window(two);
	}
	
	public static void switchToDefaultContent()
	{

	     Set<String> ids=driver.getWindowHandles();
	     Iterator<String> itr= ids.iterator();
	               String one=itr.next();
	               String two=itr.next();
	               driver.switchTo().window(one);
	}
	
	public static void getInputText(Object[]inputparameters)
	{
		String strurl=(String)inputparameters[0];
	String text=driver.findElement(By.xpath(strurl)).getText();
	System.out.println(text);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
	}
	
	
	
	public static void main(String[] args) 
	{
		
		Object [] input1= new Object[2];
		          input1[0]="webdriver.chrome.driver";
		          input1[1]="C:\\Automation support\\chromedriver.exe";
		          SeleniumOperation.Launchbrowser(input1);
		
		          Object [] input2= new Object[2];
		          input2[0]="https://thesportstak.com/";
		          SeleniumOperation.OpenLink(input2);
		
		          Object [] input3= new Object[2];
		          input3[0]="(//*[@class='MuiButton-label'])[30]";
		          SeleniumOperation.clickOnElement(input3);
		          
		         
		       
		       
	}
	
}

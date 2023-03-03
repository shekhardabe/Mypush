package trial;


import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tempt1
{

	public static void main (String[]args) throws InterruptedException
	{
		
		
			System.setProperty("webdriver.chrome.driver", "C:\\Automation support\\chromedriver.exe");
			 ChromeDriver  driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://thesportstak.com/");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		driver.findElement(By.xpath("//*[text()='Hindi']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='FIFA World Cup: मेसी-अल्वारेज का धमाल, क्रोएशिया को 3-0 से पीटकर अर्जेंटीना छठी बार फाइऩल में दाखिल, देखिए हिंदी हाईलाइट्स ']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Back']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Live from Al Bayt: France ने किया England को बाहर, Semifinal में Moroc']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Back']")).click();
		
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Cricket']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[text()='भारत को WORLD CHAMPION बनाने वाले और कैंसर को मात देने वाले YUVRAJ मना रहें हैं अपना 41वां जन्मदिन'])[1]")).click();
		Thread.sleep(5000);
		
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[text()='Back']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[text()='South Africa के खिलाफ पहले Test Match के लिए Australia Team का ऐलान, कप्तान Cummins की हुई वापसी'])[1]")).click();

		Thread.sleep(5000);
         driver.findElement(By.xpath("//*[text()='Back']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Dark']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='वेबस्टोरी']")).click();
		
		Thread.sleep(5000);
		String text1=driver.findElement(By.xpath("//*[text()='स्टोक्स बने सिक्स वीर, कोई भारतीय आसपास भी नहीं']")).getText();
		System.out.println(text1);
		
		Thread.sleep(5000);
		String text2=driver.findElement(By.xpath("//*[text()='जहां विराट कोहली वहां जीत, तोड़ा अफरीदी का रिकॉर्ड']")).getText();
		System.out.println(text2);
		
		Thread.sleep(5000);
	     driver.findElement(By.xpath("//*[text()='स्टोक्स बने सिक्स वीर, कोई भारतीय आसपास भी नहीं']")).click();
	     
	     Thread.sleep(5000);
	     Set<String> ids=driver.getWindowHandles();
	     Iterator<String> itr= ids.iterator();
	               String one=itr.next();
	               String two=itr.next();
	               driver.switchTo().window(two);
	               
	               
	   Thread.sleep(5000);        
	   driver.findElement(By.xpath("//*[@class='i-amphtml-story-button-container i-amphtml-story-fwd-next next-container']")).click();
	   
	   Thread.sleep(5000);  
	   driver.switchTo().window(one);
	   
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//*[@class='logo-container']")).click();
	}
	}
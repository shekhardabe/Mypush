package Cucumbermap;

import java.util.Iterator;
import java.util.Set;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.SeleniumOperation;

public class SportsTak
{
	@Given("user provide browser name as\"Chrome\" and exe location as {string}")
	public void user_provide_browser_name_as_chrome_and_exe_location_as(String string) 
	{

		Object [] input1= new Object[2];
		          input1[0]="webdriver.chrome.driver";
		          input1[1]="C:\\Automation support\\chromedriver.exe";
		          SeleniumOperation.Launchbrowser(input1);
	}

	@Given("user enter url as {string}")
	public void user_enter_url_as(String string) 
	{

        Object [] input2= new Object[1];
        input2[0]="https://thesportstak.com/";
        SeleniumOperation.OpenLink(input2);
	}

	@When("user click on language button")
	public void user_click_on_language_button() 
	{
		  Object [] input3= new Object[1];
          input3[0]="//*[text()='Hindi']";
          SeleniumOperation.clickOnElement(input3);
	}

	@When("user click on first link")
	public void user_click_on_first_link() 
	{
		Object [] input4= new Object[1];
        input4[0]="//*[text()='FIFA World Cup : मेसी या एम्बापे कौन बनेगा फीफा वर्ल्ड कप का प्लेयर ऑफ़ द टूर्नामेंट, जानें फैंस का रिएक्शन ']";
        SeleniumOperation.clickOnElement(input4);
	}

	@When("user click on back button")
	public void user_click_on_back_button()
	{
		Object [] input5= new Object[1];
        input5[0]="//*[text()='Back']";
        SeleniumOperation.clickOnElement(input5);
	}

	@When("user click on second link")
	public void user_click_on_second_link() 
	{
		Object [] input6= new Object[1];
        input6[0]="//*[text()='FIFA World Cup : मेसी या एम्बापे कौन बनेगा फीफा वर्ल्ड कप का प्लेयर ऑफ़ द टूर्नामेंट, जानें फैंस का रिएक्शन']";
        SeleniumOperation.clickOnElement(input6);
	}

	@When("user click on cricket button")
	public void user_click_on_cricket_button() 
	{
		Object [] input7= new Object[1];
        input7[0]="//*[text()='Cricket']";
        SeleniumOperation.clickOnElement(input7);
	}

@When("user click on first link of cricket")
public void user_click_on_first_link_of_cricket() 
{
	Object [] input8= new Object[1];
    input8[0]="(//*[text()='भारत को WORLD CHAMPION बनाने वाले और कैंसर को मात देने वाले YUVRAJ मना रहें हैं अपना 41वां जन्मदिन'])[1]";
    SeleniumOperation.clickOnElement(input8);
}

@When("user click on back button on cricket page")
public void user_click_on_back_button_on_cricket_page() 
{
	Object [] input9= new Object[1];
    input9[0]="//*[text()='Back']";
    SeleniumOperation.clickOnElement(input9);
}

@When("user click on second link of cricket")
public void user_click_on_second_link_of_cricket()
{
	Object [] input10= new Object[1];
    input10[0]="(//*[text()='South Africa के खिलाफ पहले Test Match के लिए Australia Team का ऐलान, कप्तान Cummins की हुई वापसी'])[1]";
    SeleniumOperation.clickOnElement(input10);
}
@When("user click on back button on cricket page again")
public void user_click_on_back_button_on_cricket_page_again() 
{
	Object [] input11= new Object[1];
    input11[0]="//*[text()='Back']";
    SeleniumOperation.clickOnElement(input11);
}

	@When("user click on dark button")
	public void user_click_on_dark_button() 
	{
		Object [] input12= new Object[1];
        input12[0]="//*[text()='Dark']";
        SeleniumOperation.clickOnElement(input12);
	}

	@When("user click on webStories tab")
	public void user_click_on_web_stories_tab() 
	{
		Object [] input13= new Object[1];
        input13[0]="//*[text()='वेबस्टोरी']";
        SeleniumOperation.clickOnElement(input13);
	}
	
	
	@When("user get text from first story")
	public void user_get_text_from_first_story() 
	{
		Object [] input14= new Object[1];
        input14[0]="//*[text()='स्टोक्स बने सिक्स वीर, कोई भारतीय आसपास भी नहीं']";
        SeleniumOperation.getInputText(input14);
	}

	@When("user get text from second story")
	public void user_get_text_from_second_story() 
	{
		Object [] input15= new Object[1];
        input15[0]="//*[text()='जहां विराट कोहली वहां जीत, तोड़ा अफरीदी का रिकॉर्ड']";
        SeleniumOperation.getInputText(input15);
	}


	@When("user click on first story")
	public void user_click_on_first_story() 
	{
		Object [] input16= new Object[1];
        input16[0]="//*[text()='स्टोक्स बने सिक्स वीर, कोई भारतीय आसपास भी नहीं']";
        SeleniumOperation.clickOnElement(input16);
        }
	@When("user switch to next tab")
	public void user_switch_to_next_tab()
	{
		SeleniumOperation.switchToTab();
	}
	
	@When("user click on next button")
	public void user_click_on_next_button() 
	{
		Object [] input17= new Object[1];
        input17[0]="//*[@class='i-amphtml-story-button-container i-amphtml-story-fwd-next next-container']";
        SeleniumOperation.clickOnElement(input17);
	}

	@When("user switch to default tab")
	public void user_switch_to_default_tab() 
	{
	   SeleniumOperation.switchToDefaultContent();
	}

	@When("user click on home page")
	public void user_click_on_home_page()
	{
		Object [] input18= new Object[1];
        input18[0]="//*[@class='logo-container']";
        SeleniumOperation.clickOnElement(input18);
	}

	@Then("browser shows home page")
	public void browser_shows_home_page()
	{
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
	
}
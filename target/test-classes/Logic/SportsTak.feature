Feature: SportsTak Functionality
 
 Background: Application open successfully
 Given user provide browser name as"Chrome" and exe location as "C:\\Automation support\\chromedriver.exe"
 Given user enter url as "https://thesportstak.com/"
 
 Scenario: Check all functions working properly
 When user click on language button
 When user click on first link
 When user click on back button
 When user click on second link
 When user click on back button
 When user click on cricket button
 When user click on first link of cricket
 When user click on back button on cricket page
 When user click on second link of cricket
 When user click on back button on cricket page again
 When user click on dark button
 When user click on webStories tab
 When user get text from first story
 When user get text from second story
 When user click on first story
 When user switch to next tab
 When user click on next button
 When user switch to default tab
 When user click on home page
 Then browser shows home page
 
 
package com.testvagrant.generic;


	

	import java.util.concurrent.TimeUnit;

	
	import org.openqa.selenium.Dimension;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.Assert;

	public class CommonMethod  extends BaseTest{
		public WebDriver driver;
		public String  getPageTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
	}
	public void verify(String actual,String expected,String message)
	{
		if(actual.contentEquals(expected))
		{
			System.out.println(message+"is Displayed==> TEST PASSED");
		}
		else {
			System.out.println(message+" is not Displayed==> TEST FAILED");
		}
	}
	public void waitForPageLoad(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}
	public void waitForTitle(String title) {
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleContains(title));
	}
	public void  selectOption(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	public void selectOption(WebElement element , String value)
	{
		Select sel = new Select(element);
		sel.selectByValue(value);
	}
	public void selectOption(  String text,WebElement element)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	public void mouseHover(WebElement target) {
		Actions ac = new Actions(driver);
		ac.moveToElement(target).perform();
		
	}

	//To navigate previous page
	public void NavigationBackward(WebDriver driver) {
		driver.navigate().back();
	}
	//To navigate to next page
	public void navigationForward(WebDriver driver) {
		driver.navigate().forward();
	}
	//To refresh the current webpage
	public void NavigationRefresh(WebDriver driver) {
		driver.navigate().refresh();
	}
	//To navigate to other webpage
	public void NavigateTo(WebDriver driver,String url) {
		driver.navigate().to("url");
		
	}
	//delete specific cookies
	public void deleteCookies(WebDriver driver) {
		driver.manage().deleteCookieNamed(null);
	}
	//delete all cookies
	public void deleteAllCookies(WebDriver driver) {
		driver.manage().deleteAllCookies();
	}

	public void scrolldown(WebElement ele)
	{
		//WebDriver driver = null;
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(x,y)","");
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
	             
	}
	  //url verification
	 public void verifyUrl(WebDriver driver,String expectedUrl) {
		String actual=driver.getCurrentUrl();
		Assert.assertEquals(actual, expectedUrl);
	}
		 
	 //maximize
	  public void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}

	 //set window size
     public void setSize(WebDriver driver,int length,int height) {
		 Dimension d= new Dimension(length,height);
		 driver.manage().window().setSize(d);
	}
			
	  //button verify
	  public void isClickable(WebElement element) {
	     boolean actual= element.isEnabled();
		 Assert.assertEquals(actual,true);
	}
		
	  public void clickEnable(WebElement element1) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element1);		
	}
		
	  // compare data extracted
	  public void verifyData(String actual, String expected) {
		Assert.assertEquals(actual, expected);
	}
	  
	  // To remove the word
	    public static void remove(String str, String word)
	    {
	        // Split the string using split() method
	        String msg[] = str.split(" ");
	        String new_str = "";
	 
	        // Iterating the string using for each loop
	        for (String words : msg) {
	 
	            // If desired word is found
	            if (!words.equals(word)) {
	 
	                // Concat the word not equal to the given
	                // word
	                new_str += words + " ";
	                
	            }
	        }
	     // Print the new String
	        System.out.print(new_str);
			
	}
	}







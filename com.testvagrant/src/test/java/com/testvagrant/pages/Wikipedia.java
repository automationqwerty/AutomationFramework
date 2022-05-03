package com.testvagrant.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wikipedia {
	WebDriver driver;
	
	public Wikipedia(WebDriver Idriver) {
		driver=Idriver;
		PageFactory.initElements(Idriver, this);
	}
	@FindBy(name="q")
	WebElement search;
public WebElement getSearch() {
	return search;		
	}
	@FindBy(xpath="(//div[@class='plainlist'])[4]")
	WebElement datewiki;	
	@FindBy(xpath="//td[.='India']")
	WebElement countrywiki;
	@FindBy(className="A8SBwf")
	WebElement outsideClick;
	@FindBy(name="btnK")
	WebElement searchClick;
	@FindBy(xpath="//h3[.='Pushpa: The Rise - Wikipedia']")
	WebElement wikiClick;
	
	public WebElement getoutsideClick() {
		return outsideClick;	
		}
	public WebElement getsearchClick() {
		return searchClick;		
		}
	public WebElement getwikiClick() {
		return wikiClick;			
		}
	public WebElement getdatewiki() {
		return datewiki;			
		}
	public WebElement getcountrywiki() {
		return countrywiki;			
		}
	
}

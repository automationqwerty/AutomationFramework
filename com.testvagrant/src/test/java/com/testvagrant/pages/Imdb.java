package com.testvagrant.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Imdb {
WebDriver driver;
	
	public Imdb(WebDriver Idriver) {
		driver=Idriver;
		PageFactory.initElements(Idriver, this);
	}
	
	 
	@FindBy(xpath="//a[@class='ipc-metadata-list-item__list-content-item ipc-metadata-list-item__list-content-item--link' and .='India']")
	WebElement countryimdb;
	@FindBy(xpath="//h3[.='Pushpa: The Rise - Part 1 (2021) - IMDb']")
	WebElement imdbClick;
	
	public WebElement getimdbClick() {
		return imdbClick;			
		}
	public WebElement getdateimdb() {
		return dateimdb;			
		}
	public WebElement getcountryimdb() {
		return countryimdb;			
		}
	@FindBy(xpath= 	"//a[@class='ipc-metadata-list-item__icon-link' and @href='/title/tt9389998/releaseinfo?ref_=tt_dt_rdat']")
     WebElement dateIndia;
	
	public WebElement getdateIndia() {
		return dateIndia;			
		}
	
	@FindBy(xpath= 	"(//table/tbody/tr[6]/td[2])[1]")
		     WebElement dateimdb;
			
			 
}


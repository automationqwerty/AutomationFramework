package com.testvagrant.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.testvagrant.generic.BaseTest;
import com.testvagrant.generic.CommonMethod;
import com.testvagrant.generic.FileLib;
import com.testvagrant.generic.IAutoconst;
import com.testvagrant.pages.Imdb;
import com.testvagrant.pages.Wikipedia;

public class TestClass extends BaseTest implements IAutoconst {
	 @Test
	 public void wikipedia() throws Throwable {
		 CommonMethod cm=new CommonMethod();
		 FileLib flib = new FileLib();
		 Wikipedia wk=new Wikipedia(driver);
		 Imdb im=new Imdb(driver);
		driver.get(flib.getPropkeyValue(PROP_PATH, "googleurl"));
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		cm.maximize(driver);
		Thread.sleep(2000);
		wk.getSearch().click();
		Thread.sleep(2000);
		wk.getSearch().sendKeys(flib.getPropkeyValue(PROP_PATH, "wikipedia"));
		wk.getoutsideClick().click();
		wk.getsearchClick().click();
		wk.getwikiClick().click();
        String date = wk.getdatewiki().getText();
        String country = wk.getcountrywiki().getText();
		System.out.println(date);
		
		Thread.sleep(4000);
		driver.get(flib.getPropkeyValue(PROP_PATH, "googleurl"));
 		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
 		cm.maximize(driver);
 		Thread.sleep(2000);
 		wk.getSearch().click();
 		Thread.sleep(2000);
 		wk.getSearch().sendKeys(flib.getPropkeyValue(PROP_PATH, "imdb"));
 		wk.getoutsideClick().click();
 		wk.getsearchClick().click();
 		im.getimdbClick().click();
 		String countryI = im.getcountryimdb().getText();
 		Thread.sleep(2000);
         im.getdateIndia().click();
 		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
         String dateI =im.getdateimdb().getText();
        cm.verifyData(date, dateI);      
  		cm.verifyData(country, countryI);      
}
}
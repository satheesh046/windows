package org.selenium;



import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowsdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeOptions co=new ChromeOptions();
co.addArguments("--remote-allow-origins=*");
WebDriver driver=new ChromeDriver(co);

driver.get("https://www.leafground.com/window.xhtml");
String oldwindow=driver.getWindowHandle();

//first element
//driver.findElement(By.id("j_idt88:new")).click();
//
//second element
//WebElement second=driver.findElement(By.id("j_idt88:j_idt91"));
//second.click();
//int size=driver.getWindowHandles().size();
//System.out.println("no of windows"+size);
//driver.getWindowHandles().clear();

driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt93\']/span[2]")).click();
Set<String>handles=driver.getWindowHandles();
for (String string : handles) {
	if(!string.equals(oldwindow)) {
		driver.switchTo().window(string);
		Thread.sleep(3000);
		driver.close();
	
	}
}
//		j_idt88:new j_idt88:j_idt91
//	}
//		
//}
//driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt93\']/span[2]")).click();

//driver.switchTo().window(oldwindow);

	}

}

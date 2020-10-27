package src2;

import java.util.Scanner;

//import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import org.openqa.selenium.WebDriver;

public class demoDemo {
public static void main(String[] args) throws InterruptedException

{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the choice:");
	   int choice=sc.nextInt();
	
	    //System.out.println("Hii");
	    //driver.get("http://automationpractice.com/index.php");
	
	if(choice==1) 
		
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Projects\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	    driver.get("https://www.gmail.com");
	     
	    driver.findElement(By.id("identifierId")).sendKeys("sid.aka.beacon@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]")).click();
	    Thread.sleep(5000);
	    driver.navigate().back();
	    Thread.sleep(1000);
	    driver.findElement(By.id("identifierId")).clear();
	    Thread.sleep(500);
	    
	    driver.close();
	}
	
	
	else if(choice ==0)
		
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Projects\\geckodriver_win32\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");	
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		driver.close();
	}
	
	
   
	//System.out.println(s1);
	//String s="Sign in";
	
	
    
}
}

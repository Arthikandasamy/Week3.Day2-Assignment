package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ETrain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='txtStationFrom']")).clear();
		driver.findElement(By.xpath("//input[@id='txtStationTo']")).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
				driver.findElement(By.xpath("//input[@id='txtStationFrom']")).sendKeys("MAS", Keys.ENTER);
				
				driver.findElement(By.xpath("//input[@id='txtStationTo']")).clear();
				driver.findElement(By.xpath("//input[@id='txtStationTo']")).sendKeys("DLI", Keys.ENTER);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
				driver.findElement(By.xpath("//input[@id='buttonFromTo']")).click();
				List<WebElement> findElements = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//td[2]"));
				int size = findElements.size();
				System.out.println("Total # of trains available:   " +size);
				List<String> trainnames = new ArrayList<String>();
				System.out.println("Trainnames are  " );
				for(int i=0; i<size; i++) {
					
					WebElement train = findElements.get(i);
					trainnames.add(train.getText());
					
				}
				System.out.println(trainnames);
				
		}
	}



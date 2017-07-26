import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tutorial {
	public static void main (String [] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\frodriguez\\Downloads\\geckodriver-v0.18.0-win32\\geckodriver.exe");
		//exercise1();
		//exercise2();
		//exercise3();
		//exercise4();
		//exercise5();
		exercise6();
	}
	public static void exercise1(){
		//Creating Firefox web driver
		WebDriver driver = new FirefoxDriver();
		
		//Opening store.demoqa.com
		String url = "http://www.store.demoQA.com";
		driver.get(url);
		
		//Getting page title and title length
		String title = driver.getTitle();
		int tLength = title.length();
		System.out.println("Title: "+"title"
							+"\nLength: "+tLength);
		
		//Getting page url and verifying is the correct one
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current url: " +currentUrl);
		if(currentUrl.equals(url)) {
			System.out.println("Correct url");
		}
		else {
			System.out.println("Incorrect url");
		}
		
		//Getting the page source and page source length
		String pagesource = driver.getPageSource();
		System.out.println("Page Source Length: "+pagesource.length());
						
	}

	public static void exercise2(){
		WebDriver driver = new FirefoxDriver();
		
		//Opening url
		String url = "http://demoqa.com/frames-and-windows/";
		driver.get(url);
		
		//Opening a new window
		driver.findElement(By.xpath(".//*[@id='tabs-1']/div/p/a")).click();

		//Close browser
		driver.close();
	}
	
	public static void exercise3(){
		WebDriver driver = new FirefoxDriver();
		
		String url = "http://www.DemoQA.com";
		driver.get(url);
		
		//Click on registration link
		driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();
		
		//Going back to home page
		driver.navigate().back();
		
		//Going forward to registration
		driver.navigate().forward();
		
		//Going back to home with to command
		driver.navigate().to(url);
		
		//Regresh browser
		driver.navigate().refresh();
		
		//Close browser
		driver.close();
	}

	public static void exercise4(){
		WebDriver driver = new FirefoxDriver();
		
		//Opening browser
		String url= "http://toolsqa.wpengine.com/Automation-practice-form/";
		driver.get(url);
		
		//Typing values into input fields
		driver.findElement(By.name("firstname")).sendKeys("Felipe");
		driver.findElement(By.name("lastname")).sendKeys("Rodriguez");
		
		//Cliking submit button and closing the browser
		driver.findElement(By.id("submit")).click();
		driver.close();
	}
	
	public static void exercise5(){

		WebDriver driver = new FirefoxDriver();
		
		//Opening web browser
		String url = "http://toolsqa.wpengine.com/automation-practice-form/";
		driver.get(url);
		
		//Click on partial link test
		driver.findElement(By.partialLinkText("Partial")).click();
		
		//Identify submit button with tagName and print it
		String tag = driver.findElement(By.tagName("submit")).toString();
		System.out.println(tag);
		
		//Clicking on link "Link Test"
		driver.findElement(By.linkText("Link test")).click();
		
		driver.close();
	}

	public static void exercise6(){
		http://download.eclipse.org/egit/updates
	}
}


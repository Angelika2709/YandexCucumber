package Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ApplicationManager {
	WebDriver wd;

	private Manufactures manNames;
	private NavigationHelper navigationHelper;
	public PriceHelper priceHelper;
	private String browser;

	public ApplicationManager(String browser) {
		this.browser = browser;
	}

	public void init() {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32//chromedriver.exe");
		wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://market.yandex.ru");
		navigationHelper = new NavigationHelper(wd); 
		getNavigationHelper().goSections();
		getNavigationHelper().goPhones();
		priceHelper = new PriceHelper(wd); 	
		manNames = new Manufactures(wd);		
		
	}

	public void stop() {
		System.out.println("Running: tearDown");
		wd.quit();
	}

	public Manufactures getManufNames() {
		return manNames;
	}
	
	public NavigationHelper getNavigationHelper() {
		return navigationHelper;
	}
        
   }

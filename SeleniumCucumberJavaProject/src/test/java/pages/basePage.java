package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basePage {

    protected static WebDriver driver;
    private static WebDriverWait wait;


    static {
        System.setProperty("webdriver.chrome.driver", "E:/Development/Selenium vs/SeleniumCucumberJavaProject/src/test/Software/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, 10);
    }

    public basePage(WebDriver driver){
        basePage.driver = driver;
        wait = new WebDriverWait(driver,10);
    }

    public static void navigateTo(String url){
        driver.get(url);

    }

}

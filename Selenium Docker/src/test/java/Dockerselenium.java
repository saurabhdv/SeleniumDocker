import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Dockerselenium {

    WebDriver driver;
    WebDriverWait wait;

    String flipkart = "https://www.flipkart.com";
    String searchString = "Samsung Galaxy S10";
    String  searchButton = "//*[@class='L0Z3Pu']";



  String dockerPath = "http://192.168.80.134:4444/wd/hub";  // use "http://localhost:4444/wd/hub"
    @Test
    public void login() throws MalformedURLException {

        DesiredCapabilities cp = new DesiredCapabilities();
cp.setCapability(CapabilityType.BROWSER_NAME,BrowserType.CHROME);
          cp.setCapability("name", "Zelanium Test");
        cp.setCapability("recordVideo", true);
        //cp.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,"");
       // System.setProperty("webdriver.chrome.driver", "Browser\\chromedriver.exe"); // we dont have to provide this now
        URL url = new URL(dockerPath);
        driver = new RemoteWebDriver(url,cp);


        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(flipkart);
        driver.manage().window().maximize();
        System.out.println("Title is "+driver.getTitle());


    }



}

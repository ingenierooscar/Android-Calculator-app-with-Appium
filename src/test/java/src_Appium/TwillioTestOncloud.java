package src_Appium;


import java.net.URL;
import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TwillioTestOncloud {


    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        DesiredCapabilities caps = new DesiredCapabilities();

        // Set your access credentials
        caps.setCapability("browserstack.user", "oscargustavorodr1");
        caps.setCapability("browserstack.key", "N36H2RknN1LkiwrFdyEY");

        // Set URL of the application under test
        caps.setCapability("app", "bs://14118baca92c041ca4dda0969427926a4df691c2");

        // Specify device and os_version for testing
        caps.setCapability("device", "Google Pixel 3");
        caps.setCapability("os_version", "9.0");

        // Set other BrowserStack capabilities
        caps.setCapability("project", "First Java Project");
        caps.setCapability("build", "Java Android");
        caps.setCapability("name", "first_test");


        // Initialise the remote Webdriver using BrowserStack remote URL
        // and desired capabilities defined above
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
                new URL("http://hub.browserstack.com/wd/hub"), caps);

        WebDriverWait wait = new WebDriverWait(driver, 10);
        /* Write your Custom code here */
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.android.calculator2:id/digit_2"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.android.calculator2:id/op_add"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.android.calculator2:id/digit_4"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.android.calculator2:id/eq"))).click();

        // Invoke driver.quit() after the test is done to indicate that the test is completed.
        driver.quit();

    }

}

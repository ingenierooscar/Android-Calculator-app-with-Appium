package src_Appium;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

public class twilioTest{

    public AndroidDriver<MobileElement> driver;
    public WebDriverWait wait;

    @BeforeMethod
    public void setup () throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Galaxy Nexus API 30");
        caps.setCapability("udid", "emulator-5554");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "9.0");
        caps.setCapability("skipUnlock","true");
        caps.setCapability("appPackage", "com.android.calculator2");
        caps.setCapability("appActivity","com.android.calculator2.Calculator");
        caps.setCapability("noReset","false");
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void addTest() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.android.calculator2:id/digit_2"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.android.calculator2:id/op_add"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.android.calculator2:id/digit_4"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.android.calculator2:id/eq"))).click();

        WebElement results = wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.android.calculator2:id/result")));
        assert results.getText().equals("6"):"Actual value is : "+results.getText()+" did not match with expected value: 6";
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
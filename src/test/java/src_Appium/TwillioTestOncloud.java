package src_Appium;

        import java.net.URL;
        import java.util.List;
        import java.net.MalformedURLException;
        import io.appium.java_client.MobileBy;
        import io.appium.java_client.MobileElement;
        import io.appium.java_client.android.AndroidDriver;
        import io.appium.java_client.android.AndroidElement;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.WebDriverWait;
        import org.openqa.selenium.remote.DesiredCapabilities;
        import org.testng.annotations.AfterMethod;
        import org.testng.annotations.BeforeMethod;
        import org.testng.annotations.Test;

public class TwillioTestOncloud {

    public static String userName = "oscargustavorodr1";
    public static String accessKey = "N36H2RknN1LkiwrFdyEY";
    public WebDriverWait wait;
    public AndroidDriver<AndroidElement> driver;

    @BeforeMethod
    public void setup () throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("device", "Google Pixel 3");
        caps.setCapability("os_version", "9.0");
        caps.setCapability("project", "My First Project");
        caps.setCapability("build", "My First Build");
        caps.setCapability("name", "Bstack-[Java] Sample Test");
        caps.setCapability("app", "bs://31b9495a6388c98cf2dd5371730b859190b5c922");

        driver = new AndroidDriver<AndroidElement>(new URL("https://" + userName + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub"), caps);
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void calculate() throws InterruptedException {
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
    public void teardown2(){
        driver.quit();
    }
}

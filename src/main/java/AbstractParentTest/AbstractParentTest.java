package AbstractParentTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class AbstractParentTest {
    WebDriver webDriver;
//    protected MainPage mainPage;
//    protected CartPage cartPage;

    @Before
    public void setUp(){
        File file = new File("./src/driver/chromedriver");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        webDriver = new ChromeDriver();

//        webDriver = new FirefoxDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        mainPage = new MainPage(webDriver);
//        cartPage = new CartPage(webDriver);
        //homePage = new HomePage(webDriver);
        //sparePage = new SparePage(webDriver);
        //editSparePage = new EditSparePage(webDriver);

    }

    @After
    public void tearDown(){
        webDriver.quit();
    }

    protected void checkExpectedResult(String message, boolean actualResult) {
        Assert.assertEquals(message, true, actualResult);
    }
}

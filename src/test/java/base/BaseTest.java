package base;

import com.aventstack.extentreports.Status;
import helper.ScreenShotHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.*;
import report.ReportManager;
import webdriver.WebdriverFactory;

public class BaseTest {
    protected  String searchText = "Consola ps5";
    protected WebDriver driver;


    @BeforeSuite
    public void setUpSuit() throws Exception {
        ReportManager.init("Report","ReporteTest");
    }

    @BeforeMethod
    @Parameters({"url","browser"})
    public void setUp(ITestResult iTestResult, String url,String browser) throws Exception {
        ReportManager.getInstance().startTest(iTestResult.getMethod().getMethodName());
        driver = WebdriverFactory.getdriver(browser);
        driver.get(url);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown(ITestResult iTestResult){
        try {
            switch (iTestResult.getStatus()){
                case ITestResult.FAILURE:
                    ReportManager.getInstance().getTest().log(Status.FAIL,"Test fallido");
                    break;
                case ITestResult.SUCCESS:
                    ReportManager.getInstance().getTest().log(Status.PASS,"Test paso");
                    break;
                default:
                    ReportManager.getInstance().getTest().log(Status.FAIL,"Test Incompleto");
            }
            if (iTestResult.getStatus() != ITestResult.SUCCESS){
                ReportManager.getInstance().getTest().log(Status.FAIL,iTestResult.getThrowable().getMessage());
                ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver,Status.FAIL,"Failed Screen");
            }
            else {
                ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver,Status.PASS,"Failed Screen");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(driver != null)
                driver.quit();
        }
    }
    @AfterSuite
    public void tearDownS(){
        ReportManager.getInstance().flush();
    }
}

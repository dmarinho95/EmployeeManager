

package employee_manager_automation;

import  employee_manager_pageObject.Employee_Manager;
import  employee_manager_data.employee;
import  org.testng.annotations.DataProvider;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

/*
Steps to creating automation test 
in Google Chrome
1. import ChromeDriver
    import org.openqa.selenium.chrome.ChromeDriver;
2. Declare url 
   String baseUrl = "url address"
3. declare driverPath aka location of chromedriver or other drivers 
    String driverpath= "file path of chrome driver"
4. System.setProperty("webdriver.chrome.driver",driverPath)
5. Create chrome driver object
   WebDriver driver = new ChromeDriver();
6. driver.get(baseUrl)

Steps to creating automation test 
in Safari
*
1. import safari driver 
    import org.openqa.selenium.safari.SafariDriver
2. enable it in preferences for safari
3. declare url
4. declare safari driver object
    WebDriver driver = new SafariDriver();
5. driver.get(baseUrl)


*/
public class myFirstAutomationTest 
{
    static WebDriver driver;
    String baseUrl="https://devmountain-qa.github.io/employee-manager-v2/build/index.html";
    String driverPath = "C:\\Users\\Daniel Marinho\\Desktop\\Chrome Driver\\chromedriver.exe"; 
    Employee_Manager employeeManagerPage; 
    
    


    @BeforeTest
    public void Test()
    {
        System.out.println("Chrome Browser is launching");
        System.setProperty("webdriver.chrome.driver",driverPath);
        driver = new ChromeDriver();
        driver.get(baseUrl);
        employeeManagerPage=PageFactory.initElements(driver,Employee_Manager.class); 
       
    }
    
    
    
    
    @AfterTest
    public void AfterTest()
    {
        
        driver.quit();
    }
    
    @Test(priority=1)
    public void testing_save_button_works()
    throws InterruptedException{
       
        employee myEmployee = new employee();
        
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(employeeManagerPage.nameList()));
        employeeManagerPage.Employee1Input(myEmployee.name(), myEmployee.phoneNumber(), myEmployee.email(), myEmployee.title());
        employeeManagerPage.saveButton();
        employeeManagerPage.nameList2().click();
        employeeManagerPage.nameList().click();
        Assert.assertEquals(employeeManagerPage.nameList().getText(),myEmployee.name());
        Assert.assertEquals(employeeManagerPage.nameInput1().getAttribute("value"),myEmployee.name());
        Assert.assertEquals(employeeManagerPage.phoneInput1().getAttribute("value"),myEmployee.phoneNumber());
        Assert.assertEquals(employeeManagerPage.emailInput1().getAttribute("value"),myEmployee.email());
        Assert.assertEquals(employeeManagerPage.titleInput1().getAttribute("value"),myEmployee.title());
        employeeManagerPage.Employee2Input(myEmployee.name2(), myEmployee.phoneNumber2(), myEmployee.email2(), myEmployee.title2());
        employeeManagerPage.saveButton();
        employeeManagerPage.nameList3().click();
        employeeManagerPage.nameList2().click();
        Assert.assertEquals(employeeManagerPage.nameList2().getText(),myEmployee.name2());
        Assert.assertEquals(employeeManagerPage.nameInput2().getAttribute("value"),myEmployee.name2());
        Assert.assertEquals(employeeManagerPage.phoneInput2().getAttribute("value"),myEmployee.phoneNumber2());
        Assert.assertEquals(employeeManagerPage.emailInput2().getAttribute("value"),myEmployee.email2());
        Assert.assertEquals(employeeManagerPage.titleInput2().getAttribute("value"),myEmployee.title2());
        employeeManagerPage.Employee3Input(myEmployee.name3(), myEmployee.phoneNumber3(), myEmployee.email3(), myEmployee.title3());
        employeeManagerPage.saveButton();
        employeeManagerPage.nameList4().click();
        employeeManagerPage.nameList3().click();
        Assert.assertEquals(employeeManagerPage.nameList3().getText(),myEmployee.name3());
        Assert.assertEquals(employeeManagerPage.nameInput3().getAttribute("value"),myEmployee.name3());
        Assert.assertEquals(employeeManagerPage.phoneInput3().getAttribute("value"),myEmployee.phoneNumber3());
        Assert.assertEquals(employeeManagerPage.emailInput3().getAttribute("value"),myEmployee.email3());
        Assert.assertEquals(employeeManagerPage.titleInput3().getAttribute("value"),myEmployee.title3());
        employeeManagerPage.Employee4Input(myEmployee.name4(), myEmployee.phoneNumber4(), myEmployee.email4(), myEmployee.title4());
        employeeManagerPage.saveButton();
        employeeManagerPage.nameList5().click();
        employeeManagerPage.nameList4().click();
        Assert.assertEquals(employeeManagerPage.nameList4().getText(),myEmployee.name4());
        Assert.assertEquals(employeeManagerPage.nameInput4().getAttribute("value"),myEmployee.name4());
        Assert.assertEquals(employeeManagerPage.phoneInput4().getAttribute("value"),myEmployee.phoneNumber4());
        Assert.assertEquals(employeeManagerPage.emailInput4().getAttribute("value"),myEmployee.email4());
        Assert.assertEquals(employeeManagerPage.titleInput4().getAttribute("value"),myEmployee.title4());
        employeeManagerPage.Employee5Input(myEmployee.name5(), myEmployee.phoneNumber5(), myEmployee.email5(), myEmployee.title5());
        employeeManagerPage.saveButton();
        employeeManagerPage.nameList().click();
        employeeManagerPage.nameList5().click();
        Assert.assertEquals(employeeManagerPage.nameList5().getText(),myEmployee.name5());
        Assert.assertEquals(employeeManagerPage.nameInput5().getAttribute("value"),myEmployee.name5());
        Assert.assertEquals(employeeManagerPage.phoneInput5().getAttribute("value"),myEmployee.phoneNumber5());
        Assert.assertEquals(employeeManagerPage.emailInput5().getAttribute("value"),myEmployee.email5());
        Assert.assertEquals(employeeManagerPage.titleInput5().getAttribute("value"),myEmployee.title5());
    }
    @Test(priority=2)
    public void testing_delete_button_works()
    throws NoAlertPresentException,InterruptedException {
        employee myEmployee = new employee();
        employeeManagerPage.nameList().click();
        employeeManagerPage.deleteButton().click();
        Alert alert= driver.switchTo().alert();
        Thread.sleep(1000);
        alert.accept();
        employeeManagerPage.searchBox().sendKeys(myEmployee.name());
        Assert.assertEquals(driver.findElement(By.xpath("(//li[@class='listText'])[2]")).getText(), "+ Add Employee");
        
       }
    
    @Test(priority=3)
    public void testing_cancel_button_works()
    {
        employee myEmployee = new employee();
        employeeManagerPage.nameInput1().clear();
        employeeManagerPage.nameInput1().sendKeys(myEmployee.name3());
        employeeManagerPage.cancelButton().click();
        Assert.assertEquals(employeeManagerPage.nameInput1().getAttribute("value"),myEmployee.name());
    }
    
    @Test (priority=4)
    public void testing_search_box()
    {
        employee myEmployee = new employee();
        employeeManagerPage.searchBox().clear();
        employeeManagerPage.searchBox().sendKeys(myEmployee.name2());
        Assert.assertEquals(employeeManagerPage.listText().getText(),myEmployee.name2);
        
    
     }

}

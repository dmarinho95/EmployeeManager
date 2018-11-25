

package first_Automation_test;

import first_Automation_DataFolder.Selectors_Data;
import employee_Manager_Data.Employee_Manager_People;
import first_Automation_DataFolder.Enter_Data_Test;
import java.lang.Object;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.*;


/**
 *
 * @author Daniel Marinho
 */
public class myFirstAutomationTest {
    public String baseUrl = "https://devmountain-qa.github.io/employee-manager-v2/build/index.html";
    String driverPath = "C:\\Users\\Daniel Marinho\\Desktop\\Chrome Driver\\chromedriver.exe";
    public WebDriver driver;
    
            
    
    @BeforeTest
    public void setUpClass() throws Exception 
    {
        System.out.println("Launching Google Chrome Browser");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Daniel Marinho\\Desktop\\Chrome Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        
        driver.get(baseUrl);
        
    }

    @BeforeMethod
    public void refresh() throws Exception
    {
        driver.get(baseUrl);
    }
    
    @Test(priority=1)
    public void verifySaveButtonFunction()
    throws InterruptedException{
        
        
        Employee_Manager_People [] myEmployee_Data = new Employee_Manager_People [5];
        myEmployee_Data[0]=new Employee_Manager_People("Radric Davis","4044040940","atlanta@atl.com","Chairman");
        myEmployee_Data[1]=new Employee_Manager_People("Bill Kapri","7547547575","miamiBeach@florida.com","Vice Chairman");
        myEmployee_Data[2]=new Employee_Manager_People("Dominique Jones","4044042344","StreetLanta@atl.com","Marketing Executive");
        myEmployee_Data[3]=new Employee_Manager_People("David Adeleke","2342340944","Lagos@Lagos.net","Senior Executive");
        myEmployee_Data[4]=new Employee_Manager_People("Daniel Maven","2152678744","NorthPhilly@philly.net","Senior Consultant");
    
        Selectors_Data mySelectors = new Selectors_Data(driver);
        Enter_Data_Test myData = new Enter_Data_Test(driver);
        
        
        myData.clickName(mySelectors.name_Selector1click());
        myData.enterName(mySelectors.getname_Selector1(), myEmployee_Data[0].getName());
        Thread.sleep(1000);
        myData.enterPhoneNumber(mySelectors.getphonenumber_Selector(), myEmployee_Data[0].getPhoneNumber());
        myData.enterEmail(mySelectors.getemail_Selector(),myEmployee_Data[0].getEmail());
        myData.enterTitle(mySelectors.gettitle_Selector(),myEmployee_Data[0].getTitle());
        myData.clickSave();
        //Verifying everything saved
        myData.verification(mySelectors.getname_Selector1(), myEmployee_Data[0].getName());
        myData.verification(mySelectors.getphonenumber_Selector(), myEmployee_Data[0].getPhoneNumber());
        myData.verification(mySelectors.getemail_Selector(), myEmployee_Data[0].getEmail());
        myData.verification(mySelectors.gettitle_Selector(), myEmployee_Data[0].getTitle());
        //Next set 
        myData.clickName(mySelectors.name_Selector2click());
        Thread.sleep(1000);
        myData.enterName(mySelectors.getname_Selector2(), myEmployee_Data[1].getName());  
        myData.enterPhoneNumber(mySelectors.getphonenumber_Selector2(), myEmployee_Data[1].getPhoneNumber());
        myData.enterEmail(mySelectors.getemail_Selector2(),myEmployee_Data[1].getEmail());
        myData.enterTitle(mySelectors.gettitle_Selector2(),myEmployee_Data[1].getTitle());
        myData.clickSave();
        //Verifying next set of everything
        myData.verification(mySelectors.getname_Selector2(), myEmployee_Data[1].getName());
        myData.verification(mySelectors.getphonenumber_Selector2(), myEmployee_Data[1].getPhoneNumber());
        myData.verification(mySelectors.getemail_Selector2(), myEmployee_Data[1].getEmail());
        myData.verification(mySelectors.gettitle_Selector2(), myEmployee_Data[1].getTitle());
        
        
        myData.clickName(mySelectors.name_Selector3click());
        Thread.sleep(1000);
        myData.enterName(mySelectors.getname_Selector3(), myEmployee_Data[2].getName());  
        myData.enterPhoneNumber(mySelectors.getphonenumber_Selector3(), myEmployee_Data[2].getPhoneNumber());
        myData.enterEmail(mySelectors.getemail_Selector3(),myEmployee_Data[2].getEmail());
        myData.enterTitle(mySelectors.gettitle_Selector3(),myEmployee_Data[2].getTitle());
        myData.clickSave();
        //Verifying set 3
        myData.verification(mySelectors.getname_Selector3(), myEmployee_Data[2].getName());
        myData.verification(mySelectors.getphonenumber_Selector3(), myEmployee_Data[2].getPhoneNumber());
        myData.verification(mySelectors.getemail_Selector3(), myEmployee_Data[2].getEmail());
        myData.verification(mySelectors.gettitle_Selector3(), myEmployee_Data[2].getTitle());
       
        myData.clickName(mySelectors.name_Selector4click());
        Thread.sleep(1000);
        myData.enterName(mySelectors.getname_Selector4(), myEmployee_Data[3].getName());  
        myData.enterPhoneNumber(mySelectors.getphonenumber_Selector4(), myEmployee_Data[3].getPhoneNumber());
        myData.enterEmail(mySelectors.getemail_Selector4(),myEmployee_Data[3].getEmail());
        myData.enterTitle(mySelectors.gettitle_Selector4(),myEmployee_Data[3].getTitle());
        myData.clickSave();
        ///Verifying set 4
        myData.verification(mySelectors.getname_Selector4(), myEmployee_Data[3].getName());
        myData.verification(mySelectors.getphonenumber_Selector4(), myEmployee_Data[3].getPhoneNumber());
        myData.verification(mySelectors.getemail_Selector4(), myEmployee_Data[3].getEmail());
        myData.verification(mySelectors.gettitle_Selector4(), myEmployee_Data[3].getTitle());
        //Set 5
        myData.clickName(mySelectors.name_Selector5click());
        Thread.sleep(1000);
        myData.enterName(mySelectors.getname_Selector5(), myEmployee_Data[4].getName());
       
        myData.enterPhoneNumber(mySelectors.getphonenumber_Selector5(), myEmployee_Data[4].getPhoneNumber());
        myData.enterEmail(mySelectors.getemail_Selector5(),myEmployee_Data[4].getEmail());
        myData.enterTitle(mySelectors.gettitle_Selector5(),myEmployee_Data[4].getTitle());
        myData.clickSave();
        //Verifying set 5
        myData.verification(mySelectors.getname_Selector5(), myEmployee_Data[4].getName());
        myData.verification(mySelectors.getphonenumber_Selector5(), myEmployee_Data[4].getPhoneNumber());
        myData.verification(mySelectors.getemail_Selector5(), myEmployee_Data[4].getEmail());
        myData.verification(mySelectors.gettitle_Selector5(), myEmployee_Data[4].getTitle());
        
        
        
        }
    
       
    
    
        @Test(priority=2)
        public void verifyDeleteButtonFunction()
        throws InterruptedException{
        Employee_Manager_People [] myEmployee_Data = new Employee_Manager_People [5];
        myEmployee_Data[0]=new Employee_Manager_People("Radric Davis","4044040940","atlanta@atl.com","Chairman");
        myEmployee_Data[1]=new Employee_Manager_People("Bill Kapri","7547547575","miamiBeach@florida.com","Vice Chairman");
        myEmployee_Data[2]=new Employee_Manager_People("Dominique Jones","4044042344","StreetLanta@atl.com","Marketing Executive");
        myEmployee_Data[3]=new Employee_Manager_People("David Adeleke","2342340944","Lagos@Lagos.net","Senior Executive");
        myEmployee_Data[4]=new Employee_Manager_People("Daniel Maven","2152678744","NorthPhilly@philly.net","Senior Consultant");
    
        Selectors_Data mySelectors = new Selectors_Data(driver);
        Enter_Data_Test myData = new Enter_Data_Test(driver);
        myData.clickName(mySelectors.name_Selector1click());
        Thread.sleep(1000);
        myData.enterName(mySelectors.getname_Selector1(), myEmployee_Data[0].getName());  
        myData.enterPhoneNumber(mySelectors.getphonenumber_Selector(), myEmployee_Data[0].getPhoneNumber());
        myData.enterEmail(mySelectors.getemail_Selector(),myEmployee_Data[0].getEmail());
        myData.enterTitle(mySelectors.gettitle_Selector(),myEmployee_Data[0].getTitle());
        myData.clickSave();
        Thread.sleep(100);
        myData.ClickDelete();
        Thread.sleep(100);
        driver.navigate().refresh();
        myData.EmployeeEntrySelector();
        myData.input(myEmployee_Data[0].getName());
        myData.deleteVerification();
      
        }
    
        @Test (priority=3)
        public void verifyCancelButton()
        throws InterruptedException {
        Employee_Manager_People [] myEmployee_Data = new Employee_Manager_People [5];
        myEmployee_Data[0]=new Employee_Manager_People("Radric Davis","4044040940","atlanta@atl.com","Chairman");
        myEmployee_Data[1]=new Employee_Manager_People("Bill Kapri","7547547575","miamiBeach@florida.com","Vice Chairman");
        myEmployee_Data[2]=new Employee_Manager_People("Dominique Jones","4044042344","StreetLanta@atl.com","Marketing Executive");
        myEmployee_Data[3]=new Employee_Manager_People("David Adeleke","2342340944","Lagos@Lagos.net","Senior Executive");
        myEmployee_Data[4]=new Employee_Manager_People("Daniel Maven","2152678744","NorthPhilly@philly.net","Senior Consultant");
    
        Selectors_Data mySelectors = new Selectors_Data(driver);
        Enter_Data_Test myData = new Enter_Data_Test(driver);
        myData.clickName(mySelectors.name_Selector1click());
        Thread.sleep(1000);
        myData.enterName(mySelectors.getname_Selector1(),"Billy Bob");
        myData.enterPhoneNumber(mySelectors.getphonenumber_Selector(),"1234567890");
        myData.enterEmail(mySelectors.getemail_Selector(), "BillyBob@billybob.com");
        myData.enterTitle(mySelectors.gettitle_Selector(), "Vice Chancellor");
        Thread.sleep(100);
        myData.cancelButton();
       
        myData.cancelButtonVerificaton(mySelectors.getname_Selector1(),myEmployee_Data[1].getName());
        myData.cancelButtonVerificaton(mySelectors.getphonenumber_Selector(),myEmployee_Data[1].getPhoneNumber());
        myData.cancelButtonVerificaton(mySelectors.getemail_Selector(),myEmployee_Data[1].getEmail());
        myData.cancelButtonVerificaton(mySelectors.gettitle_Selector(),myEmployee_Data[1].getTitle());
        
    
        }

        @Test (priority=4)/* Testing Functionality of Search Bar Function*/
        public void SearchBar()
        throws InterruptedException{
        Enter_Data_Test myData = new Enter_Data_Test(driver);
        Employee_Manager_People [] myEmployee_Data = new Employee_Manager_People [5];
        myEmployee_Data[0]=new Employee_Manager_People("Radric Davis","4044040940","atlanta@atl.com","Chairman");
        myEmployee_Data[1]=new Employee_Manager_People("Bill Kapri","7547547575","miamiBeach@florida.com","Vice Chairman");
        myEmployee_Data[2]=new Employee_Manager_People("Dominique Jones","4044042344","StreetLanta@atl.com","Marketing Executive");
        myEmployee_Data[3]=new Employee_Manager_People("David Adeleke","2342340944","Lagos@Lagos.net","Senior Executive");
        myEmployee_Data[4]=new Employee_Manager_People("Daniel Maven","2152678744","NorthPhilly@philly.net","Senior Consultant");
        myData.EmployeeEntrySelector();
        Thread.sleep(1000);
        myData.input(myEmployee_Data[2].getName());
        Thread.sleep(1000);
        myData.searchBar_verification(myEmployee_Data[2].getName());
        
        }
        
    @AfterTest
    public void tearDownMethod() throws Exception 
    {
        driver.quit();
    }
}

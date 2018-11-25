package myprogram.test;
import employee_Manager_Data.Employee_Manager_People;
import employee_Manager_Data.Selectors;
import myprogram.PageObject.EnterData;
import java.lang.Object;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class MyAutomation
{
    public static void main (String []args) throws InterruptedException {
  
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Daniel Marinho\\Desktop\\Chrome Driver\\chromedriver.exe");
        
        
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://devmountain-qa.github.io/employee-manager-v2/build/index.html");
      
    
        Employee_Manager_People [] myEmployee_Data = new Employee_Manager_People [5];
        myEmployee_Data[0]=new Employee_Manager_People("Radric Davis","4044040940","atlanta@atl.com","Chairman");
        myEmployee_Data[1]=new Employee_Manager_People("Bill Kapri","7547547575","miamiBeach@florida.com","Vice Chairman");
        myEmployee_Data[2]=new Employee_Manager_People("Dominique Jones","4044042344","StreetLanta@atl.com","Marketing Executive");
        myEmployee_Data[3]=new Employee_Manager_People("David Adeleke","2342340944","Lagos@Lagos.net","Senior Executive");
        myEmployee_Data[4]=new Employee_Manager_People("Daniel Maven","2152678744","NorthPhilly@philly.net","Senior Consultant");
    
        Selectors mySelectors = new Selectors(driver);
        EnterData myData = new EnterData(driver);
        
        
        myData.clickName(mySelectors.name_Selector1click());
        myData.enterName(mySelectors.getname_Selector1(), myEmployee_Data[0].getName());  
        myData.enterPhoneNumber(mySelectors.getphonenumber_Selector(), myEmployee_Data[0].getPhoneNumber());
        myData.enterEmail(mySelectors.getemail_Selector(),myEmployee_Data[0].getEmail());
        myData.enterTitle(mySelectors.gettitle_Selector(),myEmployee_Data[0].getTitle());
        myData.clickSave();
        //Verifying everything saved
        mySelectors.verification(mySelectors.getname_Selector1(), myEmployee_Data[0].getName());
        mySelectors.verification(mySelectors.getphonenumber_Selector(), myEmployee_Data[0].getPhoneNumber());
        mySelectors.verification(mySelectors.getemail_Selector(), myEmployee_Data[0].getEmail());
        mySelectors.verification(mySelectors.gettitle_Selector(), myEmployee_Data[0].getTitle());
        //Next set 
        myData.clickName(mySelectors.name_Selector2click());
        myData.enterName(mySelectors.getname_Selector2(), myEmployee_Data[1].getName());  
        myData.enterPhoneNumber(mySelectors.getphonenumber_Selector2(), myEmployee_Data[1].getPhoneNumber());
        myData.enterEmail(mySelectors.getemail_Selector2(),myEmployee_Data[1].getEmail());
        myData.enterTitle(mySelectors.gettitle_Selector2(),myEmployee_Data[1].getTitle());
        myData.clickSave();
        //Verifying next set of everything
        mySelectors.verification(mySelectors.getname_Selector2(), myEmployee_Data[1].getName());
        mySelectors.verification(mySelectors.getphonenumber_Selector2(), myEmployee_Data[1].getPhoneNumber());
        mySelectors.verification(mySelectors.getemail_Selector2(), myEmployee_Data[1].getEmail());
        mySelectors.verification(mySelectors.gettitle_Selector2(), myEmployee_Data[1].getTitle());
        //Next set
        myData.clickName(mySelectors.name_Selector3click());
        myData.enterName(mySelectors.getname_Selector3(), myEmployee_Data[2].getName());  
        myData.enterPhoneNumber(mySelectors.getphonenumber_Selector3(), myEmployee_Data[2].getPhoneNumber());
        myData.enterEmail(mySelectors.getemail_Selector3(),myEmployee_Data[2].getEmail());
        myData.enterTitle(mySelectors.gettitle_Selector3(),myEmployee_Data[2].getTitle());
        myData.clickSave();
        //Verifying set 3
        mySelectors.verification(mySelectors.getname_Selector3(), myEmployee_Data[2].getName());
        mySelectors.verification(mySelectors.getphonenumber_Selector3(), myEmployee_Data[2].getPhoneNumber());
        mySelectors.verification(mySelectors.getemail_Selector3(), myEmployee_Data[2].getEmail());
        mySelectors.verification(mySelectors.gettitle_Selector3(), myEmployee_Data[2].getTitle());
        //Next set 
        myData.clickName(mySelectors.name_Selector4click());
        myData.enterName(mySelectors.getname_Selector4(), myEmployee_Data[3].getName());  
        myData.enterPhoneNumber(mySelectors.getphonenumber_Selector4(), myEmployee_Data[3].getPhoneNumber());
        myData.enterEmail(mySelectors.getemail_Selector4(),myEmployee_Data[3].getEmail());
        myData.enterTitle(mySelectors.gettitle_Selector4(),myEmployee_Data[3].getTitle());
        myData.clickSave();
        ///Verifying set 4
        mySelectors.verification(mySelectors.getname_Selector4(), myEmployee_Data[3].getName());
        mySelectors.verification(mySelectors.getphonenumber_Selector4(), myEmployee_Data[3].getPhoneNumber());
        mySelectors.verification(mySelectors.getemail_Selector4(), myEmployee_Data[3].getEmail());
        mySelectors.verification(mySelectors.gettitle_Selector4(), myEmployee_Data[3].getTitle());
        //Set 5
        myData.clickName(mySelectors.name_Selector5click());
        myData.enterName(mySelectors.getname_Selector5(), myEmployee_Data[4].getName());  
        myData.enterPhoneNumber(mySelectors.getphonenumber_Selector5(), myEmployee_Data[4].getPhoneNumber());
        myData.enterEmail(mySelectors.getemail_Selector5(),myEmployee_Data[4].getEmail());
        myData.enterTitle(mySelectors.gettitle_Selector5(),myEmployee_Data[4].getTitle());
        myData.clickSave();
        //Verifying set 5
        mySelectors.verification(mySelectors.getname_Selector5(), myEmployee_Data[4].getName());
        mySelectors.verification(mySelectors.getphonenumber_Selector5(), myEmployee_Data[4].getPhoneNumber());
        mySelectors.verification(mySelectors.getemail_Selector5(), myEmployee_Data[4].getEmail());
        mySelectors.verification(mySelectors.gettitle_Selector5(), myEmployee_Data[4].getTitle());
    }
}
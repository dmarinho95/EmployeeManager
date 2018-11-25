package first_Automation_DataFolder;
import myprogram.PageObject.*;
import employee_Manager_Data.Employee_Manager_People;
import employee_Manager_Data.Selectors;
import java.lang.Object;
import org.openqa.selenium.Alert;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;





public class Enter_Data_Test
{
   public WebDriver data;
    
    public Enter_Data_Test(WebDriver Driver)
    {
        data=Driver;
    }
    
 
    
   
    
    public void clickName (WebElement element_parameter)
    throws InterruptedException{  
      
       WebElement element1=element_parameter;
       element1.click();
       
       
        
    }
    public void enterName(WebElement element_parameter, String str)
    throws InterruptedException{
      
      WebElement element2=element_parameter;
      element2.clear();
      element2.sendKeys(str);
       
    }
    
    public void enterPhoneNumber(WebElement element_parameter, String str)
    {WebElement element= element_parameter;
    element.clear();
    element.sendKeys(str);
    }

    public void enterEmail(WebElement element_parameter, String str)
    {
        WebElement element= element_parameter;
        element.clear();
        element.sendKeys(str);
        
    }
  
    public void enterTitle(WebElement element_parameter,String str)
    {
        WebElement element = element_parameter;
        element.clear();
        element.sendKeys(str);
    }

    public void clickSave()
    {
        data
        .findElement(By.xpath("//button[@name='save'][1]"))
        .click();
       
    }

    public void EmployeeEntrySelector()
    {
         WebDriverWait wait = new WebDriverWait(data,10);
         By element = (By.xpath("//input[@name='searchBox']"));
         wait.until(ExpectedConditions.visibilityOfElementLocated(element)).click();
         
        
    }
 
    
    
     public void verification(WebElement element_parameter,String str2)
    {
        WebElement element = element_parameter;
       
        Assert.assertEquals(element.getAttribute("value"),str2);
      
    }
     public void input(String str)
     {
         WebElement element = data.findElement(By.xpath("//input[@name='searchBox']"));
         element.sendKeys(str);
        
     }
     
     public void deleteVerification()
     {
     
      Assert.assertTrue(data.findElements(By.xpath("(//li[@class='listText'])[3]")).size() < 1) ;
     
               
     }
    
    
    public void ClickDelete()
    throws NoAlertPresentException,InterruptedException{
        data
        .findElement(By.xpath("//button[@name='delete']"))
        .click();
        Alert alert = data.switchTo().alert();
        alert.accept();
           
        
       
    }
    
    public void cancelButton()
    {
     WebDriverWait wait = new WebDriverWait(data,10);
     By element = By.xpath("//button[@class='neutralButton']");
     wait.until(ExpectedConditions.visibilityOfElementLocated(element)).click();
        
    }
    
    public void cancelButtonVerificaton(WebElement element_parameter,String str )
    {
       WebDriverWait wait = new WebDriverWait(data,30);
       WebElement element = element_parameter;
       wait.until(ExpectedConditions.visibilityOf(element));
        Assert.assertEquals(element.getAttribute("value"),str);
       
    }

    public void searchBar_verification(String str)
    {
        WebElement element= data.findElement(By.xpath("//li[@class='listText'][2]"));
        Assert.assertEquals(element.getText(),str);
        
        
        
    }
}

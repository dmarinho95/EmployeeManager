package myprogram.PageObject;
import employee_Manager_Data.Employee_Manager_People;
import employee_Manager_Data.Selectors;
import java.lang.Object;
import  org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class EnterData
{
   public WebDriver data;
    
    public EnterData(WebDriver Driver)
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

 
    

}

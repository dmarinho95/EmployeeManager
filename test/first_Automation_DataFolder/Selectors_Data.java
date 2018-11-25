/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first_Automation_DataFolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.lang.Object;
import org.testng.Assert;
import org.openqa.selenium.NoAlertPresentException;	
import org.openqa.selenium.Alert;



/**
 *
 * @author Daniel Marinho
 */
public class Selectors_Data {
    
    public WebDriver driver;
     
    public WebElement name_SelectorClick1;
    public WebElement name_Selector1;
    public WebElement phonenumber_Selector1;
    public WebElement emailaddress_Selector1;
    public WebElement title_Selector1;
    
    public WebElement name_Selector2click;
    public WebElement name_Selector2;
    public WebElement phonenumber_Selector2;
    public WebElement emailaddress_Selector2;
    public WebElement title_Selector2;
    
    public WebElement name_Selector3click;
    public WebElement name_Selector3;
    public WebElement phonenumber_Selector3;
    public WebElement emailaddress_Selector3;
    public WebElement title_Selector3;
    
    public WebElement name_Selector4click;
    public WebElement name_Selector4;
    public WebElement phonenumber_Selector4;
    public WebElement emailaddress_Selector4;
    public WebElement title_Selector4;
    
    public WebElement name_Selector5click; 
    public WebElement name_Selector5;
    public WebElement phonenumber_Selector5;
    public WebElement emailaddress_Selector5;
    public WebElement title_Selector5;
    
    public Selectors_Data(WebDriver driver_parameter) 
    {
        driver=driver_parameter;
    
    }
    
     public WebElement name_Selector1click() 
    throws InterruptedException{
        //By name_Selectorid=(By.xpath("//li[text()='Daniel']"));
         WebDriverWait wait = new WebDriverWait(driver,10);
        By name_Selectorid=(By.xpath("(//li[@class='listText'])[2]"));
        name_SelectorClick1=wait.until(ExpectedConditions.visibilityOfElementLocated(name_Selectorid));
        
        return name_SelectorClick1;
       //"(//li[text()='Daniel'])")
    }
    
    public WebElement getname_Selector1()
    throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(driver,10);
       By Selector_id = (By.xpath("(//input[@name='nameEntry'])[1]"));
       name_Selector1=wait.until(ExpectedConditions.visibilityOfElementLocated(Selector_id));
       return name_Selector1;
    }
            
    public WebElement getphonenumber_Selector()
    throws InterruptedException{
         WebDriverWait wait = new WebDriverWait(driver,10);
        By Selector_id = (By.xpath( "(//input[@name='phoneEntry'])[1]"));
        phonenumber_Selector1=wait.until(ExpectedConditions.visibilityOfElementLocated(Selector_id));
        return phonenumber_Selector1;
    }

    public WebElement getemail_Selector()
    throws InterruptedException{
         WebDriverWait wait = new WebDriverWait(driver,10);
        By Selector_id =(By.xpath("(//input[@name='emailEntry'])[1]"));
        emailaddress_Selector1=wait.until(ExpectedConditions.visibilityOfElementLocated(Selector_id));
        return emailaddress_Selector1;
    }
    
    public WebElement gettitle_Selector()
    throws InterruptedException{
         WebDriverWait wait = new WebDriverWait(driver,10);
        By Selector_id=(By.xpath("(//input[@name='titleEntry'])[1]"));
        title_Selector1=wait.until(ExpectedConditions.presenceOfElementLocated(Selector_id));
        return title_Selector1;
        
    }

   
    public WebElement name_Selector2click()
    throws InterruptedException{
         WebDriverWait wait = new WebDriverWait(driver,10);
        By Selectorid=(By.xpath("(//li[@class='listText'])[3]"));
        name_Selector2click=wait.until(ExpectedConditions.visibilityOfElementLocated(Selectorid));
        
        return name_Selector2click;
        
        
    }
    
    public WebElement getname_Selector2()
    throws InterruptedException{
         WebDriverWait wait = new WebDriverWait(driver,10);
        By Selectorid=(By.xpath("(//input[@name='nameEntry'])"));
        name_Selector2=wait.until(ExpectedConditions.visibilityOfElementLocated(Selectorid));
        
        return name_Selector2;
        
        
    }
    
    public WebElement getphonenumber_Selector2()
    throws InterruptedException{
         WebDriverWait wait = new WebDriverWait(driver,10);
        By Selector_id = (By.xpath( "(//input[@name='phoneEntry'])"));
        phonenumber_Selector2=wait.until(ExpectedConditions.visibilityOfElementLocated(Selector_id));
        return phonenumber_Selector2;
    }
    
    public WebElement getemail_Selector2()
    throws InterruptedException{
         WebDriverWait wait = new WebDriverWait(driver,10);
        By Selector_id = (By.xpath( "(//input[@name='emailEntry'])"));
        emailaddress_Selector2=wait.until(ExpectedConditions.visibilityOfElementLocated(Selector_id));
        return emailaddress_Selector2;
    }
    
    public WebElement gettitle_Selector2()
    throws InterruptedException{
         WebDriverWait wait = new WebDriverWait(driver,10);
        By Selector_id = (By.xpath("(//input[@name='titleEntry'])"));
        title_Selector2=wait.until(ExpectedConditions.visibilityOfElementLocated(Selector_id));
        return title_Selector2;
        
        
    }
    
   
   public WebElement name_Selector3click()
    throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(driver,10);
        By Selectorid=(By.xpath("(//li[@class='listText'])[4]"));
        name_Selector3click=wait.until(ExpectedConditions.visibilityOfElementLocated(Selectorid));
        
        return name_Selector3click;
        
        
    }
    
    public WebElement getname_Selector3()
    throws InterruptedException{
         WebDriverWait wait = new WebDriverWait(driver,10);
        By Selectorid=(By.xpath("(//input[@name='nameEntry'])"));
        name_Selector3=wait.until(ExpectedConditions.visibilityOfElementLocated(Selectorid));
        
        return name_Selector3;
        
        
    }
    
    public WebElement getphonenumber_Selector3()
    throws InterruptedException{
         WebDriverWait wait = new WebDriverWait(driver,40);
        By Selector_id = (By.xpath( "(//input[@name='phoneEntry'])"));
        phonenumber_Selector3=wait.until(ExpectedConditions.visibilityOfElementLocated(Selector_id));
        return phonenumber_Selector3;
    }
    
    public WebElement getemail_Selector3()
    throws InterruptedException{
         WebDriverWait wait = new WebDriverWait(driver,40);
        By Selector_id = (By.xpath( "(//input[@name='emailEntry'])"));
        emailaddress_Selector3=wait.until(ExpectedConditions.visibilityOfElementLocated(Selector_id));
        return emailaddress_Selector3;
    }
    
    public WebElement gettitle_Selector3()
    throws InterruptedException{
         WebDriverWait wait = new WebDriverWait(driver,40);
        By Selector_id = (By.xpath("(//input[@name='titleEntry'])"));
        title_Selector3=wait.until(ExpectedConditions.visibilityOfElementLocated(Selector_id));
        return title_Selector3;
        
        
    }  
    
    public WebElement name_Selector4click()
    throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(driver,20);
        By Selectorid=(By.xpath("(//li[@class='listText'])[5]"));
        name_Selector4click=wait.until(ExpectedConditions.visibilityOfElementLocated(Selectorid));
        
        return name_Selector4click;
        
        
    }
    
    public WebElement getname_Selector4()
    throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(driver,10);
        Thread.sleep(100);
        By Selectorid=(By.xpath("(//input[@name='nameEntry'])"));
        name_Selector4=wait.until(ExpectedConditions.visibilityOfElementLocated(Selectorid));
        
        return name_Selector4;
        
        
    }
    
    public WebElement getphonenumber_Selector4()
    throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(driver,20);
        By Selector_id = (By.xpath( "(//input[@name='phoneEntry'])"));
        phonenumber_Selector4=wait.until(ExpectedConditions.visibilityOfElementLocated(Selector_id));
        return phonenumber_Selector4;
    }
    
    public WebElement getemail_Selector4()
    throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(driver,20);
        By Selector_id = (By.xpath( "(//input[@name='emailEntry'])"));
        emailaddress_Selector4=wait.until(ExpectedConditions.visibilityOfElementLocated(Selector_id));
        return emailaddress_Selector4;
    }
    
    public WebElement gettitle_Selector4()
    throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(driver,20);
        By Selector_id = (By.xpath("(//input[@name='titleEntry'])"));
        title_Selector4=wait.until(ExpectedConditions.visibilityOfElementLocated(Selector_id));
        return title_Selector4;
        
        
    }  
    
     public WebElement name_Selector5click()
    throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(driver,20);
        By Selectorid=(By.xpath("(//li[@class='listText'])[6]"));
        name_Selector5click=wait.until(ExpectedConditions.visibilityOfElementLocated(Selectorid));
        
        return name_Selector5click;
        
        
    }
    
    public WebElement getname_Selector5()
    throws InterruptedException{
         WebDriverWait wait = new WebDriverWait(driver,20);
        By Selectorid=(By.xpath("(//input[@name='nameEntry'])"));
        name_Selector5=wait.until(ExpectedConditions.visibilityOfElementLocated(Selectorid));
        
        return name_Selector5;
        
        
    }
    
    public WebElement getphonenumber_Selector5()
    throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(driver,20);
        By Selector_id = (By.xpath( "(//input[@name='phoneEntry'])"));
        phonenumber_Selector5=wait.until(ExpectedConditions.visibilityOfElementLocated(Selector_id));
        return phonenumber_Selector5;
    }
    
    public WebElement getemail_Selector5()
    throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(driver,20);
        By Selector_id = (By.xpath( "(//input[@name='emailEntry'])"));
        emailaddress_Selector5=wait.until(ExpectedConditions.visibilityOfElementLocated(Selector_id));
        return emailaddress_Selector5;
    }
    
    public WebElement gettitle_Selector5()
    throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(driver,20);
        By Selector_id = (By.xpath("(//input[@name='titleEntry'])"));
        title_Selector5=wait.until(ExpectedConditions.visibilityOfElementLocated(Selector_id));
        return title_Selector5;
        
        
    }  
    
    
   
    
    
    
    
    

    
}

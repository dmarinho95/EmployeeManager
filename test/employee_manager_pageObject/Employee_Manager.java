/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee_manager_pageObject;

import employee_manager_data.employee;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.NoAlertPresentException;	
import org.openqa.selenium.Alert;



/**
 *
 * @author Daniel Marinho
 */
public class Employee_Manager {
    
    
    
    WebDriver driver;
    
    @FindBy (how=How.XPATH, using="(//li[@class='listText'])[2]")
    WebElement nameList;
    @FindBy(how=How.XPATH, using="(//input[@name='nameEntry'])[1]")
    WebElement nameInput1;
    @FindBy(how=How.XPATH, using="(//input[@name='phoneEntry'])[1]")
    WebElement phoneInput1;
    @FindBy(how=How.XPATH, using="(//input[@name='emailEntry'])[1]")
    WebElement emailInput1;
    @FindBy(how=How.XPATH, using="(//input[@name='titleEntry'])[1]")
    WebElement titleInput1;
    @FindBy(how=How.XPATH,using="(//li[@class='listText'])[3]")
    WebElement nameList2;
    @FindBy(how=How.XPATH, using="(//input[@name='nameEntry'])")
    WebElement nameInput2;
    @FindBy(how=How.XPATH, using="(//input[@name='phoneEntry'])")
    WebElement phoneInput2;
    @FindBy(how=How.XPATH,using="(//input[@name='emailEntry'])")
    WebElement emailInput2;
    @FindBy(how=How.XPATH, using="(//input[@name='titleEntry'])")
    WebElement titleInput2;
    @FindBy(how=How.XPATH, using="(//li[@class='listText'])[4]")
    WebElement nameList3;
    @FindBy(how=How.XPATH, using="(//input[@name='nameEntry'])")
    WebElement nameInput3;
    @FindBy(how=How.XPATH, using="(//input[@name='phoneEntry'])")
    WebElement phoneInput3;
    @FindBy(how=How.XPATH, using="(//input[@name='emailEntry'])")
    WebElement emailInput3;
    @FindBy(how=How.XPATH,using="(//input[@name='titleEntry'])" )
    WebElement titleInput3;
    @FindBy(how=How.XPATH, using="(//li[@class='listText'])[5]")
    WebElement nameList4;
    @FindBy(how=How.XPATH, using="(//input[@name='nameEntry'])")
    WebElement nameInput4;
    @FindBy(how=How.XPATH, using="(//input[@name='phoneEntry'])")
    WebElement phoneInput4;
    @FindBy(how=How.XPATH, using="(//input[@name='emailEntry'])")
    WebElement emailInput4;
    @FindBy(how=How.XPATH,using="(//input[@name='titleEntry'])")
    WebElement titleInput4;
    @FindBy(how=How.XPATH, using="(//li[@class='listText'])[6]")
    WebElement nameList5;
    @FindBy(how=How.XPATH, using="(//input[@name='nameEntry'])")
    WebElement nameInput5;
    @FindBy(how=How.XPATH,using="(//input[@name='phoneEntry'])")
    WebElement phoneInput5;
    @FindBy(how=How.XPATH, using="(//input[@name='emailEntry'])")
    WebElement emailInput5;
    @FindBy(how=How.XPATH, using="(//input[@name='titleEntry'])")
    WebElement titleInput5;
    @FindBy(how=How.XPATH, using="(//button[@name='save'])")
    WebElement saveButton;
    @FindBy(how=How.XPATH, using="(//button[@name='delete'])")
    WebElement deleteButton;
    @FindBy(how=How.XPATH, using="(//input[@name='searchBox'])")
    WebElement searchBox;
    @FindBy(how=How.XPATH, using="(//button[@name='cancel'])")
    WebElement cancelButton;
    @FindBy(how=How.XPATH, using="(//li[@class='listText'][2])")
    WebElement listText;
    ///wait.until(elementToBeClickable(searchButtonXpath));
    
    public Employee_Manager(WebDriver Driver)
    {
        driver=Driver;
    }
    public WebElement nameList()
    {
        return nameList;
    }
    public WebElement nameInput1()
    {
        return nameInput1;
    }
    public WebElement phoneInput1()
    {
        return phoneInput1;
    }
    public WebElement emailInput1()
    {
        return emailInput1;
    }
    public WebElement titleInput1()
    {
        return titleInput1;
    }
    public WebElement nameList2()
    {
        return nameList2;
    }
    public WebElement nameInput2()
    {
        return nameInput2;
    }
    public WebElement phoneInput2()
    {
        return phoneInput2;
    }
    public WebElement emailInput2()
    {
        return emailInput2;
    }
    public WebElement titleInput2()
    {
        return titleInput2;
    }
    public WebElement nameList3()
    {
        return nameList3;
    }
    public WebElement nameInput3()
    {
        return nameInput3;
    }
    public WebElement phoneInput3()
    {
        return phoneInput3;
    }
    public WebElement emailInput3()
    {
        return emailInput3;
    }
    public WebElement titleInput3()
    {
        return titleInput3;
    }
    
   public WebElement nameList4()
   {
       return nameList4;
   }
    
   public WebElement nameInput4()
   {
       return nameInput4;
   }
   
   public WebElement phoneInput4()
   {
       return phoneInput4;
   }
    
   public WebElement emailInput4()
   {
       return emailInput4;
   }
   
   public WebElement titleInput4()
   {
       return titleInput4;
   }
   
   public WebElement nameList5()
   {
       return nameList5;
   }
   public WebElement nameInput5()
   {
       return nameInput5;
   }
   public WebElement phoneInput5()
   {
       return phoneInput5;
   }
   public WebElement emailInput5()
   {
       return emailInput5;
   }
   public WebElement titleInput5()
   {
       return titleInput5;
   }
   public WebElement deleteButton()
   {
       return deleteButton;
   }
   public WebElement searchBox()
   {
       return searchBox;
   }
   public WebElement cancelButton()
   {
       return cancelButton;
   }
   public WebElement listText()
   {
       return listText;
   }
   
    public void Employee1Input(String name, String phone, String email, String title)
    {
        
        nameList.click();
        nameInput1.clear();
        nameInput1.sendKeys(name);
        phoneInput1.clear();
        phoneInput1.sendKeys(phone);
        emailInput1.clear();
        emailInput1.sendKeys(email);
        titleInput1.clear();
        titleInput1.sendKeys(title);
        
    }
    
    public void Employee2Input(String name, String phone, String email, String title)
    {
       nameList2.click();
       nameInput2.clear();
       nameInput2.sendKeys(name);
       phoneInput2.clear();
       phoneInput2.sendKeys(phone);
       emailInput2.clear();
       emailInput2.sendKeys(email);
       titleInput2.clear();
       titleInput2.sendKeys(title);
               
    }
 
    public void Employee3Input(String name, String phone, String email, String title)
    {
        nameList3.click();
        nameInput3.clear();
        nameInput3.sendKeys(name);
        phoneInput3.clear();
        phoneInput3.sendKeys(phone);
        emailInput3.clear();
        emailInput3.sendKeys(email);
        titleInput3.clear();
        titleInput3.sendKeys(title);
        
    }
    
    public void Employee4Input(String name, String phone, String email, String title)
    {
        nameList4.click();
        nameInput4.clear();
        nameInput4.sendKeys(name);
        phoneInput4.clear();
        phoneInput4.sendKeys(phone);
        emailInput4.clear();
        emailInput4.sendKeys(email);
        titleInput4.clear();
        titleInput4.sendKeys(title);
        
    }
    
    public void Employee5Input(String name, String phone, String email, String title)
    {
        nameList5.click();
        nameInput5.clear();
        nameInput5.sendKeys(name);
        phoneInput5.clear();
        phoneInput5.sendKeys(phone);
        emailInput5.clear();
        emailInput5.sendKeys(email);
        titleInput5.clear();
        titleInput5.sendKeys(title);
    }
    
    public void saveButton()
    {
        saveButton.click();
    }
    
    

    
}

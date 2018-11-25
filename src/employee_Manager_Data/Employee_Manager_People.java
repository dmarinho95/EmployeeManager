/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee_Manager_Data;
import org.openqa.selenium.WebElement;
/**
 *
 * @author Daniel Marinho
 */
public class Employee_Manager_People
{
    public String name;
    public String phone_number;
    public String email_address;
    public String title;
    
    
    public Employee_Manager_People(String str1,String str2,String str3,String str4)
    {
        name=str1;
        phone_number=str2;
        email_address=str3;
        title=str4;
        
    }
   
    public String getName()
    {
       return name;
    }
            
    public String getPhoneNumber()
    {
        return phone_number;
    }
            
    public String getEmail()
    {
        return email_address;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    
    
    
}

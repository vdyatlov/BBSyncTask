package com.bbtasksync;

import net.rim.device.api.ui.*;
import net.rim.device.api.ui.component.*;
import net.rim.device.api.ui.container.*;

public final class MyScreen extends MainScreen
{
    public MyScreen() {        
   	
        setTitle("BBTaskSync v0.1");   	  
        BasicEditField enterUserName = new BasicEditField("UserName: ", "", 50, BasicEditField.FILTER_DEFAULT);
        PasswordEditField enterPass = new PasswordEditField("Password: ", "", 50, PasswordEditField.FILTER_DEFAULT);
        CheckboxField rememberMe = new CheckboxField("Remember me", true);
        ButtonField signInButton = new ButtonField("Sign In");
        
        add(enterUserName);
        add(enterPass);
        add(signInButton);
        add(rememberMe);
        
        addMenuItem(moreInfo); 
        
    };

  private MenuItem moreInfo = new MenuItem("More Information", 110, 10)   {
       public void run() {
          Dialog.inform("Hello Pou!");
        }
    };    
    
 //   public void close()   {
 //       Dialog.alert("Goodbye!");     
 //       super.close();
 //   }     
    public boolean onClose() {
        System.exit(0);
       
        return true;    
    }      
}

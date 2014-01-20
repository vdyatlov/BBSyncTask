package com.bbtasksync;

import net.rim.device.api.ui.UiApplication;

public class MyApp extends UiApplication
{

    public static void main(String[] args)
    {
        final MyApp app = new MyApp();
        
        app.enterEventDispatcher();
        
    }
    
    public MyApp()
    {        

        pushScreen(new MyScreen());
    }    
}

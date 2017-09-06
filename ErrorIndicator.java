package com.example.myproject;

import com.vaadin.Application;
import com.vaadin.terminal.UserError;
import com.vaadin.ui.TextField;
import com.vaadin.ui.Window;

public class ErrorIndicator extends Application {
    @Override
    public void init() {
        Window main = new Window();
        final TextField textfield= new TextField("Enter code");
        main.addComponent(textfield);
//        textfield.setComponentError(new Error("Must be letters and numbers"));
        textfield.setComponentError(new UserError("Must be letters and numbers"));
//        main.showNotification("This is the caption", "This is the description");
//        main.showNotification("This is the caption", "This is the description",
//        		Window.Notification.TYPE_WARNING_MESSAGE);
//          main.showNotification("This is the caption", "This is the description",
//        		Window.Notification.TYPE_ERROR_MESSAGE);        

//        main.showNotification("Stays up longer",Window.Notification.TYPE_TRAY_NOTIFICATION); 
        Window.Notification notif = new Window.Notification("Be warned!",
        		"This message lurks in the  top-left corner!",
        		Window.Notification.TYPE_WARNING_MESSAGE);
        
        notif.setPosition(Window.Notification.POSITION_TOP_LEFT);
        notif.setDelayMsec(-1);
        main.showNotification(notif);
        setMainWindow(main);
    }
}

package com.example.myproject;

import java.util.Date;

import com.vaadin.Application;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;

/**
 * Main application class.
 */
public class MyprojectApplication extends Application {

	@Override
	public void init() {
		Window mainWindow = new Window("Myproject Vaadin Application");
		/*
		Label label = new Label("Hello Vaadin user");
		mainWindow.addComponent(label);
		mainWindow.addComponent(
			      new Button("What is the time?",
			 			         new Button.ClickListener() {
			         public void buttonClick(ClickEvent event) {
			            mainWindow.showNotification(
			               "The time is " + new Date());
			         }
			      }));
		Button button = new Button("Push it");
		button.addListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				button.setCaption("You push it");
				if(button.getCaption()=="You push it")
					mainWindow.showNotification("You push");
				
			}
		});
		mainWindow.addComponent(button);
		
		Window mywindow=new Window("My Window");
		Button  close = new Button("close");
		close.addListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				mainWindow.removeWindow(mywindow);
			}
		});
		mywindow.addComponent(close);
		mainWindow.addWindow(mywindow);
		*/
		setMainWindow(mainWindow);
		mainWindow.addComponent(new WindowOpener("Window Opener", mainWindow));
		
		Button closeButton = new Button();
		closeButton.addListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				getMainWindow().getApplication().close();
				setLogoutURL("/test");
			}
		});
		mainWindow.addComponent(closeButton);
	}

}


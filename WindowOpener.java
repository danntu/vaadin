package com.example.myproject;


import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;
import com.vaadin.ui.Window.CloseListener;

public class WindowOpener extends CustomComponent{
	Window mainwindow;
	Window mywindow;
	Button openbutton;
	Button closebutton;
	Label explanation;
	
	public WindowOpener(String label, Window main){
		mainwindow=main;
		final VerticalLayout layout = new VerticalLayout();
		openbutton = new Button("Open Window",this,"openButtonClick");
		explanation = new Label("Explanation");
		layout.addComponent(openbutton);
		layout.addComponent(explanation);
		setCompositionRoot(layout);
	}
	public void openButtonClick(Button.ClickEvent event){
		mywindow = new Window("MyDialog");
		mywindow.setHeight("200px");
		mywindow.setWidth("400px");
		mywindow.setPositionX(200);
		mywindow.setPositionY(100);
		
		mainwindow.addWindow(mywindow);
		//mywindow.addListener((CloseListener)this);
		mywindow.addComponent(new Label("A text label in the window"));
		closebutton = new Button("Close",this,"closeButtonClick");
		mywindow.addComponent(closebutton);
		openbutton.setEnabled(false);
		explanation.setValue("Window opened");
	}
	public void closeButtonClick(Button.ClickEvent event){
		mainwindow.removeWindow(mywindow);
		openbutton.setEnabled(true);
		explanation.setValue("Close with button");
	}
	
	public void windowClose(com.vaadin.ui.Window.CloseEvent e){
		openbutton.setEnabled(true);
		explanation.setValue("Closed with window controls");
	}
}

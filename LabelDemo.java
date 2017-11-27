package com.example.myproject;

import com.vaadin.Application;
import com.vaadin.terminal.ClassResource;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

@SuppressWarnings("unused")
public class LabelDemo extends Application{
	@SuppressWarnings("deprecation")
	public void init(){
		Window mainWindow = new Window("Vaadin6 Label Example");
		setMainWindow(mainWindow);
		
		VerticalLayout layout = new VerticalLayout();
		Label label = new Label("Labeling can be dangerous VerticalLayout");
		layout.addComponent(label);
		mainWindow.addComponent(layout);
				
		Panel panel = new Panel("Panel Containing a Label");
		panel.setWidth("300px");
		panel.addComponent(
			    new Label("This is a Label inside a Panel. There is " +
			              "enough text in the label to make the text " +
			              "wrap when it exceeds the width of the panel."));
		mainWindow.addComponent(panel);
		
		GridLayout labelgrid = new GridLayout(2,1);
		labelgrid.addComponent(new Label("CONTENT_DEFAULT"));
		labelgrid.addComponent(new Label(" This is a label in default mode: <plain text>",
				Label.CONTENT_DEFAULT));
		
		labelgrid.addComponent(new Label("CONTENT_PREFORMATTED "));
		labelgrid.addComponent(new Label("This is a preformatted label.\n"
				+ "The newline character \\n breaks line."
				+ "",Label.CONTENT_PREFORMATTED));
		labelgrid.addComponent (new Label ("CONTENT_RAW"));
		labelgrid.addComponent (
		    new Label ("This is a label in raw mode.<br>It can contain, "+
		               "for example, unbalanced markup.",
		               Label.CONTENT_RAW));

		labelgrid.addComponent (new Label ("CONTENT_TEXT"));
		labelgrid.addComponent (
		    new Label ("This is a label in (plain) text mode",
		               Label.CONTENT_TEXT));

		labelgrid.addComponent (new Label ("CONTENT_XHTML"));
		labelgrid.addComponent (
		    new Label ("<i>This</i> is an <b>XHTML</b> formatted label",
		               Label.CONTENT_XHTML));

		labelgrid.addComponent (new Label ("CONTENT_XML"));
		labelgrid.addComponent (
		    new Label ("This is an <myelement>XML</myelement> "+
		               "formatted label",
		               Label.CONTENT_XML));
		mainWindow.addComponent(labelgrid);
		
		ClassResource labelimage = new ClassResource("/home/mdaniyar/workspace/myproject/src/com/example/myproject/smile.png", this);
		mainWindow.addComponent(new Label(labelimage.getApplication().toString()));
		mainWindow.addComponent(new Label("Here we have an image <img src=\""+
				this.getRelativeLocation(labelimage)+
				"\"/> within text.",Label.CONTENT_XHTML));
		
		
	}
}

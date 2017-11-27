package com.example.myproject;

import com.vaadin.Application;
import com.vaadin.terminal.ExternalResource;
import com.vaadin.terminal.ThemeResource;
import com.vaadin.ui.*;

import java.util.Date;

public class LinkDemo extends Application implements Button.ClickListener{
    Button button;
    @Override
    public void init() {
        Window main = new Window("Vaadin6 Link Example");
        setMainWindow(main);
        VerticalLayout layout = new VerticalLayout();

        Link link = new Link("Click me", new ExternalResource("http://vaadin.com"));
        layout.addComponent(link);
        Link linkicon = new Link(null, new ExternalResource("http://google.com"));
        linkicon.setTargetName("_blank");
        linkicon.setIcon(new ThemeResource("smile.png"));
        layout.addComponent(linkicon);

        TextArea textArea = new TextArea("Big Area");
        textArea.setValue("a row\n Another row\n" +
                "yet anotherrow");
        layout.addComponent(textArea);

        PasswordField passwordField = new PasswordField("Keep it secret");
        layout.addComponent(passwordField);

        RichTextArea richTextArea = new RichTextArea("My Rich Text Area");
        richTextArea.setValue("Hi");
        //richTextArea.setReadOnly(true);
        layout.addComponent(richTextArea);

        DateField date = new DateField();
        date.setValue(new Date());
        layout.addComponent(date);

        button = new Button("Do not push this button");
        button.addListener(this);
        layout.addComponent(button);


        main.addComponent(layout);
    }

    @Override
    public void buttonClick(Button.ClickEvent clickEvent) {
        button.setCaption("Do not push this button again");
    }
}

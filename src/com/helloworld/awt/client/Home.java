package com.helloworld.awt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

public class Home implements EntryPoint {

	private Button btn;
	private Button btn2;

	@Override
	public void onModuleLoad() {

		btn = new Button("Click Me");
		btn2 = new Button("Test");
		btn.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
//				Window.alert("Click Event");
				btn2.setText("Cool");
				
			}
		});

		RootPanel.get().add(btn);
		RootPanel.get().add(btn2);

	}

}

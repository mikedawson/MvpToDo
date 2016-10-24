package com.ustadmobile.mvptodo.port.gwt.view;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;
import com.ustadmobile.mvptodo.core.view.ToDoListView;

public class ToDoListViewGwtImpl extends Composite implements ToDoListView, IsWidget{
	
	SimplePanel viewPanel = new SimplePanel();

	Element nameSpan = DOM.createSpan();
	
	public ToDoListViewGwtImpl() {
		viewPanel.getElement().appendChild(nameSpan);
		initWidget(viewPanel);
	}
	
	
	@Override
	public void addItem(boolean completed, String description) {
		// TODO Auto-generated method stub
		
		Element descDiv = DOM.createDiv();
		descDiv.setInnerText(description);
		viewPanel.getElement().appendChild(descDiv);
	}

	@Override
	public void removeAllItems() {
		// TODO Auto-generated method stub
		
	}
	
	

}

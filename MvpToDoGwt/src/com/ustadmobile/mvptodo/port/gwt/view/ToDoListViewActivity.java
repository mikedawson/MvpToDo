package com.ustadmobile.mvptodo.port.gwt.view;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.IsWidget;
import com.sun.security.sasl.ClientFactoryImpl;
import com.ustadmobile.mvptodo.core.presenter.ToDoListPresenter;
import com.ustadmobile.mvptodo.core.view.ToDoListView;

public class ToDoListViewActivity extends AbstractActivity{

	
	private ClientFactory clientFactory;
	
	private ToDoListPresenter presenter;
	
	public ToDoListViewActivity(ToDoListViewPlace place, ClientFactory clientFactory) {
		//from example
		//this.name = place.getHelloName();
		this.clientFactory = clientFactory;
	}
	
	public void start(AcceptsOneWidget containerWidget, EventBus eventBus) {
		ToDoListView todoListView = clientFactory.getToDoListView();
		todoListView.addItem(true, "Do Something useful");
		
		//from example:
		//helloView.setName(name);
        //helloView.setPresenter(this);
		containerWidget.setWidget(((IsWidget)todoListView).asWidget());
	}
	
}

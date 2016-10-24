package com.ustadmobile.mvptodo.port.gwt.view;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.place.shared.PlaceController;
import com.ustadmobile.mvptodo.core.view.ToDoListView;

public class ClientFactoryImpl implements ClientFactory{

	private final EventBus eventBus = new SimpleEventBus();
	
	private final PlaceController placeController = new PlaceController(eventBus);
	
	private final ToDoListView toDoListView = new ToDoListViewGwtImpl();
	
	@Override
	public EventBus getEventBus() {
		// TODO Auto-generated method stub
		return eventBus;
	}

	@Override
	public PlaceController getPlaceController() {
		// TODO Auto-generated method stub
		return placeController;
	}

	@Override
	public ToDoListView getToDoListView() {
		// TODO Auto-generated method stub
		return toDoListView;
	}
	

}

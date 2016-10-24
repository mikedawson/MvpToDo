package com.ustadmobile.mvptodo.port.gwt.view;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;
import com.ustadmobile.mvptodo.core.view.ToDoListView;

public interface ClientFactory {
	
	EventBus getEventBus();
    PlaceController getPlaceController();
    ToDoListView getToDoListView();

}

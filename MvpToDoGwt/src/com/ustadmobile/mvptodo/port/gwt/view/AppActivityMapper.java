package com.ustadmobile.mvptodo.port.gwt.view;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;

public class AppActivityMapper implements ActivityMapper{

	private ClientFactory clientFactory;
	
	public AppActivityMapper(ClientFactory clientFactory) {
		this.clientFactory = clientFactory;
	}
	
	@Override
	public Activity getActivity(Place place) {
		// TODO Auto-generated method stub
		if(place instanceof ToDoListViewPlace) {
			return new ToDoListViewActivity((ToDoListViewPlace)place, clientFactory);
		}
		
		return null;
	}

}

package com.ustadmobile.mvptodo.core.model;

/**
 * Created by mike on 10/23/16.
 */

public class ToDoItem {

    private boolean done;

    private String description;


    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getButtonStr() {
        return "ask me";
    }
}

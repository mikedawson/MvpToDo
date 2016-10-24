package com.ustadmobile.mvptodo.core.impl;

public abstract class SystemImpl {

    private static SystemImpl instance;

    public SystemImpl getInstance() {
        return instance;
    }


    public abstract void go(Object context, Class viewClass);

    public abstract void putValue(Object context, String key, String value);

    public abstract void getValue(Object context, String key, String value);

}

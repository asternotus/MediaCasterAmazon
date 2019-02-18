package com.mediacasteramazon.wizzard.mediacasteramazon.ui.presenters;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.OnLifecycleEvent;
import android.util.Log;

import com.mediacasteramazon.wizzard.mediacasteramazon.ui.interfaces.IDeviceBrowserScreenView;
import com.mediacasteramazon.wizzard.mediacasteramazon.ui.presenters.interfaces.IDeviceBrowserPresenter;

public class DeviceBrowserPresenter extends ScreenPresenter<IDeviceBrowserScreenView> implements IDeviceBrowserPresenter {

    private final String LOG_TAG = DeviceBrowserPresenter.class.getSimpleName();

    public DeviceBrowserPresenter(IDeviceBrowserScreenView screenView) {
        super(screenView);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        Log.d(LOG_TAG, "resumed observing lifecycle.");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        Log.d(LOG_TAG, "paused observing lifecycle.");
    }
}


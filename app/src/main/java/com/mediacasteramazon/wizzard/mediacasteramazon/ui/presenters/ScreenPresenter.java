package com.mediacasteramazon.wizzard.mediacasteramazon.ui.presenters;

import android.arch.lifecycle.ViewModel;

import com.mediacasteramazon.wizzard.mediacasteramazon.ui.interfaces.IScreenView;

public class ScreenPresenter<T extends IScreenView> extends ViewModel {

    private final T screenView;

    public ScreenPresenter(T screenView) {
        this.screenView = screenView;
    }

    public T getScreenView() {
        return screenView;
    }
}
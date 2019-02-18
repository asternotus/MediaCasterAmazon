package com.mediacasteramazon.wizzard.mediacasteramazon.ui.presenters;

import com.mediacasteramazon.wizzard.mediacasteramazon.ui.interfaces.ISettingsScreenView;
import com.mediacasteramazon.wizzard.mediacasteramazon.ui.presenters.interfaces.ISettingsPresenter;

public class SettingsPresenter extends ScreenPresenter<ISettingsScreenView> implements ISettingsPresenter {
    public SettingsPresenter(ISettingsScreenView screenView) {
        super(screenView);
    }
}
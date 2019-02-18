package com.mediacasteramazon.wizzard.mediacasteramazon.ui.presenters;

import com.mediacasteramazon.wizzard.mediacasteramazon.ui.interfaces.IMediaPickerScreenView;
import com.mediacasteramazon.wizzard.mediacasteramazon.ui.presenters.interfaces.IMediaPickerPresenter;

public class MediaPickerPresenter extends ScreenPresenter<IMediaPickerScreenView> implements IMediaPickerPresenter {
    public MediaPickerPresenter(IMediaPickerScreenView screenView) {
        super(screenView);
    }
}

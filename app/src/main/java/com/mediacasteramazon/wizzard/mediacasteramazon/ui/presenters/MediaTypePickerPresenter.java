package com.mediacasteramazon.wizzard.mediacasteramazon.ui.presenters;

import com.mediacasteramazon.wizzard.mediacasteramazon.ui.interfaces.IMediaTypePickerScreenView;
import com.mediacasteramazon.wizzard.mediacasteramazon.ui.presenters.interfaces.IMediaTypePickerPresenter;

public class MediaTypePickerPresenter extends ScreenPresenter<IMediaTypePickerScreenView> implements IMediaTypePickerPresenter {
    public MediaTypePickerPresenter(IMediaTypePickerScreenView screenView) {
        super(screenView);
    }
}

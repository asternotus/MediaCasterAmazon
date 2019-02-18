package com.mediacasteramazon.wizzard.mediacasteramazon.ui.presenters;

import com.mediacasteramazon.wizzard.mediacasteramazon.ui.interfaces.ICastScreenView;
import com.mediacasteramazon.wizzard.mediacasteramazon.ui.presenters.interfaces.ICastPresenter;

public class CastPresenter extends ScreenPresenter<ICastScreenView> implements ICastPresenter {
    public CastPresenter(ICastScreenView screenView) {
        super(screenView);
    }
}

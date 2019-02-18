package com.mediacasteramazon.wizzard.mediacasteramazon.ui.presenters;

import com.mediacasteramazon.wizzard.mediacasteramazon.ui.interfaces.ITranscodingScreenView;
import com.mediacasteramazon.wizzard.mediacasteramazon.ui.presenters.interfaces.ITranscodingPresenter;

public class TranscodingPresenter extends ScreenPresenter<ITranscodingScreenView> implements ITranscodingPresenter {

    public TranscodingPresenter(ITranscodingScreenView screenView) {
        super(screenView);
    }
}

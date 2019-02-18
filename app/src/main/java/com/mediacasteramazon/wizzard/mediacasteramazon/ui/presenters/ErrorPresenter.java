package com.mediacasteramazon.wizzard.mediacasteramazon.ui.presenters;

import com.mediacasteramazon.wizzard.mediacasteramazon.ui.interfaces.IErrorScreenView;
import com.mediacasteramazon.wizzard.mediacasteramazon.ui.presenters.interfaces.IErrorPresenter;

public class ErrorPresenter extends ScreenPresenter<IErrorScreenView> implements IErrorPresenter {
    public ErrorPresenter(IErrorScreenView screenView) {
        super(screenView);
    }
}

package com.mediacasteramazon.wizzard.mediacasteramazon.ui.presenters.factories;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import com.mediacasteramazon.wizzard.mediacasteramazon.ui.interfaces.ICastScreenView;
import com.mediacasteramazon.wizzard.mediacasteramazon.ui.interfaces.IDeviceBrowserScreenView;
import com.mediacasteramazon.wizzard.mediacasteramazon.ui.interfaces.IErrorScreenView;
import com.mediacasteramazon.wizzard.mediacasteramazon.ui.interfaces.IMediaPickerScreenView;
import com.mediacasteramazon.wizzard.mediacasteramazon.ui.interfaces.IMediaTypePickerScreenView;
import com.mediacasteramazon.wizzard.mediacasteramazon.ui.interfaces.IScreenView;
import com.mediacasteramazon.wizzard.mediacasteramazon.ui.interfaces.ISettingsScreenView;
import com.mediacasteramazon.wizzard.mediacasteramazon.ui.interfaces.ITranscodingScreenView;
import com.mediacasteramazon.wizzard.mediacasteramazon.ui.presenters.CastPresenter;
import com.mediacasteramazon.wizzard.mediacasteramazon.ui.presenters.DeviceBrowserPresenter;
import com.mediacasteramazon.wizzard.mediacasteramazon.ui.presenters.ErrorPresenter;
import com.mediacasteramazon.wizzard.mediacasteramazon.ui.presenters.MediaPickerPresenter;
import com.mediacasteramazon.wizzard.mediacasteramazon.ui.presenters.MediaTypePickerPresenter;
import com.mediacasteramazon.wizzard.mediacasteramazon.ui.presenters.SettingsPresenter;
import com.mediacasteramazon.wizzard.mediacasteramazon.ui.presenters.TranscodingPresenter;

public class PresenterFactory implements ViewModelProvider.Factory {

    private final IScreenView screenView;

    public PresenterFactory(IScreenView screenView) {
        this.screenView = screenView;
    }

    public <T extends ViewModel> T create(Class<T> modelClass) {
        if (modelClass.isAssignableFrom(DeviceBrowserPresenter.class)) {
            return (T) new DeviceBrowserPresenter((IDeviceBrowserScreenView) screenView);
        }

        if (modelClass.isAssignableFrom(MediaPickerPresenter.class)) {
            return (T) new MediaPickerPresenter((IMediaPickerScreenView) screenView);
        }

        if (modelClass.isAssignableFrom(MediaTypePickerPresenter.class)) {
            return (T) new MediaTypePickerPresenter((IMediaTypePickerScreenView) screenView);
        }

        if (modelClass.isAssignableFrom(ErrorPresenter.class)) {
            return (T) new ErrorPresenter((IErrorScreenView) screenView);
        }

        if (modelClass.isAssignableFrom(TranscodingPresenter.class)) {
            return (T) new TranscodingPresenter((ITranscodingScreenView) screenView);
        }

        if (modelClass.isAssignableFrom(CastPresenter.class)) {
            return (T) new CastPresenter((ICastScreenView) screenView);
        }

        if (modelClass.isAssignableFrom(SettingsPresenter.class)) {
            return (T) new SettingsPresenter((ISettingsScreenView) screenView);
        }

        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}

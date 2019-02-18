package com.mediacasteramazon.wizzard.mediacasteramazon.ui.activities;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.GridView;

import com.mediacasteramazon.wizzard.mediacasteramazon.R;
import com.mediacasteramazon.wizzard.mediacasteramazon.ui.interfaces.IMediaTypePickerScreenView;
import com.mediacasteramazon.wizzard.mediacasteramazon.ui.presenters.MediaTypePickerPresenter;
import com.mediacasteramazon.wizzard.mediacasteramazon.ui.presenters.factories.PresenterFactory;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MediaTypePickerActivity extends AppCompatActivity implements IMediaTypePickerScreenView {

    private MediaTypePickerPresenter mediaTypePickerPresenter;
    private Toolbar myToolbar;

    @BindView(R.id.media_type_picker_screen_gv_mediatype_list)
    GridView gv_mediatype_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_type_picker);
        ButterKnife.bind(this);

        toolbarSetup();

        PresenterFactory factory = new PresenterFactory(this);
        mediaTypePickerPresenter = ViewModelProviders.of(this, factory).get(MediaTypePickerPresenter.class);

        getLifecycle().addObserver(mediaTypePickerPresenter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.settings_menu:
                // Do whatever you want to do on logout click.
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void toolbarSetup() {
        myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }
}

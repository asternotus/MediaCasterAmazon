package com.mediacasteramazon.wizzard.mediacasteramazon.ui.activities;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.mediacasteramazon.wizzard.mediacasteramazon.R;
import com.mediacasteramazon.wizzard.mediacasteramazon.ui.interfaces.IErrorScreenView;
import com.mediacasteramazon.wizzard.mediacasteramazon.ui.presenters.ErrorPresenter;
import com.mediacasteramazon.wizzard.mediacasteramazon.ui.presenters.factories.PresenterFactory;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ErrorActivity extends AppCompatActivity implements IErrorScreenView {

    private ErrorPresenter errorPresenter;
    private Toolbar myToolbar;

    @BindView(R.id.error_screen_tv_title)
    TextView tv_title;

    @BindView(R.id.error_screen_tv_hint)
    TextView tv_hint;

    @BindView(R.id.error_screen_iv_connection_error)
    ImageView iv_connection_error;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_error);
        ButterKnife.bind(this);

        toolbarSetup();

        PresenterFactory factory = new PresenterFactory(this);
        errorPresenter = ViewModelProviders.of(this, factory).get(ErrorPresenter.class);

        getLifecycle().addObserver(errorPresenter);
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

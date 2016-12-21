package com.example.woowahan.retrofit2exp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FlickrContract.View {

    FlickrContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setPresenter(new FlickrPresenter(this));
    }

    @Override
    protected void onResume() {
        super.onResume();
        this.presenter.start();
    }

    @Override
    public void setPresenter(FlickrContract.Presenter presenter) {
        this.presenter = presenter;
    }
}

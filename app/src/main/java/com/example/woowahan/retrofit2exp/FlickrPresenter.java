package com.example.woowahan.retrofit2exp;

import android.content.Context;

import retrofit2.Retrofit;

public class FlickrPresenter implements FlickrContract.Presenter {

    Context ctx;

    public FlickrPresenter(Context ctx) {
        this.ctx = ctx;
    }

    @Override
    public void start() {

    }

    @Override
    public void loadFlickrImages(Context ctx) {
        Retrofit.Builder retrofitBuilder = new Retrofit.Builder();
    }

}

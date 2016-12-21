package com.example.woowahan.retrofit2exp;

import android.content.Context;

public interface FlickrContract {

    interface View extends BaseView<Presenter> {

    }

    interface Presenter extends BasePresenter {
        void loadFlickrImages(Context ctx);
    }

}

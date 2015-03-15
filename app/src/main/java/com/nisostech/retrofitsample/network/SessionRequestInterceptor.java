package com.nisostech.retrofitsample.network;

import retrofit.RequestInterceptor;

/**
 * Created by Soham Banerjee on 13/3/15.
 */

public class SessionRequestInterceptor implements RequestInterceptor {
    private static final String TAG = SessionRequestInterceptor.class.getSimpleName();

    @Override
    public void intercept(RequestFacade request) {
        request.addHeader("Content-Type", "application/json");//you can add header here if you need in your api
    }
}
package com.nisostech.retrofitsample.network;

import retrofit.Callback;
import retrofit.RetrofitError;

/**
 * Created by Soham Banerjee on 13/3/15.
 */

public abstract class RestCallback<T> implements Callback<T> {
    public abstract void failure(RestError restError);

    @Override
    public void failure(RetrofitError error) {
        RestError restError = (RestError) error.getBodyAs(RestError.class); // create your own class as
        // how the error message gonna showup from server side if there is an error
        if (restError != null)
            failure(restError);
        else {
            failure(new RestError(error.getMessage()));
        }
    }
}
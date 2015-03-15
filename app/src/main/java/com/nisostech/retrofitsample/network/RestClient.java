package com.nisostech.retrofitsample.network;


import com.squareup.okhttp.OkHttpClient;

import retrofit.RestAdapter;
import retrofit.client.OkClient;

/**
 * Created by Soham Banerjee on 1/25/15.
 */

public class RestClient {

    private static Restapi REST_CLIENT;
    private static String ROOT =
            "http://192.168.1.10/testapp";


    static {
        setupRestClient();
    }

    public static Restapi get() {
        return REST_CLIENT;
    }

    private static void setupRestClient() {


        RestAdapter restAdapter = new RestAdapter.Builder()
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .setEndpoint(ROOT)
                .setClient(new OkClient(new OkHttpClient()))
                .setRequestInterceptor(new SessionRequestInterceptor())
                .build();

        REST_CLIENT = restAdapter.create(Restapi.class);
    }
}
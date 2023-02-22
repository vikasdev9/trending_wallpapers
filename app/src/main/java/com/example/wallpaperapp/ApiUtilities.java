package com.example.wallpaperapp;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiUtilities {
    private static  Retrofit retrofit=null;
    public static final String API="563492ad6f917000010000014470c006a6cd49e495a1334f9a8ba824";

    public static ApiInterface getApiInterface()
    {
        if (retrofit==null)
        {
            retrofit=new Retrofit.Builder().baseUrl(ApiInterface.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit.create(ApiInterface.class);
    }
}

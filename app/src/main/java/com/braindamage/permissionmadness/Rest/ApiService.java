package com.braindamage.permissionmadness.Rest;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Chuck Norris on 25/09/16.
 */
public class ApiService {


    private static Retrofit retrofit;
    private static ApiService apiService;
    private static String BASE_URL;

    public ApiService(String BASE_URL)
    {
        ApiService.BASE_URL = BASE_URL;
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .client(new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build())
                .baseUrl(BASE_URL)
                .build();



    }

    public RestService getInstance(){
        if(apiService == null){
            apiService = new ApiService(BASE_URL);
        }

        return retrofit.create(RestService.class);
    }
}

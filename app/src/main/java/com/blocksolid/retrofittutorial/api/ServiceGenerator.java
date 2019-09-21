package com.blocksolid.retrofittutorial.api;

import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;

public class ServiceGenerator {

    // users/{user}
    // https://api.github.com/users/sathyaBabu


    //     BASE URL                           tail
    // https://api.github.com/            users/sathyaBabu

   // https://github.com/sathyaBabu


// https://github.com/square/okhttp/wiki/Interceptors

    // Tail @GET methods
    // https://github.com/codepath/android_guides/wiki/Consuming-APIs-with-Retrofit


    // https://square.github.io/retrofit/

    // https://square.github.io/okhttp/3.x/okhttp/okhttp3/OkHttpClient.html

    public static final String API_BASE_URL = "https://api.github.com/";

    private static HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
    private static Interceptor logging = interceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);

    private static OkHttpClient httpClient = new OkHttpClient.Builder()
            .readTimeout(500, TimeUnit.MILLISECONDS) // change to 50

            .addInterceptor(logging)
            .build();


    private static Retrofit.Builder builder =
            new Retrofit.Builder()
                    .baseUrl(API_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create());

    public static <S> S createService(Class<S> serviceClass) {
        Retrofit retrofit = builder.client(httpClient).build();
        return retrofit.create(serviceClass);
    }
}

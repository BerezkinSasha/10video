package com.example.a10video;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MovieApi {
    //https://run.mocky.io/  v3/079a7390-bb2d-4585-a9fd-b42aa447301e

    @GET("v3/d1301191-62eb-414e-b188-cb1fd18e2a76")
    Call<List<Movie>> getMovies();
}

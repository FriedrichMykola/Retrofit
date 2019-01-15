package com.example.business.friedrich.kuzan.retrofit;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {

    @GET("/posts")
    Call<ArrayList<Post>> getPosts();

}

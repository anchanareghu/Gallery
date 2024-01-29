package com.example.gallery02;
import java.util.ArrayList;
import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitAPI {
    @GET("G209")

    Call<ArrayList<DataFromJson>> getAllImages();
}
package com.example.gallery02;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends Activity {
    private RecyclerView recyclerView;
    private ArrayList<DataFromJson> dataArrayList;
    private RecyclerView.Adapter<RecyclerViewHolder> adapter;
    private ProgressBar progressBar;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Tasks.await(SafetyNet.getClient(this).initSafeBrowsing());
        setContentView(R.layout.layout_recycler);
        recyclerView = findViewById(R.id.recyclerView);
        progressBar = findViewById(R.id.loader);

//        String json = "https://jsonplaceholder.typicode.com/photos";
//        https://json.extendsclass.com/bin/9eeca7c85af3
        dataArrayList = new ArrayList<>();

        getAllImages();
    }

    private void getAllImages() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonkeeper.com/b/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        RetrofitAPI retrofitAPI = retrofit.create(RetrofitAPI.class);

        Call<ArrayList<DataFromJson>> call = retrofitAPI.getAllImages();


        call.enqueue(new Callback<ArrayList<DataFromJson>>() {
            @Override
            public void onResponse(Call<ArrayList<DataFromJson>> call, Response<ArrayList<DataFromJson>> response) {

                if (response.isSuccessful()) {
                    progressBar.setVisibility(View.GONE);
                    dataArrayList = response.body();

                    for (int i = 0; i < dataArrayList.size(); i++) {
                        adapter = new RecyclerAdapter(dataArrayList);
                        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL);
                        recyclerView.setLayoutManager(staggeredGridLayoutManager);
                        recyclerView.setAdapter(adapter);

                    }
                }
            }

            @Override
            public void onFailure(Call<ArrayList<DataFromJson>> call, Throwable t) {

                Toast.makeText(MainActivity.this, "Failed", Toast.LENGTH_SHORT).show();
                t.printStackTrace();
            }
        });
    }
}








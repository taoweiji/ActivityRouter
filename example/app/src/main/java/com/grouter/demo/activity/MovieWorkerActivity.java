package com.grouter.demo.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.grouter.GRouter;
import com.grouter.RouterActivity;
import com.grouter.RouterField;

@RouterActivity("movie/worker")
public class MovieWorkerActivity extends AppCompatActivity {
    @RouterField
    public String movieId;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GRouter.inject(this);
        setTitle(getClass().getSimpleName());
    }
}

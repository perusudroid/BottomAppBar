package com.perusudroid.bottombar;

import android.os.Bundle;
import android.view.Menu;

import com.google.android.material.bottomappbar.BottomAppBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CustomAdapter customAdapter;
    private BottomAppBar bottom_app_bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();
        setAssets();
    }

    private void bindViews() {
        recyclerView = findViewById(R.id.recyclerView);
        bottom_app_bar = findViewById(R.id.bottom_app_bar);
    }

    private void setAssets() {
        setSupportActionBar(bottom_app_bar);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        customAdapter = new CustomAdapter();
        recyclerView.setAdapter(customAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.bottomappbar_menu, menu);
        return true;
    }
}

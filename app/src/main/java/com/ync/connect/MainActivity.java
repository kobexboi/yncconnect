package com.ync.connect;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ync.connect.adapter.MainMenuAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private TextView appTitle;
    private RecyclerView mainMenuRecylcerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appTitle = findViewById(R.id.app_title);
        mainMenuRecylcerView = findViewById(R.id.main_menu_recylcerview);
        mainMenuRecylcerView.setLayoutManager(new LinearLayoutManager(this));

        List<String> menuTitles = new ArrayList<>();
        menuTitles.add("Search");
        menuTitles.add("Group search");
        menuTitles.add("Directory");
        menuTitles.add("Upcoming birthdays");

        mainMenuRecylcerView.setAdapter(new MainMenuAdapter(this, menuTitles));

    }
}
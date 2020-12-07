package com.littleit.coding.mybookapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.littleit.coding.mybookapp.Adapter.TitleAdapter;
import com.littleit.coding.mybookapp.Interface.TitleClickListener;
import com.littleit.coding.mybookapp.Model.Constants;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private Context mContex;
    private ArrayList<String> titleList;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContex = MainActivity.this;

        titleList = new ArrayList<String>();
        titleList.add(Constants.TITLEA);
        titleList.add(Constants.TITLEB);
        titleList.add(Constants.TITLEC);
        titleList.add(Constants.TITLED);
        titleList.add(Constants.TITLEE);
        titleList.add(Constants.TITLEF);
        titleList.add(Constants.TITLEG);
        titleList.add(Constants.TITLEH);
        titleList.add(Constants.TITLEI);
        titleList.add(Constants.TITLEJ);
        titleList.add(Constants.TITLEK);
        titleList.add(Constants.TITLEL);
        titleList.add(Constants.TITLEM);
        titleList.add(Constants.TITLEN);
        titleList.add(Constants.TITLEO);
        titleList.add(Constants.TITLEP);
        titleList.add(Constants.TITLEQ);
        titleList.add(Constants.TITLER);
        titleList.add(Constants.TITLES);
        titleList.add(Constants.TITLET);
        titleList.add(Constants.TITLEU);


        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(mContex,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);

        TitleAdapter titleAdapter = new TitleAdapter(mContex, titleList, new TitleClickListener() {
            @Override
            public void onItemClick(View itemview, int position) {
                Intent intent = new Intent(MainActivity.this,DetailActivity.class);
                intent.putExtra("titles",titleList.get(position));
                startActivity(intent);
            }
        });
        recyclerView.setAdapter(titleAdapter);
    }




}

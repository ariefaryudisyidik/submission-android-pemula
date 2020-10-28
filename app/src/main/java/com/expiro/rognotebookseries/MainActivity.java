package com.expiro.rognotebookseries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.expiro.rognotebookseries.adapter.ListROGAdapter;
import com.expiro.rognotebookseries.model.ROGData;
import com.expiro.rognotebookseries.model.ROG;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private String title = "Republic Of Gamers";
    private RecyclerView rvROG;
    private ArrayList<ROG> list = new ArrayList<>();


    private void showSelectedROG(ROG rog) {
        Toast.makeText(this, "Choose " + rog.getName(), Toast.LENGTH_SHORT).show();
        Intent moveDetail = new Intent(MainActivity.this, ActivityDetail.class);
        moveDetail.putExtra(ActivityDetail.EXTRA_IMG, rog.getPhoto());
        moveDetail.putExtra(ActivityDetail.EXTRA_NAME, rog.getName());
        moveDetail.putExtra(ActivityDetail.EXTRA_SPESIFIKASI, rog.getSpesifikasi());
        moveDetail.putExtra(ActivityDetail.EXTRA_DISPLAY, rog.getDisplay());
        moveDetail.putExtra(ActivityDetail.EXTRA_PRICE, rog.getPrice());
        moveDetail.putExtra(ActivityDetail.EXTRA_DETAIL, rog.getDetail());
        startActivity(moveDetail);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menuAbout) {
            startActivity(new Intent(MainActivity.this, About.class));
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rvROG = findViewById(R.id.rv_rog);
        rvROG.setHasFixedSize(true);

        list.addAll(ROGData.getListData());
        showRecyclerList();
        setActionBar(title);
    }

    private void setActionBar(String title) {
        getSupportActionBar().setTitle(title);
    }

    private void showRecyclerList() {
        rvROG.setLayoutManager(new LinearLayoutManager(this));
        ListROGAdapter listROGAdapter = new ListROGAdapter(list);
        rvROG.setAdapter(listROGAdapter);

        listROGAdapter.setOnItemClickCallback(new ListROGAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(ROG data) {
                showSelectedROG(data);
            }
        });
    }
}
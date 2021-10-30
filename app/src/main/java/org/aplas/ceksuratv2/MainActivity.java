package org.aplas.ceksuratv2;

import static org.aplas.ceksuratv2.R.id.rv_menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMenu;
    private ArrayList<Menu> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMenu = findViewById(R.id.rv_menu);
        rvMenu.setHasFixedSize(true);

        list.addAll(MenuData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvMenu.setLayoutManager(new LinearLayoutManager(this));
        ListMenuAdapter listMenuAdapter = new ListMenuAdapter(list);
        rvMenu.setAdapter(listMenuAdapter);
    }
}
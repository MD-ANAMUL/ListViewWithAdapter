package com.example.listviewwithadapter;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] itm_images = {
                R.drawable.fg, R.drawable.fimg,
                R.drawable.fgimg, R.drawable.img,
                R.drawable.img4,
                R.drawable.img5,

        };

        String[] itmName = {
                "Item Name", "Item Name",
                "Item Name", "Item Name",
                "Item Name", "Item Name",
        };


        listView = findViewById(R.id.list_item_viewS);
        AdapterForListView adapterForListView = new AdapterForListView(MainActivity.this, itm_images, itmName);
        listView.setAdapter(adapterForListView);
        listView.setDivider(null);


    }
}
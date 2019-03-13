package com.cemtopkaya.listview_ornegi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    final String[] dataSource = new String[]{"Cenk", "Cem", "Canan"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.lview);
        ListAdapter adapter = new ArrayAdapter<String>(
            this,
            android.R.layout.simple_expandable_list_item_1,
            dataSource);
        listView.setAdapter(adapter);
    }
}

package com.example.android.se;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

public class AddNewRelation extends AppCompatActivity {

    public RecyclerView entities, attributes;
    public RecyclerView.Adapter entity_adapter, attribute_adapter;
    public RecyclerView.LayoutManager entity_manager, attribute_manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_relation);

//        entities = (RecyclerView) findViewById(R.id.entity_recycler);
//        attributes = (RecyclerView) findViewById(R.id.attribute_recycler);
        
    }
}

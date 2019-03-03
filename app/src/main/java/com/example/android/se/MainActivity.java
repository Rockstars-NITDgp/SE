package com.example.android.se;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements Serializable {

    final Button reloading = findViewById(R.id.reload);
    final Button attribute = findViewById(R.id.add_attributes);
    final Button tweak_attributes = findViewById(R.id.tweak_attributes);
    final Button entity = findViewById(R.id.add_entity);
    final Button relations = findViewById(R.id.add_relations);

    Variables values = new Variables();
    Intent receive = getIntent();

    public void generator(){
        //Code for preparing the SQL commands on the background

    }

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        values = (Variables)receive.getSerializableExtra("Values");



        reloading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generator();
            }
        });

        relations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Code for adding relations
                Intent send = new Intent(MainActivity.this, AddNewRelation.class);
                send.putExtra("Values", (Serializable) values);
                startActivity(send);
            }
        });

        entity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Code for adding attributes
                Intent send = new Intent(MainActivity.this, AddNewEntity.class);
                send.putExtra("Values", (Serializable) values);
                startActivity(send);
            }
        });

        attribute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Add attributes to existing entities
                Intent send = new Intent(MainActivity.this, AddNewAttribute.class);
                send.putExtra("Values", (Serializable) values);
                startActivity(send);
            }
        });

        tweak_attributes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Remove or change name of attributes
                Intent send = new Intent(MainActivity.this, TweakAttributes.class);
                send.putExtra("Values", (Serializable) values);
                startActivity(send);
            }
        });
    }
}

class Variables{
    ArrayList<CharSequence> entities_list = new ArrayList<CharSequence>(0);
    ArrayList<Integer> relations_list = new ArrayList<Integer>(0);
    ArrayList<ArrayList<CharSequence>> attributes = new ArrayList<ArrayList<CharSequence>>(0);
}
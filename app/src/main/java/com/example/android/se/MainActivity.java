package com.example.android.se;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Dictionary;

public class MainActivity extends AppCompatActivity {

    final Button reloading = findViewById(R.id.reload);
    final Button attribute = findViewById(R.id.add_attributes);
    final Button tweak_attributes = findViewById(R.id.tweak_attributes);
    final Button entity = findViewById(R.id.add_entity);
    final Button relations = findViewById(R.id.add_relations);

    public void generator(){
        //Code for preparing the SQL commands on the background

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


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

            }
        });

        entity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Code for adding attributes

            }
        });

        attribute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Add attributes to existing entities

            }
        });

        tweak_attributes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Remove or change name of attributes

            }
        });
    }

}

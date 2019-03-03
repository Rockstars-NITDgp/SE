package com.example.android.se;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.Serializable;
import java.util.ArrayList;
import com.example.android.se.Variables;

public class AddNewEntity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_entity);

        final Button submit = findViewById(R.id.AddNewEntitySubmit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Code for adding the name of new entity to the entities_list Arraylist from MainActivity.java
                final EditText entity_name = findViewById(R.id.AddNewEntityInput);
                Editable entityname = entity_name.getText();


                Intent receive = getIntent();
                Variables values = (Variables)receive.getSerializableExtra("Values");
                values.entities_list.add(entityname);

                Intent send = new Intent(AddNewEntity.this, MainActivity.class);
                send.putExtra("Values", (Serializable)values);
                startActivity(send);
            }
        });

    }
}

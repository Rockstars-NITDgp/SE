package com.example.android.se;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.android.se.R;

import java.io.Serializable;

public class AddNewAttribute extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_attribute);

        Intent receive = getIntent();
        final Variables values = (Variables)receive.getSerializableExtra("Values");

        Button submission = findViewById(R.id.submit_add_attribute);
        submission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText entity = findViewById(R.id.entity_check);
                EditText attribute = findViewById(R.id.attribute_entry);

                CharSequence check = entity.getText();
                CharSequence attr_name = attribute.getText();
                int check_int = values.entities_list.indexOf(check);
                if(check_int!=(-1))
                {
                    values.attributes.get(check_int).add(attr_name);
                    Intent send = new Intent(AddNewAttribute.this, MainActivity.class);
                    send.putExtra("Values", (Serializable) values);
                    startActivity(send);
                }
                else
                {
                    TextView error = findViewById(R.id.check_response);
                    error.setText("Check only from the below entities:");
                }
            }
        });

    }
}

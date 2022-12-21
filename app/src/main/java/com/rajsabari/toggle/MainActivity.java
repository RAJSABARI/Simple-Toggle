package com.rajsabari.toggle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToggleButton button=findViewById(R.id.toggle);
        TextView view=findViewById(R.id.result);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data=button.getText().toString();
                view.setText("Button status: "+data);
            }
        });
    }
}
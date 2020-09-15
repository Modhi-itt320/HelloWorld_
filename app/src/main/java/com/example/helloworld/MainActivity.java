package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
//njkhgbbm jbh
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b;
    EditText t;
    TextView v1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = (Button) findViewById(R.id.Hellobutton);
        t = (EditText) findViewById(R.id.PersonName);
        v1 = (TextView) findViewById(R.id.textView);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s = t.getText().toString();
                //sendData(s);
                v1.setText("Hello, " + s);

            }
        });
    }

    private void sendData(String s) {
        Intent intent = new Intent(this, HelloActivity.class);
        intent.putExtra("PersonName" , s);


        startActivity(intent);


    }
}
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    Button button;
    EditText editText,editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        button = findViewById(R.id.btnlog);
        editText = findViewById(R.id.edtname);
        editText2 = findViewById(R.id.edtpass);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText.getText().length()==0){
                    Toast.makeText(MainActivity3.this, "Khong duoc de trong",Toast.LENGTH_SHORT).show();
                }
                if(editText.getText().equals("admin")){
                    Toast.makeText(MainActivity3.this, "cc", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
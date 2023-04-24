package com.example.emptyproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
//import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//    private Button button;
    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        button = findViewById(R.id.button2);
        textView = findViewById(R.id.textView5);
        editText = findViewById(R.id.editText);

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String kg = editText.getText().toString();
//                int n = Integer.parseInt(kg);
//                double ans = n * 2.205;
//                textView.setText("Kg to Pound is : " + ans);
//            }
//        });
    }
    public void calculate(View view) {
        String kg = editText.getText().toString();
        int n = Integer.parseInt(kg);
        double ans = n * 2.205;
        textView.setText("Kg to Pound is : " + ans);
    }
}
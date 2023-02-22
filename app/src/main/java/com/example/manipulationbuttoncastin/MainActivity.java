package com.example.manipulationbuttoncastin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText Num1;
    private EditText Num2;
    private Button add;
    private TextView Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Num1 = (EditText) findViewById(R.id.editTxtNum1);
        Num2 = (EditText) findViewById(R.id.editTxtNum2);
        add = (Button) findViewById(R.id.btnadd);
        Result = (TextView) findViewById(R.id.txtResult);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //get value from Activity
                int myNum1 = Integer.parseInt(Num1.getText(). toString());
                int myNum2 = Integer.parseInt(Num2.getText(). toString());

                //add Operation
                int sum = myNum1 + myNum2;

                Result.setText("Answer is "+sum);
            }
        });

    }
}
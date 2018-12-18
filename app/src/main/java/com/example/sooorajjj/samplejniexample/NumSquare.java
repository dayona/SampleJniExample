package com.example.sooorajjj.samplejniexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NumSquare extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_num_square);
        final EditText num= findViewById(R.id.et_number);


        Button result_view =findViewById(R.id.output);
        result_view.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int myNum = Integer.parseInt(num.getText().toString());
                int x=SquareLib.to4(myNum);
                Log.d("LOG ", x + " = number"  );
                TextView tv_result = findViewById(R.id.result);
                tv_result.setText(Integer.toString(x));
            }

        });
    }
}

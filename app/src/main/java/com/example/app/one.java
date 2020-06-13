package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class one extends AppCompatActivity {
    EditText quantity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        quantity = (EditText)findViewById(R.id.et1);
        Button back = (Button) findViewById(R.id.back);
        Button search = (Button)findViewById(R.id.search);

        search.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View arg0) {
                if ( !("".equals(quantity.getText().toString())) )
                {
                    int fq = Integer.parseInt(quantity.getEditableText().toString());
                    int sugar;
                    int flour;
                    TextView result = (TextView)findViewById(R.id.tv5);
                    result.setText("菠蘿皮"+fq);


                    TextView result1 = (TextView)findViewById(R.id.tv6);
                    sugar=fq*60;
                    result1.setText("糖"+sugar+"g");

                    TextView result2 = (TextView)findViewById(R.id.tv7);
                    flour=fq*110;
                    result2.setText("麵粉"+flour+"g");

                }
            }
        });


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(one.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
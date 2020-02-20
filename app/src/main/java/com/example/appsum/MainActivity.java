package com.example.appsum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    int sayac=0;
    TextView tv;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv=(TextView) findViewById(R.id.yaz);


        btn=(Button) findViewById(R.id.button) ;
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        tv.setText(String.valueOf(sayac++));

}
}

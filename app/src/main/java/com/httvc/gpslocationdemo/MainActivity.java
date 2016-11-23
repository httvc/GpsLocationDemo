package com.httvc.gpslocationdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn,btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= (Button) findViewById(R.id.btn);
        btn1= (Button) findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if (GpsUtils.isOPen(MainActivity.this)){
                   Intent intent=new Intent(MainActivity.this,LocationActivity.class);
                   startActivity(intent);
                }else {
                 //  GpsUtils.openGPS(MainActivity.this);
                   Toast.makeText(MainActivity.this, "请打开设置中的gps选项，定位更准确", Toast.LENGTH_SHORT).show();
                   Intent intent=new Intent(MainActivity.this,LocationActivity.class);
                   startActivity(intent);
               }
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Location1Activity.class);
                startActivity(intent);
            }
        });
    }
}

package com.example.sdq;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;

public class Zuozhe extends Activity{
    CheckBox Zuozhe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zzjj);
        Zuozhe = findViewById (R.id.Zuozhe);
        Zuozhe.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO 自动生成的方法存根
                Intent Zz =new Intent();
                Zz.setClass(Zuozhe.this,Suoming.class );
                startActivity(Zz);
            }
        });
    }
}

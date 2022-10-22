package com.example.sdq;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends Activity {
    Button dh,dl,dm,sm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
        dh = (Button) findViewById(R.id.dh);
        dl = (Button) findViewById(R.id.dl);
        dm = (Button) findViewById(R.id.dm);
        sm = (Button) findViewById(R.id.sm);

        //模拟电话
        dh.setOnClickListener(new View.OnClickListener() {
            //延时
            @Override
            public void onClick(View v) {
                try {
                    Thread.currentThread().sleep(9000);//延时的时间，毫秒
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // TODO Auto-generated method stub
                Intent Dh = new Intent(MainActivity.this,Dianhua.class);
                startActivity(Dh);
            }
        });
        //模拟没电
        dl.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //延时
                try {
                    Thread.currentThread().sleep(5000);//延时的时间，毫秒
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // TODO Auto-generated method stub
                Intent Dl = new Intent(MainActivity.this,Dianliang.class);
                startActivity(Dl);
            }
        });

        //真实没电
        dm.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent Dm = new Intent(MainActivity.this,Dianmai.class);
                startActivity(Dm);
            }
        });

        //使用说明
        sm.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent Sm = new Intent(MainActivity.this,Suoming.class);
                startActivity(Sm);
            }
        });

    }
}

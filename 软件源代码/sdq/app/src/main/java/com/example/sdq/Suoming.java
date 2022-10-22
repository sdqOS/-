package com.example.sdq;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Switch;
import android.widget.CheckBox;

public class Suoming extends Activity {
    Switch cy;
    CheckBox jj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sysm);
        cy = findViewById (R.id.cy);
        jj = findViewById (R.id.jj);

        cy.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO 自动生成的方法存根
                Intent Cy =new Intent();
                Cy.setClass(Suoming.this,MainActivity.class );
                startActivity(Cy);
            }
        });

        jj.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO 自动生成的方法存根
                Intent Jj =new Intent();
                Jj.setClass(Suoming.this,Zuozhe.class );
                startActivity(Jj);
            }
        });


    }
}

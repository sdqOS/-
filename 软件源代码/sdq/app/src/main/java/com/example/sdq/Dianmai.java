package com.example.sdq;
//public class Dianmai {

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;

public class Dianmai extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dm);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        while(true){
            int sum=0;
            //调试代码
            System.out.println("sdq");
            for(int x=0;x>=0;x++){
                //调试代码
                System.out.println("sdq");
                sum=sum+x;
                //调试代码
                System.out.println("sdq");
            }
        }


//    public static void main(String[] args){
//        //while 形式的死循环
//        /*while(true){
//        }*/
//        //for形式的死循环
//        for( ; true ; ){
//
//        }
//                int sum=0;
//                for(int i=1;i>0;i++){
//                    sum=sum+i;
//                    System.out.println("hhh"+sum);
                }
            }




package com.dotge.mission_yjh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProductActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        Button  backMenu    =   findViewById(R.id.backMenuActivityBtn) ;
        Button  backLogin   =   findViewById(R.id.backLoginActivityBtn) ;

        backMenu.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent  intent  =   new Intent() ;

                intent.putExtra("result", "menu") ;
                intent.putExtra("data", "상품 관리") ;
                intent.putExtra("data2", "Product") ;
                setResult(RESULT_OK, intent) ;
                finish() ;
            }
        });

        backLogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent  intent  =   new Intent() ;
                intent.putExtra("result", "login") ;
                setResult(RESULT_OK, intent) ;
                finish() ;
            }
        });
    }
}

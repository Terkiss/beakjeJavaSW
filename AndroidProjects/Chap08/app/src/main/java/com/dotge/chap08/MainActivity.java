package com.dotge.chap08;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity implements Serializable {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                Intent intent = new Intent(getApplicationContext(), NewActivity.class); // 인텐트 생성
                intent.putExtra("activity",  "MainActivity"); // 키 값을 보냄

                startActivityForResult(intent, 1000 );
                 */
                /*
                Intent intent = new Intent();
                ComponentName componentName = new ComponentName("com.dotge.another","com.dotge.another.MainActivity");
                intent.setComponent(componentName);
               // intent.putExtra("name","Chap08 의 메인 엑티 비티여 ");

               // Person person =

                Person2 person2 = new Person2("F넬", 16);
                Person2 person3 = new Person2("CHII ARUEL", 17);


                intent.putExtra("p1", person2);
                intent.putExtra("p2", person3);
                */

                Intent intent = new Intent();
                intent.setAction("action.ACTION_ANDROID_STUDY");

                startActivity(intent);
            }
        });
    }

    /**
     *
     * @param 요청코드
     * @param 응답코드
     * @param 인텐트 데이터
     */
    protected  void onActivityResult(int requstCode, int resultCode, Intent data)
    {
        if(requstCode == 1000 && resultCode == RESULT_OK)
        {
            String name = data.getStringExtra("name");
            int result = data.getIntExtra("sum",0);
            Toast.makeText(getApplicationContext(), "응답 받은 엑티비티 이름과 결과 값 ::"+name+", "+result,Toast.LENGTH_LONG).show();
        }
    }
}

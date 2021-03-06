package com.dotge.chap_listview;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] title = {"처음처럼", "시작", "ON", "그떄 그아인 ", "사랑, 하자 "};
    String[] singers = {"엠시떠  멕스", "가호", "방탄소년당", "김필", "수호"};

    ListView listView;

    SongAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView = findViewById(R.id.listView);
        Button btn_add = findViewById(R.id.btn_add);
        Button btn_close = findViewById(R.id.btn_close);



        adapter = new SongAdapter(this);

        for(int i = 0; i < title.length; i++)
        {

            SongItem item = new SongItem(title[i], singers[i]);

            adapter.addItem(item);
        }
        listView.setAdapter(adapter);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SongInfoActivity.class);
                startActivityForResult(intent, 1000);
            }
        });
        btn_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                SongItem item  =(SongItem) adapter.getItem(position);
                Toast.makeText(getApplicationContext(), "선택 아이템 :: "+item.getTitle()+", " +item.getSinger(), Toast.LENGTH_LONG).show();;

            }
        });
        /*
        listView.setOnLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                adapter.removeItem(position);
                adapter.notifyDataSetChanged();
                return false;

            }
        }

        );

    }
*/

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        if(data!= null && requestCode == 1000)
        {
            if(resultCode == RESULT_OK)
            {
                String title = data.getStringExtra("title");
                String singer = data.getStringExtra("singer");

                SongItem item = new SongItem(title, singer);

                adapter.addItem(item);

                adapter.notifyDataSetChanged();

            }
        }
        super.onActivityResult(requestCode, resultCode, data);

    }
}

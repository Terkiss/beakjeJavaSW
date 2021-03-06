package com.example.alerdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edt_Name, edt_Email, dig_Name, dig_Email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edt_Name = findViewById(R.id.editText);
        edt_Email = findViewById(R.id.editText2);

        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                View layout = View.inflate(MainActivity.this, R.layout.dialog, null);

                builder.setView(layout);
                builder.setTitle("사용자 정보 입력");
                builder.setIcon(R.drawable.ic_menu_allfriends);
                dig_Name = layout.findViewById(R.id.editText3);
                dig_Email = layout.findViewById(R.id.editText4);
                dig_Name.setText(edt_Name.getText().toString());
                dig_Email.setText(edt_Email.getText().toString());

                builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        edt_Name.setText(dig_Name.getText().toString());
                        edt_Email.setText(dig_Email.getText().toString());
                    }
                });

                builder.setNegativeButton("취소", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "취소 했씁니다 ", Toast.LENGTH_LONG).show();
                    }
                });

                builder.show();
            }
        });

    }
    public void onBackPressed()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("종료 확인 ");
        builder.setMessage("현재 프로그램을 종료 하시겠습니다. ");
        builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.setNegativeButton("취소", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "취소 했습니다. ", Toast.LENGTH_LONG).show();
            }
        });

        builder.show();

    }
}

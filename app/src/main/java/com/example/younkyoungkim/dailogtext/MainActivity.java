package com.example.younkyoungkim.dailogtext;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button butDialog=(Button) findViewById(R.id.but_dialog);
        butDialog.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder dialog=new AlertDialog.Builder(this);
        dialog.setTitle("첫번째 다이얼로그");
        dialog.setIcon(R.mipmap.ic_launcher);
        dialog.setMessage("여기는 메시지를 쓰는 곳입니다.");
        dialog.setPositiveButton("OK", null);
        dialog.show();
    }
}

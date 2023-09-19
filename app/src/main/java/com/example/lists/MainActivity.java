package com.example.lists;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.lists.tasks.Task_1;
import com.example.lists.tasks.Task_2;
import com.example.lists.tasks.Task_3;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickOpenTask1(View view) {
        Intent intent = new Intent(this, Task_1.class);
        startActivity(intent);
    }

    public void onClickOpenTask2(View view) {
        Intent intent = new Intent(this, Task_2.class);
        startActivity(intent);
    }

    public void onClickOpenTask3(View view) {
        Intent intent = new Intent(this, Task_3.class);
        startActivity(intent);
    }

}

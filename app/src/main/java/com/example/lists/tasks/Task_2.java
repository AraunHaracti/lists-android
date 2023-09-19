package com.example.lists.tasks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.lists.R;

public class Task_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task2);
        listInit();
    }

    private void listInit(){
        String[] optionsData = {
                "Буква А", "Буква Б", "Буква В", "Буква Г", "Буква Д", "Буква Е", "Буква Ж", "Буква З", "Буква И", "Буква Й", "Буква К", "Буква Л", "Буква М", "Буква Н", "Буква О", "Буква П", "Буква Р", "Буква С", "Буква Т", "Буква У", "Буква Ф", "Буква Х", "Буква Ц", "Буква Ч", "Буква Ш", "Буква Щ", "Буква Ъ", "Буква Ы", "Буква Ь", "Буква Э", "Буква Ю", "Буква Я"
        };
        ArrayAdapter<String> arrayAdapter =
                new ArrayAdapter<>(
                        getApplicationContext(),
                        android.R.layout.simple_list_item_1,
                        optionsData);

        ListView optionsList = findViewById(R.id.letters_list);
        optionsList.setAdapter(arrayAdapter);

        optionsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(
                        getApplicationContext(),
                        String.valueOf(optionsData[i]),
                        Toast.LENGTH_LONG).show();
            }
        });
    }

    public void onClickBack(View view) {
        onBackPressed();
    }
}
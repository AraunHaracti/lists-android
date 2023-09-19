package com.example.lists.tasks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.lists.Actor;
import com.example.lists.ActorAdapter;
import com.example.lists.R;

import java.util.ArrayList;
import java.util.Date;

public class Task_3 extends AppCompatActivity {

    ArrayList<Actor> states = new ArrayList<Actor>();
    ListView actorsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task3);

        setInitialData();

        actorsList = findViewById(R.id.actors_list);

        ActorAdapter actorAdapter = new ActorAdapter(this, R.layout.list_item, states);

        actorsList.setAdapter(actorAdapter);

        AdapterView.OnItemClickListener itemListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Actor selectedActor = (Actor)parent.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), "Был выбран пункт " + selectedActor.getFullName(),
                        Toast.LENGTH_SHORT).show();
            }
        };
        actorsList.setOnItemClickListener(itemListener);

    }

    private void setInitialData(){

        states.add(new Actor ("Brad Pitt", new Date(1963, 12, 18), R.drawable.brad_pitt));
        states.add(new Actor ("Tom Cruise", new Date(1962, 7, 3), R.drawable.tom_cruise));
        states.add(new Actor ("Johnny Depp", new Date(1963, 6, 9), R.drawable.johnny_depp));
        states.add(new Actor ("Angelina Jolie", new Date(1975, 6, 4), R.drawable.angelina_jolie));

    }

    public void onClickBack(View view) {
        onBackPressed();
    }
}
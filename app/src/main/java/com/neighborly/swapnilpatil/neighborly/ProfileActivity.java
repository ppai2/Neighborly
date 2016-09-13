package com.neighborly.swapnilpatil.neighborly;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;


public class ProfileActivity extends Activity {

    private List<String> profileNames = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_my);
        setContentView(R.layout.activity_profile);
        //addingLists();
        RecyclerView recList = (RecyclerView) findViewById(R.id.cardList);
        recList.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recList.setLayoutManager(llm);

        ProfileAdapter ca = new ProfileAdapter(createList(7));
        recList.setAdapter(ca);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private List<Profiles> createList(int size) {
        /*profileNames.add("Plumbing");
        profileNames.add("Car");
        profileNames.add("Medical");
        profileNames.add("Safety");
        profileNames.add("Electronics");
        profileNames.add("Food/Groceries");
        profileNames.add("Advice");*/
        List<Profiles> result = new ArrayList<Profiles>();
        for (int i=0; i < size; i++) {
            Profiles ci = new Profiles();
            //ci.name = profileNames.get(i);
            ci.name = "default";
            result.add(ci);
        }
        return result;
    }
}
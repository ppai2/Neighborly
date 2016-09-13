package com.neighborly.swapnilpatil.neighborly;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;


public class UserActivity extends Activity {

    private List<String> userNames = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_my);
        setContentView(R.layout.activity_user_cards);
        //addingLists();
        RecyclerView recList = (RecyclerView) findViewById(R.id.cardList);
        recList.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recList.setLayoutManager(llm);

        UserAdapter ca = new UserAdapter(createList(30));
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

    private List<Users> createList(int size) {
        /*userNames.add("Plumbing");
        userNames.add("Car");
        userNames.add("Medical");
        userNames.add("Safety");
        userNames.add("Electronics");
        userNames.add("Food/Groceries");
        userNames.add("Advice");*/
        for(int i = 0; i<7;i++)
        {
            userNames.add("User"+(i+1));
        }
        List<Users> result = new ArrayList<Users>();
        for (int i=0; i < userNames.size(); i++) {
            Users ci = new Users();
            ci.name = userNames.get(i);
            result.add(ci);

        }

        return result;
    }
}

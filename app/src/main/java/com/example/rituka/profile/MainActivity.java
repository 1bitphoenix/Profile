package com.example.rituka.profile;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvList;
    ArrayList<User> userlist=new ArrayList<>();

    public static final String TAG="ai:";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d(TAG, "onCreate: ");
        setContentView(R.layout.activity_main);
        generateusers(userlist);
        rvList=(RecyclerView) findViewById(R.id.rvList);
        rvList.setLayoutManager(new LinearLayoutManager(this));
        UserAdapter userAdapter=new UserAdapter(
                this,userlist
        );
        rvList.setAdapter(userAdapter);
    }

    static void generateusers(ArrayList<User> users){
        users.add(new User("Rituka","IT"));
        users.add(new User("Rohan","IT"));
        users.add(new User("Arvind","IT"));
        users.add(new User("Mandeep","CSE"));
        users.add(new User("Harjot","IT"));
        users.add(new User("Mansi","IT"));
        users.add(new User("Medha","IT"));
        users.add(new User("Parth","IT"));
        users.add(new User("Sarthak","MAE"));

    }
}

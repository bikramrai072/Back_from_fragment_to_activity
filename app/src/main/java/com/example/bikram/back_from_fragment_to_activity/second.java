package com.example.bikram.back_from_fragment_to_activity;

import android.app.Activity;


import android.app.FragmentManager;
import android.os.Bundle;

import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;

/**
 * Created by bikram on 2/24/2017.
 */

public class second  extends Activity
{
 Button button;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        button=(Button)findViewById(R.id.btn);
    }
    public void fragment(View v)
    {
        button.setVisibility(View.GONE);
        fragment f1= new fragment();
        FragmentManager fragmentManager =getFragmentManager();
        android.app.FragmentTransaction transaction=  fragmentManager.beginTransaction();
        transaction.add(R.id.frag,f1,"frag");
        transaction.addToBackStack("frag");//it is write here becouse when back button is pressed thed first it is removed from BackStack()
        transaction.commit();

    }
    public void onBackPressed() {  // this method call when we click on back button
        button.setVisibility(View.VISIBLE);
        int count = getFragmentManager().getBackStackEntryCount();   // it will count all the fragments got in backtrack

        if (count == 0) {
            super.onBackPressed();     // if zero simply go back from our acitivity

        }


        else {
            getFragmentManager().popBackStack();   // othwise it will remove fragment by fragment..


        }

    }
}

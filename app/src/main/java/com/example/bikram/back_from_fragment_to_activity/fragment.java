package com.example.bikram.back_from_fragment_to_activity;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by bikram on 2/24/2017.
 */

public class fragment extends Fragment
{
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle bun)
    {
        View v=inflater.inflate(R.layout.fragment,container,false);
        return v;
    }
}

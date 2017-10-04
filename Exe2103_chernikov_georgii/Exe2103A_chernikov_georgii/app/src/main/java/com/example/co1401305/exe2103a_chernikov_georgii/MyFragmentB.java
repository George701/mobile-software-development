package com.example.co1401305.exe2103a_chernikov_georgii;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyFragmentB extends Fragment {

    //declare myfragment as a subclass of fragment
    public static MyFragmentB newInstance() {
        //non-default constractors should be avoided
        return new MyFragmentB();
    }

    public MyFragmentB() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.layout_fragment_b, container, false);
    }

}

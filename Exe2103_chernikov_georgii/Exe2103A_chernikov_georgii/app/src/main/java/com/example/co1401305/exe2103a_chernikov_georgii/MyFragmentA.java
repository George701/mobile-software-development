package com.example.co1401305.exe2103a_chernikov_georgii;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyFragmentA extends Fragment {

        //declare myfragment as a subclass of fragment
    public static MyFragmentA newInstance(){
        //non-default constractors should be avoided
        return new MyFragmentA();
    }
    // Required empty public constructor
    public MyFragmentA() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.layout_fragment_a, container, false);
        //must be false
    }

}

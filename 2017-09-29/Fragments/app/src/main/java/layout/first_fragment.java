package layout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.chern.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class first_fragment extends Fragment {

    public static first_fragment newInstance(){
        return new first_fragment();
    }

    public first_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.layout_first_fragment, container, false);
    }

}

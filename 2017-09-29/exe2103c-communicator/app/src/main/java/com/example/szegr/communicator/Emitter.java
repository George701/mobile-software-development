package com.example.szegr.communicator;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Emitter extends Fragment {
    private IOnMessageSend  mListener = null;

    public interface IOnMessageSend {
        abstract void onMsgeSend(String msge);
    }


    public Emitter() {
        // Required empty public constructor
    }

    public static Emitter newInstance() {
        return new Emitter();
    }

    /**
     * To ensure that hosting activity implement the interface
     *
     * @param context
     */
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof IOnMessageSend)  {
            mListener = (IOnMessageSend)context;
        }
        else   {
            StringBuilder   s = new StringBuilder();
            s.append("Activity ");
            s.append(context.toString());
            s.append(" must implement the interface IOnMessageSend.");
            Toast.makeText(context, s.toString(), Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.layout_emitter, container, false);
    }

}

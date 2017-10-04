package com.example.szegr.fragments1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Fragments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_fragments);
    }
    /**
     * Procedure inflates the manu.
     * @param   menu  The menu the items are to be added to.
     * @return  The value of true, if creation of menu is completed;
     *          false otherwise.
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    /**
     * Call-back function for the event of click on an item of menu.
     * @param   item  The item has been clicked.
     * @return  The value of true if an event has been handled; false otherwise.
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId())    {
            case R.id.actnExit:
                finish();
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
}

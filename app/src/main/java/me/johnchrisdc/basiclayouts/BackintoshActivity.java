package me.johnchrisdc.basiclayouts;

import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

/**
 * Created by jcdc on 12/6/16.
 */

public class BackintoshActivity extends AppCompatActivity {

    public void backy(){
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case android.R.id.home:
                onBackPressed();
                break;
        }

        return true;
    }
}

package me.johnchrisdc.basiclayouts;

import android.os.Bundle;

public class RelativeLayoutActivity extends BackintoshActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);
        backy();
    }
}

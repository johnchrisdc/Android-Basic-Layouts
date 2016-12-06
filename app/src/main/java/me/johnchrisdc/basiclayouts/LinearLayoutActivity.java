package me.johnchrisdc.basiclayouts;

import android.os.Bundle;

public class LinearLayoutActivity extends BackintoshActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);
        backy();
    }
}

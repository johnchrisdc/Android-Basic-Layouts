package me.johnchrisdc.basiclayouts;

import android.os.Bundle;

public class ScrollViewActivity extends BackintoshActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view);
        backy();
    }
}

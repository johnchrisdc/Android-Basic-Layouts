package me.johnchrisdc.basiclayouts;

import android.os.Bundle;

public class FrameLayoutActivity extends BackintoshActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);
        backy();
    }
}

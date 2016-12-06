package me.johnchrisdc.basiclayouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ll(View view){
        startActivity(new Intent(this, LinearLayoutActivity.class));
    }

    public void rl(View view){
        startActivity(new Intent(this, RelativeLayoutActivity.class));
    }

    public void fl(View view){
        startActivity(new Intent(this, FrameLayoutActivity.class));
    }

    public void sl(View view){
        startActivity(new Intent(this, ScrollViewActivity.class));
    }
}

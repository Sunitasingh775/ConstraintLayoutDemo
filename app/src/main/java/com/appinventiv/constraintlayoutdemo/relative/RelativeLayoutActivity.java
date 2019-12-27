package com.appinventiv.constraintlayoutdemo.relative;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.appinventiv.constraintlayoutdemo.R;

public class RelativeLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common);

        RecyclerView rvCommon = findViewById(R.id.rv_common);
        RelativeAdapter linearAdapter = new RelativeAdapter();
        rvCommon.setAdapter(linearAdapter);
    }
}

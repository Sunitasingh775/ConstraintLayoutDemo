package com.appinventiv.constraintlayoutdemo.linear;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.appinventiv.constraintlayoutdemo.R;

public class LinearLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common);

        RecyclerView rvCommon = findViewById(R.id.rv_common);
        LinearAdapter linearAdapter = new LinearAdapter();
        rvCommon.setAdapter(linearAdapter);
    }
}

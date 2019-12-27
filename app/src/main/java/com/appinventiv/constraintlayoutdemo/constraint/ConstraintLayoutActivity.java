package com.appinventiv.constraintlayoutdemo.constraint;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.appinventiv.constraintlayoutdemo.R;

public class ConstraintLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common);

        RecyclerView rvCommon = findViewById(R.id.rv_common);
        ConstraintAdapter linearAdapter = new ConstraintAdapter();
        rvCommon.setAdapter(linearAdapter);
    }
}

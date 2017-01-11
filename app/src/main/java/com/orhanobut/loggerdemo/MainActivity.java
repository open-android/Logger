package com.orhanobut.loggerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.orhanobut.logger.Logger;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mBtn1 = (Button) findViewById(R.id.btn1);

        mBtn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                Logger.d("hello test");
                break;
        }
    }
}

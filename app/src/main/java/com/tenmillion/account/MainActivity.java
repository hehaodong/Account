package com.tenmillion.account;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.tenmillion.account.base.BaseActivity;
import com.tenmillion.account.homepage.view.AccountActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    private int clickTimes = 0;

    @BindView(R.id.tv_total_desc)
    TextView tvTotalDesd;


    @Override
    protected int getLayoutResource() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @OnClick(R.id.tv_total_desc) void submit() {
        clickTimes++;
        if(clickTimes > 5){
            startActivity(new Intent(MainActivity.this, AccountActivity.class));
        }
    }


}

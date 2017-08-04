package com.tenmillion.account.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author hehaodong
 * @Filename:com.tenmillion.account.base
 * @Description:
 * @Copyright: Copyright (c) 2017  All Rights Reserved.
 * @date 2017-08-01 17:58
 */
public abstract class BaseActivity extends AppCompatActivity {
    protected abstract int getLayoutResource();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResource());
        ButterKnife.bind(this);
    }
}

package com.jackykeke.commonbusinesslibrary.base.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.alibaba.android.arouter.launcher.ARouter;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by JackyKeke on 18-7-16.
 * e-mail：kyl794106786@gmail.com
 * github:https://github.com/JackyKeke
 * desc:
 */

public abstract class BaseActivity extends AppCompatActivity {


    private Unbinder unbinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ARouter.getInstance().inject(this);//注入路由
    }


    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        unbinder = ButterKnife.bind(this);//绑定ButterKnife
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (unbinder != null) {
            unbinder.unbind();
        }//解绑ButterKnife
    }
}

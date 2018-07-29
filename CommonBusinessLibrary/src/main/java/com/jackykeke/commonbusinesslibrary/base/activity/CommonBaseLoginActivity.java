package com.jackykeke.commonbusinesslibrary.base.activity;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by JackyKeke on 18-7-16.
 * e-mail：kyl794106786@gmail.com
 * github:https://github.com/JackyKeke
 * desc:
 */

public abstract class CommonBaseLoginActivity extends BaseActivity {


    private Unbinder unbinder;

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
        }

    }
}

package com.jackykeke.ordermodule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.jackykeke.commonbusinesslibrary.model.ConstantRouter;


@Route(path = "/OrderModule/OrderMainActivity")
public class OrderModuleMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_module_main);
    }
}

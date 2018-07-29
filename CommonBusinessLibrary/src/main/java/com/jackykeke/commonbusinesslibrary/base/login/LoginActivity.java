package com.jackykeke.commonbusinesslibrary.base.login;

import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.jackykeke.commonbusinesslibrary.R;
import com.jackykeke.commonbusinesslibrary.base.activity.CommonBaseLoginActivity;
import com.jackykeke.commonbusinesslibrary.model.ConstantRouter;

@Route(path = "/CommonBusiness/LoginActivity")
public class LoginActivity extends CommonBaseLoginActivity {


    private String moduleUrl;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        moduleUrl = getModuleUrl();

        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build(moduleUrl).navigation();
                finish();
            }
        });

    }


    private String getModuleUrl() {

        String label = null;

        try {
            label = getResources().getString(getPackageManager().getApplicationInfo(getPackageName(), 0).labelRes);
            return ConstantRouter.getNowRouter(label);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }


}

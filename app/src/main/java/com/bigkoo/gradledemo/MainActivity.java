package com.bigkoo.gradledemo;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.bigkoo.alertview.AlertView;


public class MainActivity extends Activity {

    private boolean useAlertView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            Class.forName("com.bigkoo.alertview.AlertView");
            useAlertView = true;
        } catch (ClassNotFoundException ignored) {
            ignored.printStackTrace();
            System.out.println("========================================================================");
            System.out.println("================================没有嵌入这个类========================================");
        }
    }

    public void showAlertView(View view) {
        if(useAlertView) {
            new AlertView("标题", "内容", null, new String[]{"确定"}, null, this, AlertView.Style.Alert, null).show();
        }
    }
}

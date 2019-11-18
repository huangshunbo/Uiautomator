package com.youzan.mobile.uiautomator;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void oneClick(View view){
        Log.i(TAG,"oneClick");
        toast("oneClick");
    }

    public void twoClick(View view){
        Log.i(TAG,"twoClick");
        toast("twoClick");
    }

    public void thrClick(View view){
        Log.i(TAG,"thrClick");
        toast("thrClick");
    }

    public void fourClick(View view){
        Log.i(TAG,"fourClick");
        toast("fourClick");
    }

    public void fiveClick(View view){
        Log.i(TAG,"fiveClick");
        toast("fiveClick");
    }

    private void toast(String msg){
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }

}

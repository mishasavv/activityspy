package edu.washington.mikhail3.activityspy;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;


public class Greetings extends Activity {
    private static final String TAG = "Greetings";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG,"onCreate event fired");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greetings);
        if(savedInstanceState != null){
            Log.i(TAG,savedInstanceState.toString());
        }
    }
    @Override
    protected void onResume() {
        Log.i(TAG,"onResume event fired");
        super.onResume();
    }
    @Override
    protected void onStart() {
        Log.i(TAG,"onStart event fired");
        super.onStart();
    }
    @Override
    protected void onRestart() {
        Log.i(TAG,"onRestart event fired");
        super.onRestart();
    }
    @Override
    protected void onPause() {
        Log.i(TAG,"onPause event fired");
        super.onPause();
    }
    @Override
    protected void onDestroy() {
        Log.e(TAG, "We’re going down, Captain!");
        super.onDestroy();
    }

}

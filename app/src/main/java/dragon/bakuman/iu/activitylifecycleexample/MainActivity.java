package dragon.bakuman.iu.activitylifecycleexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showLog("onCreate FInished");
    }


    @Override
    protected void onStart() {
        super.onStart();
        showLog("onStart Finish");
    }

    @Override
    protected void onResume() {
        super.onResume();
        showLog("onResume Finish");

    }

    @Override
    protected void onPause() {
        super.onPause();
        showLog("onPause finish");

    }

    @Override
    protected void onStop() {
        super.onStop();
        showLog("onStop Finish");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        showLog("onRestart finish");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        showLog("onDestroy finish");
    }

    public void startAcnotherActivity(View view) {

        startActivity(new Intent(this, SecondActivity.class));

    }

    public void finishActivity(View view) {

        finish();

    }


    private void showLog(String message){

        Log.d(TAG, "showLog: Lifecycle Test: " + message);



    }
}

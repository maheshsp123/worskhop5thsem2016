package workshop2016.bvb.android.example.com.worskhop5thsem2016;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    String LOG_CAT=MainActivity.class.getSimpleName();
    Button launchButtonRef;
    AppCompatActivity thisActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        thisActivity=this;
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main_button);
        Log.i(LOG_CAT, "onCreate()");
        launchButtonRef=
                (Button) findViewById(R.id.lauchActtivityBtnId);
        launchButtonRef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(LOG_CAT,"button clicked");
                Intent intent=
                        new Intent(thisActivity, Main2Activity.class);
                startActivity(intent);
            }
        });


       /* Intent intent=new Intent(this, Main2Activity.class);
        startActivity(intent);*/
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(LOG_CAT, "onStart()");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(LOG_CAT, "onPause()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(LOG_CAT, "onResume()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(LOG_CAT, "onRestart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(LOG_CAT, "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(LOG_CAT, "onDestroy()");
    }
}

package com.gabyquiles.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
    private Context context;
    private int toast_duration;
    private Toast appToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.context = getApplicationContext();
        this.toast_duration = Toast.LENGTH_SHORT;
    }

    /**
     * Call app based on button clicked
     */
    public void callApp(View view) {
        if(this.appToast != null) {
            appToast.cancel();
        }

        CharSequence text = "An unidentified button has been pressed";
        switch (view.getId()) {
            case R.id.spotify_streamer_btn:
                text = "This button will launch my spotify app!";
                break;
            case R.id.scores_btn:
                text = "This button will launch my Scores app!";
                break;
            case R.id.library_btn:
                text = "This button will launch my Library app!";
                break;
            case R.id.buid_it_bigger_btn:
                text = "This button will launch my Build It Bigger app!";
                break;
            case R.id.xyz_reader_btn:
                text = "This button will launch my XYZ Reader app!";
                break;
            case R.id.capstone_btn:
                text = "This button will launch my capstone app!";
                break;
        }

        this.appToast = Toast.makeText(this.context, text, this.toast_duration);
        this.appToast.show();
    }

}

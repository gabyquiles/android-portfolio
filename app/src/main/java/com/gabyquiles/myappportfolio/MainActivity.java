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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.context = getApplicationContext();
        this.toast_duration = Toast.LENGTH_SHORT;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Call Spotify App
     */
    public void callSpotifyApp(View view) {
        CharSequence text = "This button will launch my spotify app!";

        Toast toast = Toast.makeText(this.context, text, this.toast_duration);
        toast.show();
    }

    /**
     * Call Spotify App
     */
    public void callScoresApp(View view) {
        CharSequence text = "This button will launch my Scores app!";

        Toast toast = Toast.makeText(this.context, text, this.toast_duration);
        toast.show();
    }

    /**
     * Call Spotify App
     */
    public void callLibraryApp(View view) {
        CharSequence text = "This button will launch my Library app!";

        Toast toast = Toast.makeText(this.context, text, this.toast_duration);
        toast.show();
    }

    /**
     * Call Spotify App
     */
    public void callBuildItBiggerApp(View view) {
        CharSequence text = "This button will launch my Build It Bigger app!";

        Toast toast = Toast.makeText(this.context, text, this.toast_duration);
        toast.show();
    }

    /**
     * Call Spotify App
     */
    public void callXYZReaderApp(View view) {
        CharSequence text = "This button will launch my XYZ Reader app!";

        Toast toast = Toast.makeText(this.context, text, this.toast_duration);
        toast.show();
    }

    /**
     * Call Capstone App
     */
    public void callCapstoneApp(View view) {
        CharSequence text = "This button will launch my capstone app!";

        Toast toast = Toast.makeText(this.context, text, this.toast_duration);
        toast.show();
    }

}

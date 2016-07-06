package com.udacity.robin.project0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void showToastPopularMovie(View view) {
        Toast toast = null;
        switch (view.getId())
        {
            case R.id.button:
            {
                toast = Toast.makeText(getApplicationContext(), "Popular Movie Message", Toast.LENGTH_SHORT);

            }
            break;

            case R.id.button2:
            {
                toast = Toast.makeText(getApplicationContext(), "Stock hawk", Toast.LENGTH_SHORT);

            }
            break;
            case R.id.button3:
            {
                toast = Toast.makeText(getApplicationContext(), "Build it bigger", Toast.LENGTH_SHORT);

            }
            break;

            case R.id.button4:
            {
                toast = Toast.makeText(getApplicationContext(), "Make your app material", Toast.LENGTH_SHORT);

            }
            break;

            case R.id.button5:
            {
                toast = Toast.makeText(getApplicationContext(), "Go ubiquitous", Toast.LENGTH_SHORT);

            }
            break;

            case R.id.button6:
            {
                toast = Toast.makeText(getApplicationContext(), "This button will launch my capstone app!", Toast.LENGTH_SHORT);

            }
            break;

        }
        toast.show();
    }










}

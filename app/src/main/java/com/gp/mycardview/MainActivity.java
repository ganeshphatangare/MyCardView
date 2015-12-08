package com.gp.mycardview;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t1, t2, t3, t4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        t1 = (TextView) findViewById(R.id.textView);
        t2 = (TextView) findViewById(R.id.textView1);

        t3 = (TextView) findViewById(R.id.textView2);
        t4 = (TextView) findViewById(R.id.textView3);



        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/devnagiri.TTF");
//        Typeface typeface1 = Typeface.createFromAsset(getAssets(), "fonts/one.TTF");
       Typeface typeface2 = Typeface.createFromAsset(getAssets(), "fonts/two.TTF");
        Typeface typeface3 = Typeface.createFromAsset(getAssets(), "fonts/three.TTF");
//        Typeface typeface4 = Typeface.createFromAsset(getAssets(), "fonts/four.TTF");


        t1.setText("गणेश फटांगरे यांनावाढदिवसाचा हार्दिक शुभेच्छा ");
        t1.setTypeface(typeface);
//        t2.setText("गणेश फटांगरे यांनावाढदिवसाचा हार्दिक शुभेच्छा ");
//        t2.setTypeface(typeface1);
        t3.setText("गणेश फटांगरे यांनावाढदिवसाचा हार्दिक शुभेच्छा ");
        t3.setTypeface(typeface2);
        t4.setText("गणेश फटांगरे यांनावाढदिवसाचा हार्दिक शुभेच्छा ");
        t4.setTypeface(typeface3);



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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
}

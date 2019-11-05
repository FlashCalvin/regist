package com.calvin.register;

import android.app.AlertDialog;
import android.icu.text.CaseMap;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView name;
    private TextView email;
    private TextView password;
    private ImageView upper;
    private ImageView middle;
    private ImageView lower;
    private int name1;
    private int password1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        name = findViewById(R.id.your_name);
        email = findViewById(R.id.your_email);
        password = findViewById(R.id.your_password);
        upper = findViewById(R.id.upper_pic);
        middle = findViewById(R.id.middle_pic);
        lower = findViewById(R.id.lower_pic);
        name1 = name.getText().toString().length();
        password1 = password.getText().toString().length();



        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    public void checkName(){
        if(name1 > 0){
            if(name1<=3){
                new AlertDialog.Builder(MainActivity.this)
                        .setMessage("名字太短")
                        .setPositiveButton("OK",null)
                        .show();
                upper.setImageResource(R.drawable.caution);
                upper.setVisibility(View.VISIBLE);

            }else {
                upper.setImageResource(R.drawable.yeah);
                upper.setVisibility(View.VISIBLE);

            }

        }

    }
//    public void checkEmail{
//        if()


    public void commit(View view){
        checkName();
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

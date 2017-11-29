package com.example.android.checkdialog;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  //  Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setFinishOnTouchOutside(true);
    }
public void CAClicked(View v)
{
    Log.i("MainActivity.java","Create account Clicked");
    Intent i=new Intent(this,Signup.class);
    startActivity(i);
}

}

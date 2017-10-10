package com.example.arvindo.fragmentexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private String textVal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setText(String ans){
        this.textVal = ans;
    }

    public String getText(){
        return this.textVal;
    }

}

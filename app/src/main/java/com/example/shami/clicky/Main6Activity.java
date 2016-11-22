package com.example.shami.clicky;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
    }

    public void btn6_onClick(View view) {


        Intent intent = new Intent(this, Main8Activity.class);
        startActivity(intent);
    }


}

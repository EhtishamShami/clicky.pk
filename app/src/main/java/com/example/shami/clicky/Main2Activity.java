package com.example.shami.clicky;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class Main2Activity extends AppCompatActivity {

    GridView grid;



    int[] imageId = {

            R.drawable.prod_1,
            R.drawable.prod_1,
            R.drawable.prod_1,
            R.drawable.prod_1,
            R.drawable.prod_1,
            R.drawable.prod_1
    };

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        intent = new Intent(this, Main4Activity.class);
        CustomGrid adapter = new CustomGrid(Main2Activity.this,imageId);
        grid=(GridView)findViewById(R.id.gridview);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                startActivity(intent);
            }
        });


    }

}

package com.example.shami.clicky;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
        Intent startflow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);




        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        startflow=new Intent(this,Main2Activity.class);

        //////Horizontal recycler view <code>

        List<Data> data = fill_with_data();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.my_recentfriends_recyle);
        Recycler_View_Adapter adapter = new Recycler_View_Adapter(data, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));


        //////Horizontal brands recycler view <code>

        List<Data> brands_data = fill_with_brands();
        RecyclerView brands_recyclerView = (RecyclerView) findViewById(R.id.brands_recycler);
        Recycler_View_Adapter brands_adapter = new Recycler_View_Adapter(brands_data, this);
        brands_recyclerView.setAdapter(brands_adapter);
        brands_recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));




    }

    public List<Data> fill_with_data() {

        List<Data> data = new ArrayList<>();

         data.add(new Data("Women", R.drawable.women3));
         data.add(new Data("Men", R.drawable.waleed));
         data.add(new Data("Kids", R.drawable.kid5));
         data.add(new Data("Bags", R.drawable.bag1));
         data.add(new Data("Watches",  R.drawable.watch1));

        return data;
    }


    public List<Data> fill_with_brands() {

        List<Data> data = new ArrayList<>();

        data.add(new Data("Stylo", R.drawable.logo_1));
        data.add(new Data("Bonanza", R.drawable.logo_2));
        data.add(new Data("outfitter", R.drawable.logo_3));
        data.add(new Data("stoneage", R.drawable.logo_4));
        data.add(new Data("levis",  R.drawable.logo_5));

        return data;
    }




    public void btn1_onclick(View view) {


        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
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
        if (id == R.id.action_searchs) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_women) {
            startActivity(startflow);
        } else if (id == R.id.nav_men) {
            startActivity(startflow);
        } else if (id == R.id.nav_kids) {
            startActivity(startflow);
        } else if (id == R.id.nav_furniture) {
            startActivity(startflow);
        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

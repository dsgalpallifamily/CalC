package com.supreeta.dsgalpalli.calc;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,Communicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        android.app.Fragment fragment = new SimpleCalFragment();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.add(R.id.frameLayoutId, fragment);

        android.app.Fragment fragment2 = new DisplayResultFragment();
        fragmentTransaction.replace(R.id.fragmentDisplay, fragment2);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);



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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();

        if (id == R.id.nav_trignometry) {
            android.app.Fragment fragment = new TrignometryFragment();
            fragmentTransaction.replace(R.id.frameLayoutId, fragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        } else if (id == R.id.nav_algebra) {
            android.app.Fragment fragment = new AlgebraFragment();
            fragmentTransaction.replace(R.id.frameLayoutId, fragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();

        } else if (id == R.id.nav_about_us) {
            android.app.Fragment fragment = new AboutUsFragment();
            fragmentTransaction.replace(R.id.frameLayoutId, fragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();

        } else if (id == R.id.nav_help) {
            android.app.Fragment fragment = new HelpUsFragment();
            fragmentTransaction.replace(R.id.frameLayoutId, fragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void respond(String data) {

        FragmentManager manager=getFragmentManager();
        DisplayResultFragment displayResultFragment = (DisplayResultFragment) manager.findFragmentById(R.id.fragmentDisplay);
            displayResultFragment.changeText(data);


    }
    @Override
    public void clear() {
        FragmentManager manager=getFragmentManager();
        DisplayResultFragment displayResultFragment = (DisplayResultFragment) manager.findFragmentById(R.id.fragmentDisplay);
        displayResultFragment.clearText();
    }
    @Override
    public void result() {
        FragmentManager manager=getFragmentManager();
        DisplayResultFragment displayResultFragment = (DisplayResultFragment) manager.findFragmentById(R.id.fragmentDisplay);
        displayResultFragment.changeResult();
    }
}

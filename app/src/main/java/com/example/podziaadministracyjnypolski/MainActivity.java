package com.example.podziaadministracyjnypolski;



import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private DrawerLayout drawer;
    private  Toolbar toolbar;
    private WebView wb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        wb =  findViewById(R.id.web_view12);
        wb.setWebViewClient(new WebViewClient());
        WebSettings webSettings = wb.getSettings();
        webSettings.setJavaScriptEnabled(true);
        wb.loadUrl("https://pl.wikipedia.org/wiki/Polska");
        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        toolbar.setTitle(R.string.name_menu_1);
        return true;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int id = menuItem.getItemId();
        if(id == R.id.id_menu_first){
            wb.loadUrl(getResources().getStringArray(R.array.for_example_array)[0]);
        } else if(id == R.id.id_menu_second){
            wb.loadUrl(getResources().getStringArray(R.array.for_example_array)[1]);
        }else if(id == R.id.id_menu_third){
            wb.loadUrl(getResources().getStringArray(R.array.for_example_array)[2]);
        }else if(id == R.id.id_menu_fourth){
            wb.loadUrl(getResources().getStringArray(R.array.for_example_array)[3]);
        }else if(id == R.id.id_menu_fifth){
            wb.loadUrl(getResources().getStringArray(R.array.for_example_array)[4]);
        }else if(id == R.id.id_menu_sixth) {
            wb.loadUrl(getResources().getStringArray(R.array.for_example_array)[5]);
        }else if(id == R.id.id_menu_seventh) {
            wb.loadUrl(getResources().getStringArray(R.array.for_example_array)[6]);
        }else if(id == R.id.id_menu_eighth) {
            wb.loadUrl(getResources().getStringArray(R.array.for_example_array)[7]);
        }else if(id == R.id.id_menu_ninth) {
            wb.loadUrl(getResources().getStringArray(R.array.for_example_array)[8]);
        }else if(id == R.id.id_menu_tenth) {
            wb.loadUrl(getResources().getStringArray(R.array.for_example_array)[9]);
        }else if(id == R.id.id_menu_eleventh) {
            wb.loadUrl(getResources().getStringArray(R.array.for_example_array)[10]);
        }else if(id == R.id.id_menu_twelfth) {
            wb.loadUrl(getResources().getStringArray(R.array.for_example_array)[11]);
        }else if(id == R.id.id_menu_thirteenth) {
            wb.loadUrl(getResources().getStringArray(R.array.for_example_array)[12]);
        }else if(id == R.id.id_menu_fourteenth) {
            wb.loadUrl(getResources().getStringArray(R.array.for_example_array)[13]);
        }else if(id == R.id.id_menu_fifteenth) {
            wb.loadUrl(getResources().getStringArray(R.array.for_example_array)[14]);
        }else if(id == R.id.id_menu_sixteenth) {
            wb.loadUrl(getResources().getStringArray(R.array.for_example_array)[15]);
        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}


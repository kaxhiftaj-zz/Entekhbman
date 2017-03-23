package com.techease.entekhabman;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.thefinestartist.finestwebview.FinestWebView;

import static com.techease.entekhabman.R.id.url;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        new FinestWebView.Builder(MainActivity.this)
                .showUrl(false)
                .titleDefault("Entekhabman")
                .showIconMenu(false)
                .showIconClose(false)
                .showIconBack(false)
                .backPressToClose(false)
                .show("https://entekhabman.com/")
                ;
        ;

        this.finish();
    }


}

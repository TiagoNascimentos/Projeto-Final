package com.petossauro.android.hadebol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBackPressed() {
        inicio();
    }

    public void historia (View view) {
        setContentView(R.layout.telas);
        setTitle("História");
        WebView content = (WebView) findViewById(R.id.content);
        content.loadUrl("file:///android_asset/historia.html");
    }
    public void notaveis (View view) {
        setContentView(R.layout.telas);
        setTitle("Notáveis");
        WebView content = (WebView) findViewById(R.id.content);
        content.loadUrl("file:///android_asset/notaveis.html");
    }
    public void regras (View view) {
        setContentView(R.layout.telas);
        setTitle("Regras");
        WebView content = (WebView) findViewById(R.id.content);
        content.loadUrl("file:///android_asset/regras.html");
    }
    public void melhores (View view) {
        setContentView(R.layout.telas);
        setTitle("Campeões");
        WebView content = (WebView) findViewById(R.id.content);
        content.loadUrl("file:///android_asset/melhores.html");
    }
    public void inicio() {
        setTitle("Handbal");
        setContentView(R.layout.activity_main);
    }
}

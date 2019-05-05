package com.example.mybrowser;



import android.content.Intent;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

import android.webkit.WebView;

import android.webkit.WebViewClient;



public class MainActivity extends AppCompatActivity {



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        WebView webView = (WebView)findViewById(R.id.wbvw);

        webView.getSettings().setJavaScriptEnabled(true);//让浏览器支持javascript

        webView.setWebViewClient(new WebViewClient());

        Intent intent=getIntent();

        Bundle bundle=intent.getExtras();

        if(bundle!=null) {

            String address=bundle.getString("address");

            webView.loadUrl(address);

        }



    }

}
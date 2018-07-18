package com.project.hackerteam10.dingdong;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    //WebView webView;
    VideoView videoView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), StreamVideo.class);

                startActivity(intent);

                finish();
            }
        });




    }
}


/*
        String imgSrcHtml = "<html><img src='" + url + "' /></html>";

        webView.loadData(imgSrcHtml, "video/html", "UTF-8");
        //webView.setInitialScale(100);
        webView.getSettings().setBuiltInZoomControls(false);

        //webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);

        String url ="165.194.17.13:8080";
        webView.loadUrl(url);
        //String imgSrcHtml = "<html><img src='" + url + "' /></html>";
        // String imgSrcHtml = url;
        //webView.loadData(imgSrcHtml, "text/html", "UTF-8");
        */


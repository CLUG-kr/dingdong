package com.project.hackerteam10.dingdong;
;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class StreamVideo extends AppCompatActivity{

    WebView webView;
    VideoView videoView;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.streamvideo);

        webView =(WebView) findViewById(R.id.videoView);

        /*
        videoView = (android.widget.VideoView) findViewById(R.id.videoView);
        //webView =(WebView) findViewById(R.id.webview);

        MediaController mediaController = new MediaController(StreamVideo.this);
        mediaController.setAnchorView(videoView);

        videoView.setVideoURI(Uri.parse("http://165.194.17.169:8080/javascript_simple.html"));
        //videoView.setVideoURI(Uri.parse("http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4"));
        videoView.requestFocus();
        videoView.start();
        */

        webView.setPadding(50,0,50,0);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(false);
        //webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);

        webView.getSettings().setDefaultZoom(WebSettings.ZoomDensity.FAR);

        webView.setInitialScale(170);

        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });

        Button button = (Button) findViewById(R.id.buttonback);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);

                startActivity(intent);

                finish();
            }
        });

        String url ="http://165.194.17.169:8080/javascript_simple.html";
        //String url = "http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4"; //임시 주소
        webView.loadUrl(url);

    }
}

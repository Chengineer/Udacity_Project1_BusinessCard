package com.example.android.fluentlvproject1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // makes the facebook imageButton a link to FluenTLV facebook page
    public void facebookLink(View view){
        Uri uri = Uri.parse("https://www.facebook.com/FluentLanguageLearning/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    // makes the twitter imageButton a link to FluenTLV twitter page
    public void twitterLink(View view){
        Uri uri = Uri.parse("https://twitter.com/Fluen_TLV");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    // makes the instagram imageButton a link to FluenTLV instagram page
    public void instagramLink(View view){
        Uri uri = Uri.parse("https://www.instagram.com/fluentlv_/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}

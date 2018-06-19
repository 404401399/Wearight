package com.example.eating.wearight;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;

public class UserActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.userhome);
    }
    void buttonOnClick(View view){
        Button button=(Button) view;
        Uri uri=Uri.parse("https://www.niusnews.com/=P2queij5");
        Intent i=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(i);
    }
}
